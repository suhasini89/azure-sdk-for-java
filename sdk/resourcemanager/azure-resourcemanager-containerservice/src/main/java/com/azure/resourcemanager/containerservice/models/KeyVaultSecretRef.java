// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyVaultSecretRef model. */
@Fluent
public final class KeyVaultSecretRef {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultSecretRef.class);

    /*
     * Key vault identifier.
     */
    @JsonProperty(value = "vaultID", required = true)
    private String vaultId;

    /*
     * The secret name.
     */
    @JsonProperty(value = "secretName", required = true)
    private String secretName;

    /*
     * The secret version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the vaultId property: Key vault identifier.
     *
     * @return the vaultId value.
     */
    public String vaultId() {
        return this.vaultId;
    }

    /**
     * Set the vaultId property: Key vault identifier.
     *
     * @param vaultId the vaultId value to set.
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * Get the secretName property: The secret name.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The secret name.
     *
     * @param secretName the secretName value to set.
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the version property: The secret version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The secret version.
     *
     * @param version the version value to set.
     * @return the KeyVaultSecretRef object itself.
     */
    public KeyVaultSecretRef withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vaultId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property vaultId in model KeyVaultSecretRef"));
        }
        if (secretName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property secretName in model KeyVaultSecretRef"));
        }
    }
}
