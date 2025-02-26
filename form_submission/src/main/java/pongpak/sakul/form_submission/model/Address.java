package pongpak.sakul.form_submission.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {
  private String addressNumber;
  private String moo;
  private String tambol;
  private String amphoe;
  private String province;
  private String postcode;

  public Address() {

  }

  public Address(String addressNumber, String moo, String tambol, String amphoe, String province, String postcode) {
    this.addressNumber = addressNumber;
    this.moo = moo;
    this.tambol = tambol;
    this.amphoe = amphoe;
    this.province = province;
    this.postcode = postcode;
  }

  public String getAddressNumber() {
    return addressNumber;
  }

  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }

  public String getMoo() {
    return moo;
  }

  public void setMoo(String moo) {
    this.moo = moo;
  }

  public String getTambol() {
    return tambol;
  }

  public void setTambol(String tambol) {
    this.tambol = tambol;
  }

  public String getAmphoe() {
    return amphoe;
  }

  public void setAmphoe(String amphoe) {
    this.amphoe = amphoe;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  @Override
  public String toString() {
    return "Address [addressNumber=" + addressNumber + ", moo=" + moo + ", tambol=" + tambol + ", amphoe=" + amphoe
        + ", province=" + province + ", postcode=" + postcode + "]";
  }

  
}
