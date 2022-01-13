package lab2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String findStr = "abc";
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
        //string.indexOf(searchvalue, start)
            lastIndex = str.indexOf(findStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
    }
}
