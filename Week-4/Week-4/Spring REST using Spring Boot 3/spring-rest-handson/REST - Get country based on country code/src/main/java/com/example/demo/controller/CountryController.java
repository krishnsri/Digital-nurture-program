package com.example.demo.controller;

import com.example.demo.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final List<Country> countries = List.of(
            new Country("India", "IN"),
            new Country("United States", "US"),
            new Country("Canada", "CA")
    );

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
