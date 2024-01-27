package BaiTap;

import java.util.Scanner;

public class BaiTap21_String {
    /*
    Viết chương trình chuyển tin nhắn sang mật mã theo bảng :
            #a="abcdefghijklmnopqrstuvwxyz"
            #b="zxcvbnmasdfghjklqwertyuiop"
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tin nhắn cần mã hoá: ");
        String mess = sc.nextLine();
        System.out.println("Chuỗi sau khi mã hoá: " + chuyenDoi(mess));
    }

    static String chuyenDoi(String mess) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        char[] arrA = a.toCharArray();
        String b = "zxcvbnmasdfghjklqwertyuiop";
        char[] arrB = b.toCharArray();
        char[] arrMess = mess.toCharArray();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < mess.length(); i++) {
            if (arrMess[i] >= 'a' && arrMess[i] <= 'z') {
                // Convert lowercase letter
                int index = a.indexOf(arrMess[i]);
                arrMess[i] = arrB[index];
            }
            st.append(arrMess[i]);
        }

        return st.toString();
    }

}
