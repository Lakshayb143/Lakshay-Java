package FileHandling;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFile
{
    public static void main(String[] args) throws IOException {
        File file = new File("S:\\Java\\Code\\LakshayDSA\\src\\FileHandling\\Generated.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(file.canWrite());
////        file.setReadOnly();
//        System.out.println(file.canWrite());
//        file.setWritable(true);
////        System.out.println(file.canWrite());
//
////        file.setExecutable(false,false);
////        file.setReadOnly();
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());


    }
}
