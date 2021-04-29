package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  ABCDE
  ABCD
  ABC
  AB
  A
*/
import java.util.Scanner;
public class Alphabetic_Pattern5{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(int i=n;i>=1;i--){
      char a = 65;
      for(int j=i;j>=1;j--){
        System.out.print(a);
        a++;
      }
      System.out.println();
    }
  }
}
