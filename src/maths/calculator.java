import java.util.Scanner;
public class JavaApplication1 {


    public static void main(String[] args) {

         int x,
         int y;

         Scanner input=new Scanner(System.in);
         System.out.println("Enter Number 1");
         x=input.nextInt();
         System.out.println("Enter Number 2");
         y=input.nextInt();

         System.out.println("Please enter operation + - / or *");
         Scanner op=new Scanner(System.in);
         String operation = op.next();

         if (operation.equals("+")){
             System.out.println("Your Answer: " + (x+y));
         }
         if (operation.equals("-")){
             System.out.println("Your Answer: "+ (x-y));
         }
         if (operation.equals("/")){
             System.out.println("Your Answer: "+ (x/y));
         }
         if (operation.equals("*")){
            System.out.println("Your Answer: "+ (x*y));
         }
    }

}
