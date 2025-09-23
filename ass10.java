
import java.util.*;
class ass10{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  String d=s.next();
  switch(d){
   case "Monday":System.out.println("Start of week");break;
   case "Tuesday":System.out.println("Work day");break;
   case "Wednesday":System.out.println("Midweek");break;
   case "Thursday":System.out.println("Almost Friday");break;
   case "Friday":System.out.println("Last workday");break;
   case "Saturday":System.out.println("Weekend");break;
   case "Sunday":System.out.println("Holiday");break;
   default:System.out.println("Invalid Day");
  }
 }
}
