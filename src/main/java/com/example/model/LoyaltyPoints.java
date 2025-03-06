package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoyaltyPoints {
    private int value;
    @JsonProperty("platform_indicator")
    private String platformIndicator;

    // Getters and setters
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public String getPlatformIndicator() { return platformIndicator; }
    public void setPlatformIndicator(String platformIndicator) { this.platformIndicator = platformIndicator; }
}