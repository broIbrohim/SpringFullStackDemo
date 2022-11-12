package uz.pdp.springfullstack.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountryDto {

    private  Integer id;
    private String name;
    private Integer continentId;


}
