/*
@Author:sunder
@Code  :Comparing Strings 
@Date  :28-01-2017
*/


import java.io.*;
import java.util.*; 



public class stringequalscasedemo{


      public static void main(String[] args){


      String EMPNAME =  "sunny";
      String PREVEMP =  "Sunny";
      
      boolean retval;
      retval = EMPNAME.equalsIgnoreCase(PREVEMP);
      

      System.out.println("Returned value ="+retval);

      } 
      
      

}


