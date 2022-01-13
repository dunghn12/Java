/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String temp = "";

        System.out.print("Nhap so luong chuoi la : ");
        n = Integer.parseInt(sc.nextLine());
        String[] str = new String[100];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        int max = str[0].length();
        for (int i = 0; i < n; i++) {
            if (str[i].length() >= max) {
                max = str[i].length();
                temp = str[i];

            }
        }
        System.out.println("Chuoi co do dai dai nhat la : " + temp);
    }
}
