package joel.tchoufa.relation1.services;

import joel.tchoufa.relation1.entities.Consultation;
import joel.tchoufa.relation1.entities.Medecin;
import joel.tchoufa.relation1.entities.Patient;
import joel.tchoufa.relation1.entities.RendezVous;
import joel.tchoufa.relation1.repository.ConsultationRepository;
import joel.tchoufa.relation1.repository.MedecinRepository;
import joel.tchoufa.relation1.repository.PatientRepository;
import joel.tchoufa.relation1.repository.RendezVousRepository;
import joel.tchoufa.relation1.services.IHospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class IHospitalServiceImpl implements IHospitalService {

    private final PatientRepository patientRepository;
    private final MedecinRepository medecinRepository;
    private final RendezVousRepository rendezVousRepository;
    private final ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
