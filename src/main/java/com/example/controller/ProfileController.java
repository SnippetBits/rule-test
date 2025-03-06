package com.example.controller;

import com.example.model.Customer;
import com.example.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping("/generate-profiles")
    public Customer[] generateProfiles(@RequestBody Customer[] customers) {
        return profileService.processCustomers(customers);
    }
}