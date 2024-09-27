package com.bighouse.GeoKeyAPI.domain.Locales;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "states")
@Entity(name = "State")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String countryName;
    private Long countryId;
}
