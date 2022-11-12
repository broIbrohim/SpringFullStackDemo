package uz.pdp.springfullstack.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import uz.pdp.springfullstack.dto.CountryDto;
import uz.pdp.springfullstack.entity.Continent;
import uz.pdp.springfullstack.entity.Country;
import uz.pdp.springfullstack.exception.ResourceNotFoundException;
import uz.pdp.springfullstack.repository.ContinentRepo;
import uz.pdp.springfullstack.repository.CountryRepo;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CountryService {
    private final CountryRepo countryRepo;
    private final ContinentRepo continentRepo;


    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }


    public void saveCountry(CountryDto countryDto) {
        Continent continent = continentRepo.findById(countryDto.getContinentId()).orElseThrow(()
                -> new ResourceNotFoundException("Continent topilmadi "));
        countryRepo.save(Country.builder()
                .id(countryDto.getId())
                        .name(countryDto.getName())
                        .continent(continent)
                .build());
    }

}
