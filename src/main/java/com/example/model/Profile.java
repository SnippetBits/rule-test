package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    @JsonProperty("profile_type")
    private String profileType;
    private String companyName;
    private String taxId;
    private String contactName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;
    private Integer transactionVolume;
    private LoyaltyPoints loyaltyPoints;
    @JsonProperty("source_system")
    private String sourceSystem;
    @JsonProperty("user_identifiers")
    private List<Identifier> userIdentifiers = new ArrayList<>();

    public Profile() {}
    public Profile(String profileType) { this.profileType = profileType; }

    // Getters and setters
    public String getProfileType() { return profileType; }
    public void setProfileType(String profileType) { this.profileType = profileType; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }
    public String getContactName() { return contactName; }
    public void setContactName(String contactName) { this.contactName = contactName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
    public Integer getTransactionVolume() { return transactionVolume; }
    public void setTransactionVolume(Integer transactionVolume) { this.transactionVolume = transactionVolume; }
    public LoyaltyPoints getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(LoyaltyPoints loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
    public String getSourceSystem() { return sourceSystem; }
    public void setSourceSystem(String sourceSystem) { this.sourceSystem = sourceSystem; }
    public List<Identifier> getUserIdentifiers() { return userIdentifiers; }
    public void setUserIdentifiers(List<Identifier> userIdentifiers) { this.userIdentifiers = userIdentifiers; }
}