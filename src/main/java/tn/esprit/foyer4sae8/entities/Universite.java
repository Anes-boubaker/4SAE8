package tn.esprit.foyer4sae8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idUniversite;

     String nomUniversite;
    String adresse;

    @OneToOne
    @JoinColumn(name = "foyer_id")
     Foyer foyer;

}
