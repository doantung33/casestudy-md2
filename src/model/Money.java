package model;

public class Money  {
    private double money;

    public Money() {
    }

    public Money(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public Money setMoney(double money) {
        this.money = money;
        return null;
    }

    @Override
    public String toString() {
        return money+"";
    }
}
