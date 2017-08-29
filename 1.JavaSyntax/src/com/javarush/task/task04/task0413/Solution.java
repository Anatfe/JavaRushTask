package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int a = Integer.parseInt(str);
        if (a > 0 && a < 8){
            System.out.println(array[a - 1]);
        } else System.out.println("такого дня недели не существует");

    }
}