/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lesson4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        for(char c = '0' ; c <='9' ; c++){
            s = s.replace(c+"","$");
            }
        System.out.print("Replace : "+s);
        }
        
    }

