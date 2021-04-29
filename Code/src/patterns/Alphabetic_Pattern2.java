package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  A
  BA
  CBA
  DCBA
  EDCBA
*/
import java.util.Scanner;
public class Alphabetic_Pattern2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char a = 65,r = 0;
    for(char i=65;i<65+n;i++){
      r = a;
      for(char k=65;k<=i;k++){
        System.out.print(r);
        r--;
      }
      a++;
      System.out.println();
    }
  }
}
