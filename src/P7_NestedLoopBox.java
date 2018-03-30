/*
   ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

/* 4. Your pseudocode algorithm here

      1. Create a loop to that control how many rows to printed with *.
      2. Create inner loop that will control how many columns to be printed with *.
      3. A box is created with * of desired width and column.

*/
public class P7_NestedLoopBox {

 public static void main(String[] args) {
     for(int i=0;i<6;i++){                   //loop to handle rows
       for(int j=0;j<6;j++)                  //inner loop to handle columns
         System.out.print("*");
       System.out.println();
   }

 }

}