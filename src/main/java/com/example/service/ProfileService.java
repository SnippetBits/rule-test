package com.example.service;

import com.example.model.Customer;
import com.example.model.Identifier;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileService {
    @Autowired
    private KieContainer kieContainer;

    public Customer[] processCustomers(Customer[] customers) {
        KieSession kieSession = kieContainer.newKieSession();
        for (Customer customer : customers) {
            kieSession.insert(customer);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
        return customers;
    }

    // Helper function called from DRL
    public static List<Identifier> filterIdentifiers(List<Identifier> identifiers, String type) {
        List<String> b2bKeys = Arrays.asList("alibaba_supplier_id", "tax_id", "business_contact_email");
        List<String> b2cKeys = Arrays.asList("amazon_customer_id", "prime_membership_id");
        List<String> c2cKeys = Arrays.asList("ebay_user_id", "seller_rating", "paypal_email");

        switch (type) {
            case "b2b":
                return identifiers.stream().filter(id -> b2bKeys.contains(id.getKey())).collect(Collectors.toList());
            case "b2c":
                return identifiers.stream().filter(id -> b2cKeys.contains(id.getKey())).collect(Collectors.toList());
            case "c2c":
                return identifiers.stream().filter(id -> c2cKeys.contains(id.getKey())).collect(Collectors.toList());
            default:
                return new ArrayList<>();
        }
    }
}