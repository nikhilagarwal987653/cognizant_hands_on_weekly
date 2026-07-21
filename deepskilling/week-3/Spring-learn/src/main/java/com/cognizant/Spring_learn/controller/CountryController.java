package com.cognizant.Spring_learn.controller;

import com.cognizant.Spring_learn.Country;
import com.cognizant.Spring_learn.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    CountryService service;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code){

        return service.getCountry(code);
    }

}