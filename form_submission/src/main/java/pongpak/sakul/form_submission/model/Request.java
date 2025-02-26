package pongpak.sakul.form_submission.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "request")
public class Request {

  private @Id @GeneratedValue Long id;
  private String date;
  
  @Embedded
  private PData pData;

  @Embedded
  private Address address;

  @Embedded
  private Contact contact;

  @Embedded
  private SubjectInfo subjectInfo;

  @ElementCollection
  @CollectionTable(name="request_add_subjects", joinColumns=@JoinColumn(name="request_id"))
  private List<SubjectInfo> addSubjects = new ArrayList<>();

  @ElementCollection
  @CollectionTable(name = "request_drop_subjects", joinColumns = @JoinColumn(name = "request_id"))
  private List<SubjectInfo> dropSubjects = new ArrayList<>();
  
  private String cause;


  Request(){

  }

  
  
  public Request(Long id, String date, PData pData, Address address, Contact contact, List<SubjectInfo> addSubjects,
      List<SubjectInfo> dropSubjects) {
    this.id = id;
    this.date = date;
    this.pData = pData;
    this.address = address;
    this.contact = contact;
    this.addSubjects = addSubjects;
    this.dropSubjects = dropSubjects;
  }



  public Request(String date, PData pData, Address address, Contact contact, SubjectInfo subjectInfo) {
    this.date = date;
    this.pData = pData;
    this.address = address;
    this.contact = contact;
    this.subjectInfo = subjectInfo;
  }


  public Long getId() {
    return id;
  }



  public void setId(Long id) {
    this.id = id;
  }



  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }


}
