package Strings_KK;

import java.util.Arrays;

public class StringBuilder_KK
{
    public static void main(String[] args)
    {
        StringBuilder series = new StringBuilder("");
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series.append(ch);

        }
        System.out.println(series);

        String s = series.toString();
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));

        series.reverse();
        System.out.println(series);


    }

    static void ques(){
        StringBuilder series = new StringBuilder();
        String  s = "zooozzzvzvvvvvv";
        series.append(s.charAt(0));


        for (int i = 0; i < s.length(); i++) {
            char ele = s.charAt(i);
            for (int j = 0; j < series.length(); j++) {
                if(series.indexOf(String.valueOf(ele))==-1){
                    series.append(ele);
                }
            }

        }
        System.out.println(series);


        }
    }

