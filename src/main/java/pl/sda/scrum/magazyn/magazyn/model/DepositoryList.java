package pl.sda.scrum.magazyn.magazyn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data   // nie trzeba tworzyć getterów, setterów i tych wszystkich dupereli
@NoArgsConstructor
@AllArgsConstructor
public class DepositoryList {

    @OneToMany(mappedBy = "DepositoryModel")
    List<DepositoryModel> depositoryList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

}
