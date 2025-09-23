
import java.util.*;
class ass7{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  String p=s.next();
  switch(p){
   case "Platinum":System.out.println("For the Platinum plan, the price is 799");break;
   case "Gold":System.out.println("For the Gold plan, the price is 599");break;
   case "Silver":System.out.println("For the Silver plan, the price is 399");break;
   case "Bronze":System.out.println("For the Bronze plan, the price is 199");break;
   case "free":System.out.println("For less than 199, the platform is free with limited access");break;
   default:System.out.println("Invalid Input");
  }
 }
}
