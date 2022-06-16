package day_2;

/**
 *
 * Write a program that prints the numbers from 1 to 100
 * and for multiples of ‘3’ print “Fizz”
 * instead of the number and for the multiples of ‘5’ print “Buzz”.
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14,
 * Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26,
 * Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
 */
public class FizzBuzz {

  public static void main(String[] args) {
    System.out.println(fizzBuzz());
  }

  public static String fizzBuzz(){
    String text = "";
    int counter = 0;

    do {
      if(counter != 0){
        if(counter % 3 == 0){
          System.out.println("Fizz");
        } else if(counter % 5 == 0){
          System.out.println("Buzz");
        } else{
          System.out.println(counter);
        }
      }
      counter ++;
    } while (counter <= 10);

    return "cosha pasha";
  }
}
