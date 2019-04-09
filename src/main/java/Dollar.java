public class Dollar {
  private int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    int resultantAmount = this.amount * multiplier;
    return new Dollar(resultantAmount);
  }

  public Dollar dividedBy(int denominator) {
    int resultantAmount = this.amount / denominator;
    return new Dollar(resultantAmount);
  }

  @Override
  public String toString() {
    return "$" + this.amount;
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Dollar)) {
      return false;
    }
    Dollar o = (Dollar) other;
    return this.amount == o.amount;
  }
}
