/*
   ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class P2_FightSong {
 public static void main(String[] args) {
     print1(); 
     System.out.println();
     for(int i=0;i<2;i++){                                   //loop to reduce redudancy
       print1();
       print2();
       print1();
       System.out.println();
     }
     print1();
   

 }
   public static void print1() {                                  //methdod to print type one lines
         System.out.println("Go, team, go!\nYou can do it.");
       
}
   public static void print2() {                                  //methdod to print type two lines
         System.out.println("You're the best,\nIn the west.");
       
}  
}