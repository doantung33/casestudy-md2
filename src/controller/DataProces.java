package controller;

import model.Living;
import java.util.ArrayList;
import java.util.List;

public class DataProces {
    static ArrayList<Living> livings;
    static ArrayList<DataProces>list;
    private double money;

    public double getMoney(){
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public DataProces(ArrayList<Living>livings) {
        this.livings=livings;
    }

    public ArrayList<Living> getLivings() {
        return livings;
    }

    public void setLivings(ArrayList<Living> livings) {
        this.livings = livings;
    }

    public void add(Living living) {
        livings=IOReader.readFile();
        livings.add(living);
        IOWriter.writerFile(livings);
    }
    public void addPrice(DataProces dataProces){
        list=IOReader.readFile1();
        list.add(dataProces);
        IOWriter.writerFile1(list);
    }

    public void delete(String expenses) {
        for (int i = 0; i < livings.size(); i++) {
            if (expenses.equals(livings.get(i).getExpenses())) {
                livings.remove(i);
                i--;
            }
        }
        System.out.println("xoa thanh cong");
        IOWriter.writerFile(livings);
    }
    public void search(String expenses) {
        for (Living living:livings) {
            if (expenses.equals(living.getExpenses())) {
                System.out.println(living.toString());
            }
        }
    }
    public void menu(){
        System.out.println("----------BILL-----------");
        System.out.printf("|%-16s|%-16s|%-16s|%-16s", "DAY", "EXPENSES", "PRICE", "NOTE");
    }
    public void value(Living living){
            System.out.printf("\n|%-16s|%-16s|%-16s|%-16s", living.getDay(), living.getExpenses(), living.getSpendingMoney(), living.getNote());
    }

    double totalSpending=0;
    double totalMoney=0;
    public void show() {
        menu();
        for (Living living:livings) {
            if (living instanceof Living) {}
            System.out.printf("\n|%-16s|%-16s|%-16s|%-16s", living.getDay(), living.getExpenses(), living.getSpendingMoney(), living.getNote());
            totalSpending+=living.getSpendingMoney();
        }
        IOWriter.writerFile(livings);
        System.out.println("\n");
        System.out.println("Total Amounts: "+totalSpending);
        System.out.println("\n");
    }

    public void edit() {
        IOWriter.writerFile(livings);
    }
//    public void search(List<Living> livings) {
//        this.menu();
//        if (livings.isEmpty()) {
//            System.out.println("404 Product Not Found");
//        } else {
//            Iterator iterator = livings.iterator();
//
//            while(iterator.hasNext()) {
//                Living living = (Living)iterator.next();
//                this.value(living);
//            }
//        }
//
//    }
//    public List<Living> findByExpenses(String expenses) {
//        List<Living> resultList = new ArrayList();
//        Iterator iterator = livings.iterator();
//
//        while(iterator.hasNext()) {
//           Living living = (Living) iterator.next();
//            if (living.getExpenses().equals(expenses)) {
//                resultList.add(living);
//            }
//        }
//
//        return resultList;
//    }



}
