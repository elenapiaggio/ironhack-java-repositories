package day_2;

public class EvenOdd {
  public static void main(String[] args) {
    int countEven = 0;
    int countOdd = 0;

    for (int i = 0; i < 100; i++) {
      int randomNumber = getRandom();
      if(isEven(randomNumber)){
        countEven ++;
      } else{
        countOdd ++;
      }
    }

    System.out.println("Random int executed 100 times");
    if(countEven == countOdd){
      System.out.println(countEven + " even | " + countOdd + " odd");
      System.out.println("Win Win");
    } else if(countEven > countOdd){
      System.out.println(countEven + " even | " + countOdd + " odd");
      System.out.println("Even Win");
    } else {
      System.out.println(countOdd + " odd | "  + countEven + " even");
      System.out.println("Odd Win");
    }
  }

  public static boolean isEven(int number){
    boolean isEven = false;
    if(number % 2 == 0){
      return true;
    }
    return isEven;
  }

  public static int getRandom(){
    int random = (int) (Math.random() * (100 - 1)) + 1;
    return random;
  }


}
