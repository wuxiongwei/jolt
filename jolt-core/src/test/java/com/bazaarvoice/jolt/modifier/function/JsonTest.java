/*
 * Copyright 2013 Bazaarvoice, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bazaarvoice.jolt.modifier.function;

import com.bazaarvoice.jolt.JsonUtils;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings( "deprecated" )
public class JsonTest extends AbstractTester {

    @DataProvider(parallel = true)
    public Iterator<Object[]> getTestCases() {
        List<Object[]> testCases = new LinkedList<>(  );

//        Function TO_JSON_STRING = new Objects.toJsonString();


        System.out.println(JsonUtils.toJsonString(arg));

        return testCases.iterator();
    }

    static String arg = "{ \"rating\": {   \"primary\": {    \"value\": 3   },   \"quality\": {      \"value\": 3    }  }}";

}
