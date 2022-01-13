/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("Nhập số học sinh: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên học sinh : ");
        String[] str = new String[100];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        String[] surname = new String[n];
        for (int i = 0; i < n; i++) {
            surname[i] = str[i].substring(str[i].indexOf(" "), str[i].lastIndexOf(" ")).trim();
            String s = "";
            if (surname[i].equals("Hoa") ){
                count++;
            }
        } 
        System.out.println(count);
    }
}
