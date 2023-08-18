package FileHandling;

import java.io.*;

public class Input
{
    public static void main(String[] args) throws IOException
    {

        // class InputStreamReader :-
        // It is a bridge from byte stream to character streams.
        // It reads byte and decodes into characters using specified charset.

//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter the data :");
//            int ans = isr.read();
//            while(isr.ready()){
//                System.out.println((char)ans);
//                ans = isr.read();
//            }
//
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        // Class BufferedReader
        // It reads text from character input stream .
        // So we can't do this
//        BufferedReader br = new BufferedReader(System.in);
        // It buffers character to provide more efficient reading.

        // so what we do?
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            String a = br.readLine();
//            System.out.println(a);
//            int b = br.read();
//            System.out.println((char)b);
//        }
//
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        try(BufferedReader br = new BufferedReader(new FileReader("src\\FileHandling\\Notes.txt"))){
//            String a = br.readLine();
//            while(br.ready()){
//                System.out.println(a);
//                a = br.readLine();
//
//            }
//        }
//
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }


        FileReader fr = new FileReader("src\\FileHandling\\Notes.txt");

        while(fr.ready()){
            System.out.print((char)fr.read());

        }

        fr.close();






    }
}
