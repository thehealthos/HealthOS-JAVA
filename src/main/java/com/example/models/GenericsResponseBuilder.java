/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class GenericsResponseBuilder {
    //the instance to build
    private GenericsResponse genericsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GenericsResponseBuilder() {
        genericsResponse = new GenericsResponse();
    }

    public GenericsResponseBuilder name(String name) {
        genericsResponse.setName(name);
        return this;
    }

    public GenericsResponseBuilder genericId(String genericId) {
        genericsResponse.setGenericId(genericId);
        return this;
    }

    public GenericsResponseBuilder theraupticUses(List<String> theraupticUses) {
        genericsResponse.setTheraupticUses(theraupticUses);
        return this;
    }

    public GenericsResponseBuilder searchScore(double searchScore) {
        genericsResponse.setSearchScore(searchScore);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GenericsResponse build() {
        return genericsResponse;
    }
}