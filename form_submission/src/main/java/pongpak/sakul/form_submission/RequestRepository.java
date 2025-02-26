package pongpak.sakul.form_submission;

import pongpak.sakul.form_submission.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long>{

}
