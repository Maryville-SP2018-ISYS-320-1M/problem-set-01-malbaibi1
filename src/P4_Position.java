/*
   ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P4_Position {

 public static void main(String[] args) {
   int t = 4;                                   //initialization and declaration of variables
   double s0 = 2.3;
   double v0 = 4.6;
   double a = 3.7;
   
   double s = s0 + (v0*t) + ((1/2) * a * t * t);   //expression to compute postion 's'
   
   System.out.println(s);

 }

}