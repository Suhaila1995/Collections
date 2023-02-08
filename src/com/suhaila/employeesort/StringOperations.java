package com.suhaila.employeesort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {

  public static void main(String[] args) {
    
    
    List<EmployeeOne> empList = new ArrayList<>();
    
    empList.add(new EmployeeOne(102,"Babu","Arun"));
    empList.add(new EmployeeOne(101,"Arun","Babu"));
    empList.add(new EmployeeOne(103,"Charles","Bobage"));
    empList.add(new EmployeeOne(104,"Newton","Raj"));
    empList.add(new EmployeeOne(105,"Babu","Santhosh"));
    
    List<EmployeeOne> resutList = empList.stream().sorted(new FirstLastNameComparator()).collect(Collectors.toList());
    
    resutList.stream().forEach(System.out::println);
    /*
     * String str ="A!@#B$C%D^T&U*VWX";
     * 
     * StringBuilder builder = new StringBuilder(); char arr[] = str.toCharArray(); char result[] =
     * new char[arr.length];
     * 
     * for(int i=arr.length-1;i>=0;i--) {
     * 
     * if(Character.isAlphabetic(arr[i])) { builder.append(arr[i]); } else { builder.append(arr[i]);
     * }
     * 
     * }
     * 
     * System.out.println(builder.toString());
     */

  }

}

class FirstLastNameComparator implements Comparator<EmployeeOne>{

  @Override
  public int compare(EmployeeOne o1, EmployeeOne o2) {
    
    if(o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
    return o1.getLastName().compareTo(o2.getLastName());
    } else {
      return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
  }
  
}

