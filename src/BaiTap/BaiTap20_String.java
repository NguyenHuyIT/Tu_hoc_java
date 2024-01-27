package BaiTap;

import java.util.Scanner;

public class BaiTap20_String {
    /*
     Java 20:
     Viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
     * mật khẩu hợp lệ khi có ít nhất 6 ký tự
     * chứa ít nhất 1 chữ cái ( chữ cái thường hoặc hoa đều được)
     * chứa ít nhất 1 chữ số
       2. cho người dùng nhập vào mật khẩu để login / so sánh, nếu đúng mở của, sai
    quá 5 lần khóa đăng nhập, thoát chương trình
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passold = "";
        while(true){
            System.out.println("Mời nhập mật khẩu(có ít nhất 6 ký tự, chứa ít nhất 1 chữ cái, chứa ít nhất 1 chữ số): ");
            String passnew = sc.nextLine();
            if (CheckMK(passnew)){
                passold = passnew;
                System.out.println("Mật khẩu hợp lệ.");
                break;
            }else{
                System.out.println("Mật khẩu không hợp lệ mời nhập lại");
            }

        }

    }
    static Boolean CheckMK(String pass){
        if(pass.length() < 6 )
            return false;

        boolean checkchar = false;
        for(char c : pass.toCharArray()){
            if(Character.isLetter(c)){
                checkchar = true;
                break;
            }
        }

        if(!checkchar)
            return false;

        boolean checknum = false;
        for(char c : pass.toCharArray()){
            if(Character.isDigit(c)){
                checknum = true;
                break;
            }
        }

        if(!checknum)
            return false;

        return true;
    }
}
