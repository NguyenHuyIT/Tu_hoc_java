package BaiHoc.Basic;

import java.util.Scanner;

public class Bai25_Char {
    public static void main(String[] args) {
        //Khai báo
        char a = 'a';
        char b = 66; // khởi tạo
        System.out.println(b);
        char c; // khai báo
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 ký tự: ");
        String s = sc.nextLine();
        char d = s.charAt(0);
        System.out.println("Ký tự vừa nhập là: " + d);
        //So sánh
        System.out.println(Character.compare('a', 'a'));

        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch5));
    }
}
