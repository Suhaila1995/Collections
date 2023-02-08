package com.suhaila.employeesort;

public class EmployeeOne {
  
  private int id;
  private String firstName;
  private String lastName;
  
  
  
  public EmployeeOne(int id, String firstName, String lastName) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
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
  @Override
  public String toString() {
    return "EmployeeOne [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }
  
  
  

}