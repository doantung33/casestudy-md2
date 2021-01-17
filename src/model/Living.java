package model;

import java.io.Serializable;

public class Living implements Serializable {
    private Money money=new Money();
    private String day;
    private String expenses;
    private double spendingMoney;
    private String note;

    public Living() {
    }

    public Living(String day, String expenses, double spendingMoney) {
        this.day = day;
        this.expenses = expenses;
        this.spendingMoney = spendingMoney;
    }

    public Living(String day, String expenses, double spendingMoney, String note) {
        this.day = day;
        this.expenses = expenses;
        this.spendingMoney = spendingMoney;
        this.note = note;
    }

    public Living(Money money, String day, String expenses, double spendingMoney, String note) {
        this.money = money;
        this.day = day;
        this.expenses = expenses;
        this.spendingMoney = spendingMoney;
        this.note = note;
    }

    public double getMoney(double money) {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public double getSpendingMoney() {
        return spendingMoney;
    }

    public void setSpendingMoney(double spendingMoney) {
        this.spendingMoney = spendingMoney;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return  day +","+ expenses+","+ spendingMoney+","+ note;
    }

}
