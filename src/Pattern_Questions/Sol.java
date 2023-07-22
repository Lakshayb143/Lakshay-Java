package Pattern_Questions;

import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = (in.nextInt());
//
//        int[] Car2 = new int[a];
//        int[] Penalty2 = new int[a];
//
//        int d = in.nextInt();
//
//        for (int i = 0; i < a; i++) {
//            Car2[i] = in.nextInt();
//        }
//        for (int i = 0; i < a; i++) {
//            Penalty2[i] = in.nextInt();
//        }
//        int f = 0;
//
//        if(d%2==0){
//            for(int i = 0; i<Car2.length; i++){
//                if(Car2[i]%2!=0){
//                    f += Penalty2[i];
//                }
//            }
//        }
//
//        System.out.println(f);

        Scanner in = new Scanner(System.in);
        int a = (in.nextInt());

        int[] Car2 = new int[a];
        int[] Penalty2 = new int[a];

        int d = in.nextInt();

        for (int i = 0; i < a; i++) {
            Car2[i] = in.nextInt();
        }
        for (int i = 0; i < a; i++) {
            Penalty2[i] = in.nextInt();
        }
        int f = 0;

        if(d%2==0){
            for(int i = 0; i<Car2.length; i++){
                if(Car2[i]%2!=0){
                    f += Penalty2[i];
                }
            }
        }

        else{
            for(int j = 0; j<Car2.length; j++){
                if(Car2[j]%2==0){
                    f += Penalty2[j];
                }
            }
        }

        System.out.println(f);



    }
}
