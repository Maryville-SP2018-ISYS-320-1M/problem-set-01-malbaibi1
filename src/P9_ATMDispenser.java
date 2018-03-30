/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P9_ATMDispenser {

 public static void main(String[] args) {
   
   int withDrawAmount = 73;                       //amount to be withdraw by user
   int tenBills = withDrawAmount/10;              //calculate $10 bills
   int oneBills = withDrawAmount%10;              //calculate $1 bills
   
   System.out.println("\"Dispense " + tenBills + " $10 bills and " + oneBills + " $1 bills\"" );
  
 }

}