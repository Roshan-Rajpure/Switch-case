
import java.util.*;
class ass2{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  String g=s.next();
  switch(g){
   case "O":System.out.println("Outstanding");break;
   case "A":System.out.println("Excellent");break;
   case "B":System.out.println("Very Good");break;
   case "C":System.out.println("Good");break;
   case "D":System.out.println("Pass");break;
   case "F":System.out.println("Fail");break;
   default:System.out.println("Invalid Grade");
  }
 }
}
