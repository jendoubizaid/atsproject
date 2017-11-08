#!/usr/bin/env python
import sys, urllib2, json, pymongo
from pymongo import MongoClient
from bson import json_util
myurl = "http://internal.ats-digital.com:3066/api/products"
response = urllib2.urlopen(myurl)
data = json_util.loads(response.read())
client = MongoClient('localhost', 27017)
db = client.ats
products = db.products
result = products.insert_many(data)
