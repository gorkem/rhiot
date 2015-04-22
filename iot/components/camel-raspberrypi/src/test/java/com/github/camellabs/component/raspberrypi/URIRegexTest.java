/**
 * Licensed to the Camel Labs under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.camellabs.component.raspberrypi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class URIRegexTest {

    @Test
    public void schemeGPIOTest() {
        Pattern p = Pattern.compile(RaspberryPiConstants.CAMEL_GPIO_URL_PATTERN);
        String url = "raspberrypi-gpio://1";
        Matcher m = p.matcher(url);
        Assert.assertTrue(m.matches());
        Assert.assertEquals("1", m.group("gpioId"));
        Assert.assertEquals("raspberrypi-gpio", m.group("scheme"));
    }

    @Test
    public void schemeI2CTest() {
        Pattern p = Pattern.compile(RaspberryPiConstants.CAMEL_I2C_URL_PATTERN);
        String url = "raspberrypi-i2c://121/12";
        Matcher m = p.matcher(url);
        Assert.assertTrue(m.matches());
        Assert.assertEquals("121", m.group("busId"));
        Assert.assertEquals("12", m.group("deviceId"));
        Assert.assertEquals("raspberrypi-i2c", m.group("scheme"));
    }

}