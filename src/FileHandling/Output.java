package FileHandling;

import java.io.*;
import java.util.Arrays;

public class Output
{
    public static void main(String[] args) throws IOException {
//        OutputStream os = System.out;
//        os.write("fghsd".getBytes());
//        os.write(Integer.toString(23).getBytes());

//        OutputStreamWriter osw = new OutputStreamWriter(System.out);
//        osw.write(90);
//        osw.write("LakshayBhatia");
//        osw.write(10);
//        osw.write("Lakshay".toCharArray());
//
//        osw.close();

//        FileWriter fw = new FileWriter("src\\FileHandling\\Output.txt");
        // Now this is rewriting every time by deleting the old data.
        // So when you want to append data , do this :


        FileWriter fw = new FileWriter("src\\FileHandling\\Output.txt",true);
//        fw.write("Lakshay Bhatia\n");
        fw.close();
        int[] arr = {1,2,3,4,5};


        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\FileHandling\\Output.txt",true));
        bw.newLine();
        bw.newLine();
        bw.write(Arrays.toString(arr));
        bw.close();

    }
}

