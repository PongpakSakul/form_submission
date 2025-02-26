package pongpak.sakul.form_submission.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contact implements Serializable {
  private String phone;
  private String telephone;

  public Contact() {

  }

  public Contact(String phone, String telephone) {
    this.phone = phone;
    this.telephone = telephone;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  @Override
  public String toString() {
    return "Contact [phone=" + phone + ", telephone=" + telephone + "]";
  }

  

}
