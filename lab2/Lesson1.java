package lab2;

import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten : ");
        s = sc.nextLine();
        System.out.print("\nSau khi xoa khoang trang thua la :");
        System.out.println(s.replaceAll("\\s\\s+", " ").trim());

    }
}
