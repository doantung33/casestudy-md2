//package controller;
//
//import model.Living;
//import model.Money;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class DataProcessing {
//    public static List<Money>listMoney=new ArrayList<>();
//    Living living=new Living();
//    Scanner scanner= new Scanner(System.in);
//    private static final String DATE="^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)" +
//            "(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)" +
//            "(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)" +
//            "(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
////    public static DataProces dataProces;
////    private Scanner scanner;
////    public DataProcessing(){
////        this.scanner=new Scanner(System.in);
////        this.dataProces=new DataProces();
////    }
//
//    public void add(){
//
//        Money money= new Money();
//        boolean check1= false;
//
//        do {
//            Scanner scanner= new Scanner(System.in);
//            System.out.println("Enter Your Pending Date");
//            String day= scanner.nextLine();
//            String regex=DATE;
//            Pattern pattern= Pattern.compile(regex);
//            Matcher matcher= pattern.matcher(day);
//            if (matcher.matches()){
//                living.setDay(day);
//                money.setLiving(living);
//                check1=true;
//            }else
//                System.out.println("Retype!!!");
//        }while (!check1);
//
//        boolean check2 = false;
//        do {
//            Scanner scanner= new Scanner(System.in);
//            System.out.println("Enter Your Expenses");
//            String expenses= scanner.nextLine();
//            String regex = "[a-zA-Z]";
//            Pattern pattern = Pattern.compile(regex);
//            Matcher matcher = pattern.matcher(expenses);
//            if (matcher.find()) {
//                living.setExpenses(expenses);
//                money.setLiving(living);
//                check2 = true;
//            } else {
//                System.out.println("Retype!!!");
//            }
//        } while (!check2);
//
//        while (true)
//            try {
//                Scanner scanner= new Scanner(System.in);
//                System.out.println("Enter The Amount Spent");
//                double price= scanner.nextDouble();
//                living.setSpendingMoney(price);
//                money.setLiving(living);
//                break;
//            }catch (NumberFormatException e){
//                System.out.println("Retype!!!");
//            }
////        boolean check3 = false;
////        do {
////            Scanner scanner= new Scanner(System.in);
////            System.out.println("Note");
////            String note= scanner.nextLine();
////            String regex = "[.]";
////            Pattern pattern = Pattern.compile(regex);
////            Matcher matcher = pattern.matcher(note);
////            if (matcher.find()) {
////                living.setNote(note);
////                check3 = true;
////            } else {
////                System.out.println("Mời nhập lại");
////            }
////        } while (!check3);
//        Scanner scanner= new Scanner(System.in);
//            System.out.println("Note");
//            String note= scanner.nextLine();
//            living.setNote(note);
//            money.setLiving(living);
//        listMoney.add(money);
//    }
//    public void edit(String path){
//        System.out.println("Enter The Name Of The Account You Want To Edit");
//        String name= scanner.nextLine();
//        for (Money money:listMoney) {
//            if (name.equals(money.getLiving().getExpenses())){
//                Scanner scanner= new Scanner(System.in);
//                System.out.println("1.Edit Day");
//                System.out.println("2.Edit Expenses");
//                System.out.println("3.Edit Price");
//                System.out.println("4.Edit Note");
//                System.out.println("0.Exit");
//                int n= scanner.nextInt();
//                switch (n){
//                    case 1:
//                        boolean check1=false;
//                        do {
//                            System.out.println("Enter Reset Your Spending Date");
//                            String day= scanner.nextLine();
//                            String regex=DATE;
//                            Pattern pattern= Pattern.compile(regex);
//                            Matcher matcher= pattern.matcher(day);
//                            if (matcher.find()){
//                                living.setDay(day);
//                                money.setLiving(living);
//                                check1=true;
//                            }else {
//                                System.out.println("Retype");
//                            }
//                        }while (!check1);
//                        break;
//
//                    case 2:
//                        boolean check2 = false;
//                        do {
//                            System.out.println("Enter Reset Your Expenses");
//                            String expenses= scanner.nextLine();
//                            String regex = "[a-zA-Z]";
//                            Pattern pattern = Pattern.compile(regex);
//                            Matcher matcher = pattern.matcher(expenses);
//                            if (matcher.find()) {
//                                living.setExpenses(expenses);
//                                money.setLiving(living);
//                                check2 = true;
//                            } else {
//                                System.out.println("Retype");
//                            }
//                        } while (!check2);
//                        break;
//
//                    case 3:
//                        while (true)
//                            try {
//                                System.out.println("Enter Reset The Amount Spent");
//                                double price= scanner.nextDouble();
//                                living.setSpendingMoney(price);
//                                money.setLiving(living);
//                                break;
//                            }catch (NumberFormatException e){
//                                System.out.println("Retype");
//                            }
//                        break;
//                    case 4:
////                        boolean check3=false;
////                        do {
////                            System.out.println("Note");
////                            String note= scanner.nextLine();
////                            String regex = "[.]";
////                            Pattern pattern = Pattern.compile(regex);
////                            Matcher matcher = pattern.matcher(note);
////                            if (matcher.find()) {
////                                living.setNote(note);
////                                check3 = true;
////                            } else {
////                                System.out.println("Mời nhập lại");
////                            }
////                        } while (!check3);
////                        break;
//                        Scanner scanner1= new Scanner(System.in);
//                        System.out.println("Reset Note");
//                        String note= scanner1.nextLine();
//                        living.setNote(note);
//                        money.setLiving(living);
//                    case 0:
//                        n=0;
//                }
//            }
//        }
//    }
//    public void delete(){
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter The Name Of The Account You Want To Delete");
//        String expenses= scanner.nextLine();
//        for (int i = 0; i < listMoney.size(); i++) {
//            if (expenses.equals(listMoney.get(i).getLiving().getExpenses())){
//                listMoney.remove(i);
//                i--;
//                break;
//            }
//        }
//
//    }
//    double totalSpending=0;
//    double  resetMoney=0;
//    public void show(List<Money>listMoney){
//
//        System.out.println("           ----------BILLL----------");
//        System.out.println("   DATE    |       EXPENSES      |       PRICE     |    NOTE   ");
//        for (Money m: listMoney
//             ) {
//            if (m instanceof Money){
//                System.out.println(m.getLiving().getDay()+"\t\t"+m.getLiving().getExpenses()+"\t\t\t\t\t"+m.getLiving().getSpendingMoney()+"\t\t\t"+m.getLiving().getNote());
//            }
//            totalSpending+=m.getLiving().getSpendingMoney();
//        }
//        System.out.println("Total Spending: "+totalSpending);
//
//                for (Money m:listMoney
//                ) {
//                    if (m instanceof Money){
//                        resetMoney=(m.getLiving().getSpendingMoney());
//                    }
//                    resetMoney-=totalSpending;
//                }
//
//        System.out.println("Reset Money: "+resetMoney);
//
//    }
//
//    public void writeMoney(){
//        File file= new File("money.txt");
//        try {
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
//            bufferedWriter.append(String.valueOf(resetMoney));
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void readMoney(){
//        try {
//            BufferedReader bufferedReader=new BufferedReader(new FileReader("money.txt"));
//            String  line;
//            while ((line=bufferedReader.readLine())!=null){
//                System.out.println(""+line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void addPrice(){
//        Money money=new Money();
//        double totalMoney=0;
//        if (totalMoney<=0){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Enter Money");
//            totalMoney=Double.parseDouble(scanner.nextLine());
//            money.setMoney(totalMoney);
//        }
//        listMoney.add(money);
//    }
//}
