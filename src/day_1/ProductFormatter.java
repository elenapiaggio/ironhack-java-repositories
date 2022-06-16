package day_1;

/**
 * Create a method named productFormatter
 * that receives a String name productName and a String date as parameters.
 * This method should return the productName trimmed, change spaces by _ and append the date at the end of the string. The result must be given in uppercase.
 */
public class ProductFormatter {

  public static void main(String[] args) {

    String productName = "HP mouse";
    String date = "21 06 2022";
    System.out.println("Format => " + productFormatter(productName, date));
  }

  public static String productFormatter(String productName, String date){
    String stringFinal = productName + "" + date ;
    return "";
  }

  public static String trim(String theStringToTrim){
    for (int i = 0; i < theStringToTrim.length(); i++) {
      //String actualChar = theStringToTrim.charAt(i);

    }
    return "arrayStringToTrim";
  }
}
