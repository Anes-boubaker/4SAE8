package tn.esprit.foyer4sae8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;

    String nomEt ;
    String prenomEt;
    long cin ;
    String ecole;
    Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;

}
