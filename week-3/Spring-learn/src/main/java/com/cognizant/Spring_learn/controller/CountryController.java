package com.cognizant.Spring_learn.controller;

import com.cognizant.Spring_learn.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getcountry(){
        Country country= new Country();
        country.setCode("IN");
        country.setName("India");
        return country;
    }
}
