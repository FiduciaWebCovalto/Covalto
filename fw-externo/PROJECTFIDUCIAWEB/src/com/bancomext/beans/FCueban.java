package com.bancomext.beans;

public class FCueban  

{
  private String fcbaNumeroCtaBan;
  private int fcbaBanco;
  private String fcbaDescBanco;
  private String fcbaPlazaCba;
  private String fcbaClabeCba;
  private String fcbaRfc;
  private String fcbaTitular;
  private String fcbaStatus;
  private String fcbaFechaCaptura;


  public void setFcbaBanco(int fcbaBanco) {
    this.fcbaBanco = fcbaBanco;
  }


  public int getFcbaBanco() {
    return fcbaBanco;
  }


  public void setFcbaPlazaCba(String fcbaPlazaCba) {
    this.fcbaPlazaCba = fcbaPlazaCba==null?"":fcbaPlazaCba;
  }


  public String getFcbaPlazaCba() {
    return fcbaPlazaCba;
  }


  public void setFcbaClabeCba(String fcbaClabeCba) {    
    this.fcbaClabeCba = fcbaClabeCba==null?"":fcbaClabeCba;
  }


  public String getFcbaClabeCba() {
    return fcbaClabeCba;
  }


  public void setFcbaRfc(String fcbaRfc) {
    this.fcbaRfc = fcbaRfc;
  }


  public String getFcbaRfc() {
    return fcbaRfc;
  }


  public void setFcbaTitular(String fcbaTitular) {
    this.fcbaTitular = fcbaTitular==null?"":fcbaTitular;
  }


  public String getFcbaTitular() {
    return fcbaTitular;
  }


  public void setFcbaStatus(String fcbaStatus) {
    this.fcbaStatus = fcbaStatus==null?"":fcbaStatus;
  }


  public String getFcbaStatus() {
    return fcbaStatus;
  }


  public void setFcbaDescBanco(String fcbaDescBanco)
  {
    this.fcbaDescBanco = fcbaDescBanco;
  }


  public String getFcbaDescBanco()
  {
    return fcbaDescBanco;
  }


  public void setFcbaFechaCaptura(String fcbaFechaCaptura)
  {
    this.fcbaFechaCaptura = fcbaFechaCaptura==null?"":fcbaFechaCaptura;
  }


  public String getFcbaFechaCaptura()
  {
    return fcbaFechaCaptura;
  }


  public void setFcbaNumeroCtaBan(String fcbaNumeroCtaBan)
  {
    this.fcbaNumeroCtaBan = fcbaNumeroCtaBan;
  }


  public String getFcbaNumeroCtaBan()
  {
    return fcbaNumeroCtaBan;
  }
}