package view;

import controller.DataProcessing;
import controller.IOReader;
import controller.IOWriter;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataProcessing dataProcessing = new DataProcessing();
        IOReader.filePath("spending.txt");
        Scanner scanner = new Scanner(System.in);
        dataProcessing.addPrice();
        do {
            System.out.println("------MENU-----");
            System.out.println("1. ADD SPENDING");
            System.out.println("2. SHOW SPENDING");
            System.out.println("3. EDIT SPENDING");
            System.out.println("4. DELETE SPENDING");
            System.out.println("5. SAVE IN FILE");
            System.out.println("0. EXIT");
            System.out.println("---------------------------");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    dataProcessing.add();
                    break;
                case 2:
                    dataProcessing.show(DataProcessing.listLiving);
                    dataProcessing.readMoney();
                    break;
                case 3:
                    dataProcessing.edit("spending.txt");
                    break;
                case 4:
                    dataProcessing.delete();
                    break;
                case 5:
                    IOWriter.fileWriter("spending.txt");
                    dataProcessing.writeMoney();
                    break;
                case 6:
                    dataProcessing.writeMoney();
                    break;
            }

        } while (true) ;
    }
}
