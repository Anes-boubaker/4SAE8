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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idBloc;

     String nomBloc;
     Long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "foyer_id")
     Foyer foyer;

    @OneToMany(mappedBy = "bloc")
     List<Chambre> chambres;
}
