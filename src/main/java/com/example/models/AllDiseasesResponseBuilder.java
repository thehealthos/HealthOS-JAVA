/*
 * HealthOSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.example.models;

import java.util.*;

public class AllDiseasesResponseBuilder {
    //the instance to build
    private AllDiseasesResponse allDiseasesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public AllDiseasesResponseBuilder() {
        allDiseasesResponse = new AllDiseasesResponse();
    }

    public AllDiseasesResponseBuilder diseaseName(String diseaseName) {
        allDiseasesResponse.setDiseaseName(diseaseName);
        return this;
    }

    public AllDiseasesResponseBuilder diseaseCat(String diseaseCat) {
        allDiseasesResponse.setDiseaseCat(diseaseCat);
        return this;
    }

    public AllDiseasesResponseBuilder diseaseInfo(String diseaseInfo) {
        allDiseasesResponse.setDiseaseInfo(diseaseInfo);
        return this;
    }

    public AllDiseasesResponseBuilder diseaseId(String diseaseId) {
        allDiseasesResponse.setDiseaseId(diseaseId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AllDiseasesResponse build() {
        return allDiseasesResponse;
    }
}