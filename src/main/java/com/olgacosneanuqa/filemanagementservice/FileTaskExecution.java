package com.olgacosneanuqa.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {
        File fileObject = new File("scr/main/java/com/olgacosneanuqa/filemanagementservice/text.txt");

        FileManager.informIfTheFileExists(fileObject);
        FileManager.createTheFileIfItDoesNotExist(fileObject);
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printIfTheFileIsADirectoryOrNot(fileObject);
        FileManager.printTheFileAbsolutPath(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.deleteTheFileIfExists(fileObject);

        String filePath = "scr/main/java/com/olgacosneanuqa/filemanagementservice/textOutput.txt";
        OutputFileWriterManager.writeContentIntoFileUsingFileWriter(filePath, "Continut 1");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "Continut 2");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
        InputFileReadManager.printDataFromFile(fileObjectUsedForReading);
    }
}
