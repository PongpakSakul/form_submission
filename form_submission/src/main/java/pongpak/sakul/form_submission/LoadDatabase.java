package pongpak.sakul.form_submission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pongpak.sakul.form_submission.model.*;

@Configuration
public class LoadDatabase {
  public static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner setupData(RequestRepository repository){
    return args -> {
      System.out.println("LoadDatabase is running...");
      log.info("Saving data...");

      Address address = new Address("123", "5", "Some Tambol", "Some Amphoe", "Some Province", "10110");
      
      Contact contact = new Contact("0987654321", "0123456789");
      
      SubjectInfo subjectInfo = new SubjectInfo("Prof. Brown","CS302", "Intro to CS", "100001", "Prof. Dan" );
      
      PData personalData = new PData("MR.","650000000","Pongpak", "Sakulsathaporn", "3", "Computer Science");

      Request request = new Request("2025-02-16",personalData,address,contact,subjectInfo);

      log.info("loading " + repository.save(request));
    };
  }
}
