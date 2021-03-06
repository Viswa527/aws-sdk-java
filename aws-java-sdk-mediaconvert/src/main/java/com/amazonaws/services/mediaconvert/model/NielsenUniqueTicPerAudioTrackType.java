/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * To create assets that have the same TIC values in each audio track, keep the default value Share TICs
 * (SAME_TICS_PER_TRACK). To create assets that have unique TIC values for each audio track, choose Use unique TICs
 * (RESERVE_UNIQUE_TICS_PER_TRACK).
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NielsenUniqueTicPerAudioTrackType {

    RESERVE_UNIQUE_TICS_PER_TRACK("RESERVE_UNIQUE_TICS_PER_TRACK"),
    SAME_TICS_PER_TRACK("SAME_TICS_PER_TRACK");

    private String value;

    private NielsenUniqueTicPerAudioTrackType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return NielsenUniqueTicPerAudioTrackType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NielsenUniqueTicPerAudioTrackType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NielsenUniqueTicPerAudioTrackType enumEntry : NielsenUniqueTicPerAudioTrackType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
