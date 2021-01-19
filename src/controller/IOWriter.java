package controller;
import model.Living;
import java.io.*;
import java.util.ArrayList;


public class IOWriter {
    public static final String PATH = "spending.txt";
    public static void writerFile(ArrayList<Living>livings) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
            obj.writeObject(livings);
            obj.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static final String PATHMONEY = "money.txt";
    public static void writerFile1(ArrayList<DataProces>dataProces) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATHMONEY);
            ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
            obj.writeObject(dataProces);
            obj.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
