package controller;

import model.Living;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOReader {
    public static List<Living>filePath(String path){
        File file=new File(path);
        if (DataProcessing.listLiving==null){
            DataProcessing.listLiving=new ArrayList<>();
        }
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line= null;
            while((line = bufferedReader.readLine())!= null){
                String[] split = line.split(",");
                String day =split[0];
                String expenses = split[1];
                double money = Double.parseDouble(split[2]);
                String note=split[3];
                Living living = new Living(day,expenses,money,note);
                DataProcessing.listLiving.add(living);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }return DataProcessing.listLiving;

//        FileInputStream fileInputStream=null;
//        BufferedInputStream bufferedInputStream=null;
//        try {
//            fileInputStream=new FileInputStream(path);
//            bufferedInputStream=new BufferedInputStream(fileInputStream);
//            int line;
//            while ((line=bufferedInputStream.read())!=-1){
//                String[]arr= new String[3];
//                String day=arr[0];
//                String expenses=arr[1];
//                double money=Double.parseDouble(arr[2]);
//                String note=arr[3];
//
////                System.out.print((char)line);
//                Living living=new Living(day,expenses,money,note);
//                DataProcessing.listLiving.add(living);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        finally {
//            if (bufferedInputStream!=null){
//                try {
//                    fileInputStream.close();
//                    bufferedInputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }return DataProcessing.listLiving;
    }
}
