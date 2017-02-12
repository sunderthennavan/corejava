/*
@Author: Sunder 
@Code: StringBuilder
@Date: 11-02-2017 
*/


import javax.swing.JOptionPane;



public class stringbuilderdemo{
	



      public static void main(String[] args) {


      StringBuilder nameString = new StringBuilder("Demo of Stringbuilder");

      int nameStringCapacity = nameString.capacity(); 

      System.out.println("Capacity of namestring is = "+nameStringCapacity);

      StringBuilder addressString = null; 

      addressString = new StringBuilder("Welcome to Athena Technologies"); 

      int addressStringCapacity = addressString.capacity(); 

      System.out.println("Capacity of addressString is = "+addressString);
	
      nameString.setLength(20);

     System.out.println("The name is " + nameString + "end");
     
     addressString.setLength(20);
     
     System.out.println("The address is " + addressString);
}




}


