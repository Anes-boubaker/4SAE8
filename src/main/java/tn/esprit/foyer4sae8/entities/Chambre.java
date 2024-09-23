package tn.esprit.foyer4sae8.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idChambre ;

     long numChambre;
    @Enumerated(EnumType.STRING)
     TypeChambre typeC ;

    @OneToMany(mappedBy = "chambre")
     List<Reservation> reservations;

    @ManyToOne
    @JoinColumn(name = "bloc_id")
     Bloc bloc;




}
