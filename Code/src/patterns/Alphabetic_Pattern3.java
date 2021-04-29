package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  E
  ED
  EDC
  EDCB
  EDCBA
*/
import java.util.Scanner;
public class Alphabetic_Pattern3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(char i=69;i>69-n;i--){
      for(char k=69;k>=i;k--){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}
