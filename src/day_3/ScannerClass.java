package day_3;

import java.util.Scanner;

public class ScannerClass extends Exception{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String age = scanner.nextLine();

    try {
      if((Integer)Integer.parseInt(age) instanceof Integer){
        System.out.println("ha escrito un numero");
      } else{
        System.out.println("ha escrito un STRING");
      }
    } catch (Exception e){
      System.err.println("Error => " + e.getMessage());
    }


    scanner.close();

  }
}
