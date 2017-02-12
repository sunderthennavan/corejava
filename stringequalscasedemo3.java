/*
@Author: Sunder 
@Code: StringEquals Variant
@Date: 29-01-2017 
*/


import java.io.*;
import java.util.*;


public class stringequalscasedemo3{


      public static void main(String[] args){


       String  str1 = "Welcome";
       String  str2 = "welcome";
       String  str3 = "Welcome";



       boolean s1 = str1.equalsIgnoreCase(str2); 
       boolean s2 = str1.equalsIgnoreCase(str3); 
       boolean s3 = str3.equalsIgnoreCase(str1); 

          

       System.out.println("Str1 is Equal to Str2 =" + s1);
       System.out.println("Str1 is Equal to Str3 =" + s2);
       System.out.println("Str3 is Equal to Str1 =" + s3);



      }



}



