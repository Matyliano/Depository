package pl.sda.scrum.magazyn.magazyn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data   // nie trzeba tworzyć getterów, setterów i tych wszystkich dupereli
@NoArgsConstructor
@AllArgsConstructor
public class DepositoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @NotBlank
    String name;

    @NotNull
    Long quantity;
}
