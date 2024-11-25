package com.olgacosneanuqa.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file){
        try {
            return file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void informIfTheFileExists(File file){
        if (file.exists()) {
            System.out.println("Fisierul exista.");
        } else {
            System.out.println("Fisierul nu exista.");
        }
    }

    public static void printTheFileName(File file){
        String fileName = file.getName();
        System.out.println("Numele fisierului: " + fileName);
    }

    public static void printTheFileAbsolutPath(File file){
        String absolutePath = file.getAbsolutePath();
        System.out.println("Calea absoluta a fisierului: " + absolutePath);
    }

    public static void printIfTheFileIsADirectoryOrNot(File file){
        if (file.isFile()) {
            System.out.println("Obiectul File reprezinta un fisier.");
        } else if (file.isDirectory()){
            System.out.println("Obiectul File reprezinta un director.");
        }
    }
    public static void deleteTheFileIfExists(File file){
        if (file.delete()) {
            System.out.println("Fisierul a fost sters.");
        } else {
            System.out.println("Nu s-a putut sterge fisierul.");
        }
    }
}
