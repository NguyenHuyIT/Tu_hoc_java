package BaiHoc;

import java.util.Calendar;
import java.util.Scanner;

public class Bai22_VanDung {
    public static void main(String[] args) {
        Calendar birthday = inputDateOfBirth();
        if (birthday == null) {
            System.out.print("Ngày tháng năm sinh không hợp lệ");
            return;
        }

        int age = calculateAge(birthday, Calendar.getInstance());
        printAge(age);
    }

    public static Calendar inputDateOfBirth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào ngày sinh: ");
        int day = sc.nextInt();
        System.out.print("Mời nhập vào tháng sinh: ");
        int month = sc.nextInt();
        System.out.print("Mời nhập vào năm sinh: ");
        int year = sc.nextInt();

        if (day <= 0 || month <= 0 || year <= 0) {
            return null;
        }

        Calendar birthday = Calendar.getInstance();
        birthday.set(year, month - 1, day);
        return birthday;
    }

    public static int calculateAge(Calendar birthday, Calendar calnow) {
        int namSinh = birthday.get(Calendar.YEAR);
        int namHienTai = calnow.get(Calendar.YEAR);
        return namHienTai - namSinh;
    }

    public static void printAge(int age) {
        System.out.println("Tuổi của bạn là: " + age);
    }
}