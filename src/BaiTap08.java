import java.util.Scanner;

public class BaiTap08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 3 số a, b, c: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float delta;
        if (b % 2 == 0) {
            delta = (float) (Math.pow(b / 2, 2) - a * c);
        } else {
            delta = (float) (Math.pow(b, 2) - 4 * a * c);
        }

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            if (b % 2 == 0) {
                System.out.println("x1 = " + ((-(b / 2) + (float) Math.sqrt(delta)) / a));
                System.out.println("x2 = " + ((-(b / 2) - (float) Math.sqrt(delta)) / a));
            } else {
                System.out.println("x1 = " + ((-b + (float) Math.sqrt(delta)) / (2 * a)));
                System.out.println("x2 = " + ((-b - (float) Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}
