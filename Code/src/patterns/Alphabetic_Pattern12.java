package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  AAAAA
  BBBB
  CCC
  DD
  E
*/
import java.util.Scanner;
public class Alphabetic_Pattern12{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char a = 65;
    for(int i=n;i>=1;i--){
      char r = a;
      for(int j=i;j>=1;j--){
        System.out.print(r);
      }
      a++;
      System.out.println();
    }
  }
}
