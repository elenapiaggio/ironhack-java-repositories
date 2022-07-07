package day_11.demo_enum;

import java.math.BigDecimal;

public class Account {

  private long id;
  private String name;
  private BigDecimal balance;

  private Hold hold;

  public Account() {
  }

  public Account(long id, String name, BigDecimal balance, Hold hold) {
    this.id = id;
    this.name = name;
    this.balance = balance;
    this.hold = hold;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Hold getHold() {
    return hold;
  }

  public void setHold(Hold hold) {
    this.hold = hold;
  }

  @Override
  public String toString() {
    return "Account{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", balance=" + balance +
            ", hold=" + hold +
            '}';
  }
}
