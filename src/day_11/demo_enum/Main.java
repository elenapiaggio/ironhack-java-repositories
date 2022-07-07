package day_11.demo_enum;

import java.math.BigDecimal;

/**
 * In an Account class like the one from from the BigDecimal activity add a Hold enum.
 * The Hold state should indicate if there is a reason for placing a hold on theAccount.
 * The potential Hold states are NONE, FRAUD, DELINQUENCY, LOST_STOLEN, LITIGATION_HOLD, FREERIDING.
 */
public class Main {

  public static void main(String[] args) {

    var myAccount = new Account(10, "Antonio", new BigDecimal("88"), Hold.NONE);
    System.out.println(myAccount);
  }


}
