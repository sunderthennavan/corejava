/*
@Author: Sunder 
@Code: StringEquals Variant
@Date: 29-01-2017 
*/


import java.io.*;
import java.util.*;


public class stringequalscasedemo2{


      public static void main(String[] args){


       String  str1 = "Welcome";
       String  str2 = "welcome";
       String  str3 = "Welcome";


       System.out.println("Str1 is Equal to Str2 =" + str1.equals(str2));
       System.out.println("Str1 is Equal to Str3 =" + str1.equals(str3));
       System.out.println("Str3 is Equal to Str1 =" + str3.equals(str1));



      }



}



