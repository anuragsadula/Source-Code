package patterns;

/*
  THE OUTPUT OF THIS PROGRAM FOR INPUT N = 5 WILL BE,
  A
  AB
  ABC
  ABCD
  ABCDE
*/
import java.util.Scanner;
public class Alphabetic_Pattern1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for(char i=65;i<65+n;i++){
      for(char k=65;k<=i;k++){
        System.out.print(k);
      }
      System.out.println();
    }
  }
}



