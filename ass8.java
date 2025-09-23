
import java.util.*;
class ass8{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  if(a<0 || b<0){
   System.out.println("Sorry negative numbers are not allowed");
  }else{
   int r=a*b;
   switch(r%2){
    case 0:System.out.println("Even");break;
    case 1:System.out.println("Odd");break;
   }
  }
 }
}
