package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  E
  DD
  CCC
  BBBB
  AAAAA
*/
import java.util.Scanner;
public class Alphabetic_Pattern10{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char a = 69;
    for(int i=1;i<=n;i++){
      char r = a;
      for(int j=1;j<=i;j++){
        System.out.print(r);
      }
      a--;
      System.out.println();
    }
  }
}
