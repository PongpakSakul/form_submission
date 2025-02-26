package pongpak.sakul.form_submission.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class PData implements Serializable {
  private String prefix;
  private String studentID;
  private String firstName;
  private String lastName;
  private String academicYear;
  private String field;

  public PData() {

  }

  public PData(String prefix, String studentID, String firstName, String lastName, String academicYear, String field) {
    this.prefix = prefix;
    this.studentID = studentID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.academicYear = academicYear;
    this.field = field;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAcademicYear() {
    return academicYear;
  }

  public void setAcademicYear(String academicYear) {
    this.academicYear = academicYear;
  }

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  @Override
  public String toString() {
    return "PData [prefix=" + prefix + ", studentID=" + studentID + ", firstName=" + firstName + ", lastName="
        + lastName + ", academicYear=" + academicYear + ", field=" + field + "]";
  }
}
