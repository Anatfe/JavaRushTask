package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int a = Integer.parseInt(str);
        str = bufferedReader.readLine();
        int b = Integer.parseInt(str);

        if (a < b){
            System.out.println(a);
        } else System.out.println(b);
    }
}