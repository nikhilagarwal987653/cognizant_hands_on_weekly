package com.cognizant.Spring_learn.Service;

import com.cognizant.Spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    public Country getCountry(String code) {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);
        if (country.getCode().equalsIgnoreCase(code)) return country;
    return null;
    }
}