/**
 * Licensed to the Rhiot under one or more
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
package io.rhiot.component.gps.gpsd.converter;

import io.rhiot.component.gps.gpsd.ClientGpsCoordinates;
import org.apache.camel.Converter;

@Converter
public class ClientGpsCoordinatesConverter {

    @Converter
    public static String toString(ClientGpsCoordinates clientGpsCoordinates) {
        return clientGpsCoordinates.serialize();
    }
    
    @Converter
    public static ClientGpsCoordinates toClientGpsCoordinates(String serializedCoordinates) {
        return ClientGpsCoordinates.deserialize(serializedCoordinates);
    }
}
