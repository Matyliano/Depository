package pl.sda.scrum.magazyn.magazyn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.scrum.magazyn.magazyn.model.DepositoryModel;

@Repository
public interface DepositoryRepository extends JpaRepository<DepositoryModel, Long> {

}
