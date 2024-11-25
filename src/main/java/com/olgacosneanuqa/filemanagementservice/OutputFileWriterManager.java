package com.olgacosneanuqa.filemanagementservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFileWriterManager {
    public static void writeContentIntoFileUsingFileWriter(String filePath, String content){
        FileWriter fileWriter = null;

        try {
            fileWriter= new FileWriter(filePath);
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try  {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeContentIntoFileUsingBufferWriter(String filePath, String content){
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
