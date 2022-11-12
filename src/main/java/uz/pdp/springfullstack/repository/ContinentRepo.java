package uz.pdp.springfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.springfullstack.entity.Continent;

public interface ContinentRepo  extends JpaRepository<Continent,Integer> {
}
