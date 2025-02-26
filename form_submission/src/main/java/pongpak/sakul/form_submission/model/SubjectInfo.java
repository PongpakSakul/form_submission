package pongpak.sakul.form_submission.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class SubjectInfo implements Serializable{
  private String advisor;
  private String subjectCode;
  private String subjectName;
  private String subjectSection;
  private String subjectInstructor;

  public SubjectInfo() {

  }

  public SubjectInfo(String advisor, String subjectCode, String subjectName, String subjectSection,
     String subjectInstructor) {
    this.advisor = advisor;
    this.subjectCode = subjectCode;
    this.subjectName = subjectName;
    this.subjectSection = subjectSection;
    this.subjectInstructor = subjectInstructor;
  }

  public String getAdvisor() {
    return advisor;
  }

  public void setAdvisor(String advisor) {
    this.advisor = advisor;
  }

  public String getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(String subjectCode) {
    this.subjectCode = subjectCode;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public String getSubjectSection() {
    return subjectSection;
  }

  public void setSubjectSection(String subjectSection) {
    this.subjectSection = subjectSection;
  }

  public String getSubjectInstructor() {
    return subjectInstructor;
  }

  public void setSubjectInstructor(String subjectInstructor) {
    this.subjectInstructor = subjectInstructor;
  }

  @Override
  public String toString() {
    return "SubjectInfo [advisor=" + advisor + ", subjectCode=" + subjectCode + ", subjectName=" + subjectName
        + ", subjectSection=" + subjectSection + ", subjectInstructor=" + subjectInstructor + "]";
  }

  
  
  
}
