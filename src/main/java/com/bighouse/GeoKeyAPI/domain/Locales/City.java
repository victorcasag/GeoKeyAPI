package com.bighouse.GeoKeyAPI.domain.Locales;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "cities")
@Entity(name = "City")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String countryName;
    private String stateName;
}
