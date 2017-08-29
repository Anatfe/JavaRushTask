package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String buffer = bufferedReader.readLine();
        int a = Integer.parseInt(buffer);
        buffer = bufferedReader.readLine();
        int b = Integer.parseInt(buffer);
        buffer = bufferedReader.readLine();
        int c = Integer.parseInt(buffer);
        buffer = bufferedReader.readLine();
        int d = Integer.parseInt(buffer);
        System.out.println(max(max(a,b),max(c,d)));
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
