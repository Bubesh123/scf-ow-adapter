package com.example;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.gson.JsonObject;
import com.ibm.openwhisk.scf.demo.ScfDemo2;
import com.ibm.openwhisk.scf.demo.ScfOpenwhiskAdapterBean;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple function.
 */
public class ScfDemo2Test {
  @Test
  public void testFunction() {
    JsonObject args = new JsonObject();
    args.addProperty("name", "TestValue");
    JsonObject response = ScfOpenwhiskAdapterBean.main(args);
    assertNotNull(response);
    String greetings = response.getAsJsonPrimitive("greetings").getAsString();
    assertNotNull(greetings);
    assertEquals("Welcome to Spring Cloud Function ScfDemo2", greetings);
  }
}
