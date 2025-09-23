
import java.util.*;
class ass9{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int m1=s.nextInt();
  int m2=s.nextInt();
  int m3=s.nextInt();
  int m4=s.nextInt();
  int m5=s.nextInt();
  if(m1<35||m2<35||m3<35||m4<35||m5<35){
   System.out.println("You failed the exam");
  }else{
   int avg=(m1+m2+m3+m4+m5)/5;
   switch(avg/10){
    case 10:
    case 9:System.out.println("First class with distinction");break;
    case 8:System.out.println("First class");break;
    case 7:System.out.println("Second class");break;
    default:System.out.println("Pass");
   }
  }
 }
}
