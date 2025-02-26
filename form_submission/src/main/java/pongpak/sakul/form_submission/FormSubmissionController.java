package pongpak.sakul.form_submission;

import java.util.List;

import pongpak.sakul.form_submission.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormSubmissionController {

  private final RequestRepository repository;

  public FormSubmissionController(RequestRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/form")
  List<Request> findAll() {
    return repository.findAll();
  }

  
  

}
