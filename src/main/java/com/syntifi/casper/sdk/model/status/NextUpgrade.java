package com.syntifi.casper.sdk.model.status;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Information about the next scheduled upgrade
 * 
 * @author Alexandre Carvalho
 * @author Andre Bertolace
 * @since 0.0.1
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NextUpgrade {

    /**
     * @see ActivationPoint
     */
    @JsonProperty("activation_point")
    private ActivationPoint activationPoint;

    /**
     * Protocol version
     */
    @JsonProperty("protocol_version")
    private String protocolVersion;
}