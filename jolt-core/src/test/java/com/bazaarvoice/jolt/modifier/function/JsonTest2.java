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

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

public class JsonTest2 {


    final static String input5="{\n" +
            "  \"rating\": {\n" +
            "    \"primary\": {\n" +
            "      \"value\": 3\n" +
            "    },\n" +
            "    \"quality\": {\n" +
            "      \"value\": 4\n" +
            "    }\n" +
            "  }\n" +
            "}";


    final static String spec5 = "[\n" +
            "  {\n" +
            "    \"operation\": \"modify-overwrite-beta\",\n" +
            "    \"spec\": {\n" +
            "      \"rating\": \"=toJsonString\"\n" +
            "    }\n" +
            "  }\n" +
            "]\n";

    final static String input6="{\n" +
            "  \"rating\": [\n" +
            "    {\n" +
            "      \"primary\": {\n" +
            "        \"value\": 3\n" +
            "      },\n" +
            "      \"quality\": {\n" +
            "        \"value\": 3\n" +
            "      }\n" +
            "    }\n" +
            "  ]\n" +
            "}";


    final static String spec6 = "[\n" +
            "  {\n" +
            "    \"operation\": \"modify-overwrite-beta\",\n" +
            "    \"spec\": {\n" +
            "      \"rating\": \"=toJsonString\"\n" +
            "    }\n" +
            "  }\n" +
            "]\n";



    public static void main(String[] args) {
        Chainr s5 = Chainr.fromSpec(JsonUtils.jsonToList(spec5) );
        Object output5 = s5.transform( JsonUtils.jsonToObject(input5) );
        System.out.println(JsonUtils.toJsonString(output5));

        Chainr s6 = Chainr.fromSpec(JsonUtils.jsonToList(spec6) );
        Object output6 = s6.transform( JsonUtils.jsonToObject(input6) );
        System.out.println(JsonUtils.toJsonString(output6));
    }
}
