package joel.tchoufa.relation1.repository;

import joel.tchoufa.relation1.entities.Consultation;
import joel.tchoufa.relation1.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
