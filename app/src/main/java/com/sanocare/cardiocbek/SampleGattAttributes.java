/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sanocare.cardiocbek;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */

/**
 * @author zhongzhigang
 *         created at 2017/11/10
 * @file_name SampleGattAttributes.java
 * @description: UUID
 */
public class SampleGattAttributes {
    /**
     * cardiochek 设备UUID
     */
    public static String UUID_SERVICE_CARDIOCHEK = "0000fff0-0000-1000-8000-00805f9b34fb";
    public static String UUID_CHARACTERISTIC_CARDIOCHEK = "0000fff4-0000-1000-8000-00805f9b34fb";
    public static String UUID_DESCRIPTOR_CARDIOCHEK = "00002902-0000-1000-8000-00805f9b34fb";

}