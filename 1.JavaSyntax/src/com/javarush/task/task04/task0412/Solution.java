package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int a = Integer.parseInt(str);
        if (a > 0){
            a *= 2;
        } else if (a < 0 ){
            a ++;
        }
        System.out.println(a);

    }

}