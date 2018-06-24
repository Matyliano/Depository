package pl.sda.scrum.magazyn.magazyn.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data   // nie trzeba tworzyć getterów, setterów i tych wszystkich dupereli
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepositoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @NotBlank
    @Column(name = "name", unique = true)
    String name;

    @NotNull
    Long quantity;
}
