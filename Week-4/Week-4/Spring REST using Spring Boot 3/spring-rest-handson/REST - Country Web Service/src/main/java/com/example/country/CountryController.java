package com.example.country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController {

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        if ("IN".equalsIgnoreCase(code)) {
            return new Country("India", "IN");
        } else if ("US".equalsIgnoreCase(code)) {
            return new Country("United States", "US");
        }
        return new Country("Unknown", code);
    }
}