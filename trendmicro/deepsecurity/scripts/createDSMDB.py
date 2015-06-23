#!/usr/bin/python
import pymssql
import argparse

## take database endpoint, username and password as commandline args

parser = argparse.ArgumentParser()
parser.add_argument('--endpoint', action='store', dest='endpoint')
parser.add_argument('--user', action='store', dest='dbuser')
parser.add_argument('--pass', action='store', dest='dbpass')
args = parser.parse_args()

conn = pymssql.connect(args.endpoint, args.dbuser, args.dbpass)
conn.autocommit(True)
cursor = conn.cursor()
cursor.execute("CREATE DATABASE DSM")
conn.close()
#done




