#!/usr/bin/python
import json
import requests
import argparse
def useast():
        return "amazon.cloud.region.key.1"
def euwest():
        return "amazon.cloud.region.key.4"
def west2():
        return "amazon.cloud.region.key.2"
def west1():
        return "amazon.cloud.region.key.3"
def aps1():
        return "amazon.cloud.region.key.5"
def aps2():
        return "amazon.cloud.region.key.8"
def apn1():
        return "amazon.cloud.region.key.6"
def sa1():
        return "amazon.cloud.region.key.7"
parser = argparse.ArgumentParser()
parser.add_argument('--akey', action='store', dest='akey')
parser.add_argument('--skey', action='store', dest='skey')
parser.add_argument('--dsmuser', action='store', dest='dsmuser')
parser.add_argument('--dsmpass', action='store', dest='dsmpass')
parser.add_argument('--dsmip', action='store', dest='dsmip')
parser.add_argument('--region', action='store', dest='region')
results = parser.parse_args()
regions = {"us-east-1" : useast, "eu-west-1" : euwest, "us-west-2" : west2, "us-west-1" : west1, "ap-southeast-1" : aps1, "ap-southeast-2" : aps2, "ap-northeast-1" : apn1, "sa-east-1" : sa1}
data = json.dumps({"dsCredentials":{"password": results.dsmpass ,"userName": results.dsmuser}})
login = requests.post("https://" + results.dsmip + "/rest/authentication/login", data, headers = {'Content-type': 'application/json'}, verify=False)
sid = login.text

print "Performing REST login to DSM, login status_code:"+ str(login.status_code) + "\nLogin sID="+ sid
data1 = json.dumps({"createCloudAccountRequest":{"cloudAccountElement":{"accessKey":results.akey,"secretKey":results.skey,"cloudRegion": regions[results.region](),"cloudType": "AMAZON","description":"TEST", "name": results.region},"sessionId": sid}} )
cloud = requests.post("https://" + results.dsmip + "/rest/cloudaccounts", data1, headers = {'Content-type': 'application/json'}, verify=False)
print "create cloud status:"+ str(cloud.status_code) + " output message:" + cloud.text

#done.

