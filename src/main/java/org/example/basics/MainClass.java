package org.example.basics;

import java.util.*;

public class MainClass{
   public  static void main(String [] arg){
       int factorial = 1;
       int i;
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(i = 1; i <= a; i++){
           factorial*=i;
       }
       System.out.println(factorial);
   }
}

