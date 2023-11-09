// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/* ******* Do not commit this file unless you know what you are doing ******* */

// **Note**: default db will be create if not exist
defaultDb = "regression_test"

jdbcUrl = "jdbc:mysql://172.30.0.37:9330/?useLocalSessionState=true&allowLoadLocalInfile=true"
jdbcUser = "root"
jdbcPassword = ""

feHttpAddress = "172.30.0.37:8330"
feHttpUser = "root"
feHttpPassword = ""

beHttpAddress = "172.30.0.37:8340"

// set DORIS_HOME by system properties
// e.g. java -DDORIS_HOME=./
suitePath = "${DORIS_HOME}/regression-test/suites"
dataPath = "${DORIS_HOME}/regression-test/data"

//exclude groups and exclude suites is more prior than include groups and include suites.
excludeDirectories = "github_events,tpcds_sf1000,usercases/BS"
excludeTestGroups = ""
excludeTestSuites = "test_string_function_like_pushdown"

// will test <group>/<suite>.groovy
// empty group will test all group
testGroups = ""
// empty suite will test all suite
testSuites = ""
// empty directories will test all directories
testDirectories = ""

customConf1 = "test_custom_conf_value"

// for test csv with header
enableHdfs=false // set to true if hdfs is ready
hdfsFs = "hdfs://127.0.0.1:9000"
hdfsUser = "doris-test"
hdfsPasswd = ""
brokerName = "broker_name"

customConf1 = "test_custom_conf_value"
s3Endpoint = "cos.ap-beijing.myqcloud.com"
s3BucketName = "doris-build-1308700295"
ak = "AKIDAE2aqpY0B7oFPIvHMBj01lFSO3RYOxFH"
sk = "nJYWDepkQqzrWv3uWsxlJ0ScV7SXLs88"
sf1DataPath = "http://doris-build-1308700295.cos.ap-beijing.myqcloud.com/regression"
