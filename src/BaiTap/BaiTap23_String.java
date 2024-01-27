package BaiTap;

import java.util.Scanner;

public class BaiTap23_String {
    /*    Viết chương trình tách số và chữ từ chuỗi nhập vào thành 2 chuỗi :
     * ví dụ nhập vào : abc123 sẽ tách và in ra thành 2 chuỗi abc và 123*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào chuỗi cần tách: ");
        String st = sc.nextLine();
        char[] arrst = st.toCharArray();
        StringBuilder Stringchar = new StringBuilder();
        StringBuilder Stringnum = new StringBuilder();
        for (char c : arrst) {
            if (Character.isLetter(c)) {
                Stringchar.append(c);
            } else if (Character.isDigit(c)) {
                Stringnum.append(c);
            }
        }
        System.out.println("Chuỗi chữ sau khi tách: " + Stringchar.toString() + " và " + Stringnum.toString());
    }
}
