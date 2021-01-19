package controller;

import model.Living;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOReader {
    public static final String PATH = "spending.txt";
    public static ArrayList<Living> readFile() {
        ArrayList<Living>livings = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            ObjectInputStream obj = new ObjectInputStream(fileInputStream);
            livings = (ArrayList<Living>) obj.readObject();
            obj.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return livings;

    }
    public static final String PATHMONEY = "money.txt";
    public static ArrayList<DataProces> readFile1() {
        ArrayList<DataProces>dataProces = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PATHMONEY);
            ObjectInputStream obj = new ObjectInputStream(fileInputStream);
            dataProces = (ArrayList<DataProces>) obj.readObject();
            obj.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataProces;
    }

}
