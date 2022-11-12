package uz.pdp.springfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springfullstack.entity.Country;

public interface CountryRepo  extends JpaRepository<Country,Integer> {

}
