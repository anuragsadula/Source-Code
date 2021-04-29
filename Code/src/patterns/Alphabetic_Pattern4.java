package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE
  E
  DE
  CDE
  BCDE
  ABCDE
*/
import java.util.Scanner;
public class Alphabetic_Pattern4{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    char a = 69,r = 0;
    for(char i=65;i<65+n;i++){
      r = a;
      for(char k=65;k<=i;k++){
        System.out.print(r);
        r++;
      }
      a--;
      System.out.println();
    }
  }
}
