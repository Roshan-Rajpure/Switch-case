
import java.util.*;
class ass4{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  char op=s.next().charAt(0);
  switch(op){
   case '+':System.out.println(a+b);break;
   case '-':System.out.println(a-b);break;
   case '*':System.out.println(a*b);break;
   case '/':System.out.println(a/b);break;
   case '%':System.out.println(a%b);break;
   default:System.out.println("Invalid");
  }
 }
}
