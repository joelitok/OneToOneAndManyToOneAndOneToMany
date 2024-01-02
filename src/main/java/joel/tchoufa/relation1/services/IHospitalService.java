package joel.tchoufa.relation1.services;

import joel.tchoufa.relation1.entities.Consultation;
import joel.tchoufa.relation1.entities.Medecin;
import joel.tchoufa.relation1.entities.Patient;
import joel.tchoufa.relation1.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
