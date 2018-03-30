/*
   ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018
*/

/* 6. Your pseudocode algorithm here

    1. Set initial value 100
    2. Decrement it with variable that set to 19
    3. Now decrement variable by 2 each time and subtract it from initial value until it grater than zero.
    4. Print the output to console each time.
    5. Desired sequence is obtained

*/

public class P5_DescendingSquares {

 public static void main(String[] args) {
   int out = 100;
   int dec = 19;
   for(int i=0;i<out;i=0){                   //loop to get and print sequence
    System.out.print( out + " ");
    out=out-dec;
    dec=dec-2;
   }
   System.out.println();
 }

}