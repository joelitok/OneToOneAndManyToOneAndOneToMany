package joel.tchoufa.relation1.repository;

import joel.tchoufa.relation1.entities.Medecin;
import joel.tchoufa.relation1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {

    Optional<Medecin> findMedecinByNom(String name);
}
