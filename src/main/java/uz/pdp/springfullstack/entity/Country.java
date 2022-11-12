package uz.pdp.springfullstack.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "countries")
public class Country {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)


    private Integer id;

    private  String name ;

    @ManyToOne
    private Continent continent;


}
