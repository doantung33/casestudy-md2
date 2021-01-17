package controller;

import model.Living;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOWriter {
    private static BufferedWriter bufferedWriter;
    public IOWriter(){}
    public static void fileWriter(String path){
        File file = new File(path);
        List<Living>livings=DataProcessing.listLiving;
        FileWriter fileWriter=null;

            try {
                if (!file.exists()){
                file.createNewFile();
                }
                fileWriter= new FileWriter(file);
                bufferedWriter=new BufferedWriter(fileWriter);
                for (Living l:livings
                     ) {
                    bufferedWriter.append(l.toString());
                    bufferedWriter.append("\n");
                }
            } catch (IOException e) {
                    e.printStackTrace();
            }finally {
                if (bufferedWriter!=null){
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
    }
}
