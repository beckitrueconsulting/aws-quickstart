#!/usr/bin/python
import boto.rds2
import boto.ec2
import argparse
import json
import requests
import sys
from boto.exception import JSONResponseError
parser = argparse.ArgumentParser()
parser.add_argument('--region', action='store', dest='region')
parser.add_argument('--waitsig', action='store', dest='wait')
parser.add_argument('--instance', action='store', dest='instance')
parser.add_argument('--name', action='store',dest='name')
results = parser.parse_args()
REGION =  results.region
WAITURL = results.wait
INSTANCE = results.instance
NAME = results.name
try:
	rds = boto.rds2.connect_to_region(REGION)
	ec2 = boto.ec2.connect_to_region(REGION)
#create rds subnet and option group - enabling Mirroring to allow for MultiAZ MSSQL Deployments
	rds_option_group = rds.create_option_group(NAME, "sqlserver-se", "11.00", option_group_description="MSSQL Option Group with Mirroring")
#	rds.modify_option_group(option_group_name=NAME, options_to_include=[{'Mirroring'}],apply_immediately=True)
except JSONResponseError, e:
	print str(e.body['Error']['Message'])
	payload = { 'Status' : 'FAILURE' ,'Reason' : str(e.body['Error']['Message']),  'UniqueId' : 'CreateOptionGrp' , 'Data' :   str(e.body['Error']['Message'])  }
	r = requests.put(WAITURL, data=json.dumps(payload), headers={"Content-Type" : ""}, verify=True)
	sys.exit(1)
payload = { 'Status' : 'SUCCESS' ,'Reason' : 'Option Group Created',  'UniqueId' : 'CreateOptionGrp' , 'Data' : 'Success' }
r = requests.put(WAITURL, data=json.dumps(payload), headers={"Content-Type" : ""}, verify=True)
ec2.terminate_instances(INSTANCE)  
sys.exit(0)
	



