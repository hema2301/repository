package com.stackroute.pe3;

public class Student 
{
  public String stud(int[] s1)
  {  
      for(int i = 0; i< s1.length; i++) {
          try {
          if(s1[i]<0 || s1[i]>100)
              throw new Exception("Invalid-Grades");
          }
          catch(Exception e){
              return e.getMessage();
          }
      }
      
          return "Valid-Grades";
  }

 }
