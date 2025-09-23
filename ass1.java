
import java.util.*;
class ass1{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  String c=s.next();
  switch(c){
   case "Red":System.out.println("Stop");break;
   case "Yellow":System.out.println("Ready");break;
   case "Green":System.out.println("Go");break;
   default:System.out.println("No such color is present in traffic lights.");
  }
 }
}
