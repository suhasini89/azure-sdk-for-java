// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Plan model.
 */
@Fluent
public final class Plan {
    /*
     * The plan ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The publisher ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The offer ID.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * The promotion code.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /*
     * The plan's version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the name property: The plan ID.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The plan ID.
     * 
     * @param name the name value to set.
     * @return the Plan object itself.
     */
    public Plan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher property: The publisher ID.
     * 
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher ID.
     * 
     * @param publisher the publisher value to set.
     * @return the Plan object itself.
     */
    public Plan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: The offer ID.
     * 
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: The offer ID.
     * 
     * @param product the product value to set.
     * @return the Plan object itself.
     */
    public Plan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotionCode property: The promotion code.
     * 
     * @return the promotionCode value.
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode property: The promotion code.
     * 
     * @param promotionCode the promotionCode value to set.
     * @return the Plan object itself.
     */
    public Plan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the version property: The plan's version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The plan's version.
     * 
     * @param version the version value to set.
     * @return the Plan object itself.
     */
    public Plan withVersion(String version) {
        this.version = version;
        return this;
    }
}
