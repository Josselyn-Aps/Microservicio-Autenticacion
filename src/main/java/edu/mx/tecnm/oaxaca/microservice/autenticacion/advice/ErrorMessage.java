/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.microservice.autenticacion.advice;

import java.util.Date;

/**
 *
 * @author JOSELYNE
 */
public class ErrorMessage {
  private int statusCode;
  private Date timestamp;
  private String message;
  private String description;

  public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
    this.statusCode = statusCode;
    this.timestamp = timestamp;
    this.message = message;
    this.description = description;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDescription() {
    return description;
  }
}
