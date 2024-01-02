package joel.tchoufa.relation1;

import joel.tchoufa.relation1.entities.Consultation;
import joel.tchoufa.relation1.entities.Medecin;
import joel.tchoufa.relation1.entities.Patient;
import joel.tchoufa.relation1.entities.RendezVous;
import joel.tchoufa.relation1.enums.StatusRDV;
import joel.tchoufa.relation1.repository.ConsultationRepository;
import joel.tchoufa.relation1.repository.MedecinRepository;
import joel.tchoufa.relation1.repository.PatientRepository;
import joel.tchoufa.relation1.repository.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Relation1Application {

    public static void main(String[] args) {
        SpringApplication.run(Relation1Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository,
                            ConsultationRepository consultationRepository

    ) {
        return args -> {
            Stream.of("Mohamed", "Hassan", "Najat")
                    .forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        patientRepository.save(patient);
                    });

            Stream.of("aymane", "hane", "yasmine")
                    .forEach(name -> {
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name + "@gmail.com");
                        medecin.setSpecialite(Math.random() > 0.5 ? "Cardio" : "Dentiste");
                    });

            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient1 = patientRepository.findPatientByNom("Mohamed").orElse(null);
            Medecin medecin = medecinRepository.findMedecinByNom("hane").orElse(null);

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatusRDV(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVousRepository.save(rendezVous);

            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de la consultation");
            consultationRepository.save(consultation);
        };
    }

}
