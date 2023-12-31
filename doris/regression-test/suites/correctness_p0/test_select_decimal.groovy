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

suite("test_select_decimal") {
//    sql """set enable_date_conversion=false;"""
//    sql """set enable_decimal_conversion=false;"""
//    sql """set disable_decimalv2=false;"""
//    sql """set disable_datev1=false;"""
    qt_select1 'select cast(19888.8999999 as decimal(12,2));'
    qt_select2 'select cast(19888.9999999 as decimal(12,2));'
    qt_select2 'select cast(19888.666 as decimal(12,2));'
    qt_select2 'select cast(19888.444 as decimal(12,2));'
}
