package com.bighouse.GeoKeyAPI.domain.Locales;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "countries")
@Entity(name = "Country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int phoneCode;
    private String emoji;
    private String currency;
    private String currencySymbol;
}
