package FileHandling;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {

    // create
    File fo = new File("src\\FileHandling\\new-file.txt");
    fo.createNewFile();



    // write in the file
    try {
      FileWriter fw = new FileWriter(fo);
      fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());      
    }

    // create
    try {
      File f = new File("random.txt");
      f.createNewFile();
      if(f.delete()) {
        System.out.println(f.getName());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    
    
  }
}