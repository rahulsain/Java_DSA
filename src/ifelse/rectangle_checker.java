//enter the values of length and breadth of rectangle from user and check if it a square
import java.util.Scanner;
class Ans{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter length");
    int x = s.nextInt();
    System.out.println("Enter breadth");
    int y = s.nextInt();
    if(x==y){
      System.out.println("Square");
    }
    else{
      System.out.println("Rectangle");
    }
  }
  }
