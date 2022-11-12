package uz.pdp.springfullstack.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uz.pdp.springfullstack.dto.CountryDto;
import uz.pdp.springfullstack.entity.Country;
import uz.pdp.springfullstack.payload.ApiResponse;
import uz.pdp.springfullstack.service.CountryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/countries")
public class CountryController {
    private  final CountryService countryService;
    @GetMapping
    public HttpEntity<?> getAllCountries () {
        List<Country> countryList =countryService.getAllCountries();

      return ResponseEntity.ok(new ApiResponse("success",true,countryList));
    }

    @PostMapping
    public  HttpEntity<?> saveCountry (@RequestBody CountryDto countryDto) {
        countryService.saveCountry(countryDto);
        return ResponseEntity.ok(new ApiResponse("success",true));
    }

}
