package joel.tchoufa.relation1.repository;

import joel.tchoufa.relation1.entities.Medecin;
import joel.tchoufa.relation1.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
