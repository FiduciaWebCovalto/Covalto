package com.bancomext.beans;

import java.time.LocalDateTime;

import java.util.Date;

public class FUsuario 
{
  private String id;
  private String password;
  private String fusuNombreUsuario;
  private String fusuStatus;
  private String email;
  private int fperIdPerfil;
  private String fusuImpMaximo;
    private LocalDateTime fusuUltAcceso;

    public void setFusuUltAcceso(LocalDateTime fusuUltAcceso) {
        this.fusuUltAcceso = fusuUltAcceso;
    }

    public LocalDateTime getFusuUltAcceso() {
        return fusuUltAcceso;
    }


    public void setFusuNombreUsuario(String fusuNombreUsuario) {
    this.fusuNombreUsuario = fusuNombreUsuario;
  }


  public String getFusuNombreUsuario() {
    return fusuNombreUsuario;
  }



  public void setFusuStatus(String fusuStatus) {
    this.fusuStatus = fusuStatus;
  }


  public String getFusuStatus() {
    return fusuStatus;
  }


  public void setFusuImpMaximo(String fusuImpMaximo) {
    this.fusuImpMaximo = fusuImpMaximo;
  }


  public String getFusuImpMaximo() {
    return fusuImpMaximo;
  }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void setFperIdPerfil(int fperIdPerfil)
  {
    this.fperIdPerfil = fperIdPerfil;
  }


  public int getFperIdPerfil()
  {
    return fperIdPerfil;
  }


}