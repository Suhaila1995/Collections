package com.suhaila.dataStructures;

import java.util.HashMap;

public class StringOperations {

  public static void main(String[] args) {

    String str = "Tata Communications";
    String s = str.toLowerCase();
    int count = 0;
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      count = 0;
      for (int j = i; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > 0) {
        System.out.println(arr[i] + "->" + count);
      }
    }

  }

}
