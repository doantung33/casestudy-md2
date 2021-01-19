package view;

import controller.DataProces;
import controller.IOReader;
import model.Living;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Living>listLiving=IOReader.readFile();
    static DataProces dataProces= new DataProces(listLiving);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        addPrice();
        do {
            System.out.println("------MENU-----");
            System.out.println("1. ADD A MONEY ACCOUNT");
            System.out.println("2. MONEY DISPLAY");
            System.out.println("3. MONEY CORRECTION");
            System.out.println("4. DELETE THE MONEY");
            System.out.println("5. MONEY SEARCH");
            System.out.println("0. EXIT");
            System.out.println("---------------------------");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    addNew();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 0:
                    n=0;
                    System.exit(n);
            }
        } while (true) ;
    }

    private static void addNew() {
        Scanner scanner= new Scanner(System.in);
        Living living=new Living();
        System.out.println("Enter Your Pending Date");
        String day= scanner.nextLine();
        living.setDay(day);
        System.out.println("Enter Your Expenses");
        String expenses= scanner.nextLine();
        living.setExpenses(expenses);
        System.out.println("Enter The Amount Spent");
        double price= scanner.nextDouble();
        living.setSpendingMoney(price);
        System.out.println("Note");
        Scanner scanner1= new Scanner(System.in);
        String note= scanner1.nextLine();
        living.setNote(note);
        listLiving.add(living);
    }
    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        String expenses = scanner.nextLine();
        dataProces.search(expenses);
    }
    public static void show(){
        dataProces.show();
    }
    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name Of The Account You Want To Delete");
        String expenses = scanner.nextLine();
        dataProces.delete(expenses);
    }
    public static void edit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name Of The Account You Want To Edit");
        String expenses= scanner.nextLine();
        for (Living living:listLiving) {
            if (expenses.equals(living.getExpenses())) {
                System.out.println("1.Edit Day");
                System.out.println("2.Edit Expenses");
                System.out.println("3.Edit Price");
                System.out.println("4.Edit Note");
                System.out.println("0.Exit");
                int n= scanner.nextInt();
                switch (n) {
                    case 1:
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Enter Reset Your Spending Date");
                        String day = scanner1.nextLine();
                        living.setDay(day);
                        break;
                    case 2:
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Enter Reset Your Expenses");
                        String expenses1 = scanner2.nextLine();
                        living.setExpenses(expenses1);
                        break;
                    case 3:
                        Scanner scanner3 = new Scanner(System.in);
                        System.out.println("Enter Reset The Amount Spent");
                        double price = scanner3.nextDouble();
                        living.setSpendingMoney(price);
                        break;
                    case 4:
                        Scanner scanner4 = new Scanner(System.in);
                        System.out.println("Reset Note");
                        String note = scanner4.nextLine();
                        living.setNote(note);
                        break;
                }
            }dataProces.edit();
        }

    }
//    public static void search(){
//        Scanner scanner= new Scanner(System.in);
//        String expenses=scanner.nextLine();
//        List<Living>livings=dataProces.findByExpenses(expenses);
//        dataProces.search(livings);
//    }
    public static void addPrice(){
        List list=IOReader.readFile1();
        DataProces dataProces1= new DataProces((ArrayList<Living>) list);
        double totalMoney=0;
        if (totalMoney<=0){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Money");
            totalMoney=Double.parseDouble(scanner.nextLine());
           dataProces.setMoney(totalMoney);
           list.add(dataProces);
        }
    }
}
