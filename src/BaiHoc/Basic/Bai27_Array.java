package BaiHoc.Basic;

import java.util.Arrays;

public class Bai27_Array {
    public static void main(String[] args) {
        //1. Khai báo mảng
        String[] mangStr;
        Float[] mangFL;
        Double[] mangDB;

        //2. Khởi tạo mảng kèm theo kích thước
        String[] mangStr2 = new String[12];

        //3. Khởi tạo mảng kèm giá trị ban đầu
        String[] mangStr3 = new String[]{"Chí phèo", "thị nỡ", "ông giáo"};
        int[] mangInt = new int[]{1,2,3,4,5};

        //4. Truy xuất phần tử của mảng
        System.out.println(mangInt[2]);
        System.out.println(mangStr3[2]);

        //length
        System.out.println(mangInt.length);

        //6. Duyệt mảng dùng for
        // C1
        int[] mang4 = new int[]{1,2,3,4,5};
        for (int pt : mang4){
            System.out.println(pt);
        }

        String[] mang5 = new String[]{"Chí phèo", "thị nỡ", "ông giáo"};
        for (String pt : mang5){
            System.out.println(pt);
        }

        //C2
        for (int i = 0; i < mang4.length; i++) {
            System.out.println(mang4[i]);
        }

        String[] mang6 = new String[]{"Chí phèo", "thị nỡ", "ông giáo"};
        for (int i = 0; i < mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        mang6[0] = "nqh";
        for (int i = 0; i < mang6.length; i++) {
            System.out.println(mang6[i]);
        }

        //Update toàn bộ danh sách
        int[] mang7 = new int[]{1,2,3,4,5,6,7};
        for (int i = 0; i < mang7.length; i++) {
            mang7[i] += 5;
            System.out.println(mang7[i]);
        }

        //Sắp xếp tăng dần
        int[] mang8 = {8, 9, 12, 48, 1, 2, 3};
        Arrays.sort(mang8);
        System.out.println("Mang sau khi sắp xếp tăng dần là: ");
        System.out.println(Arrays.toString(mang8));

        //Đaỏ ngược mảng
        int[] mang9 = {8, 9, 12, 48, 1, 2, 3};
        for(int i = 0, j = mang9.length - 1; i < j; i++, j--){
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }

        //Xuất mảng
        System.out.println("Mảng sau khi đảo ngược là: ");
        System.out.println(Arrays.toString(mang9));

        //Gán mảng truy xuất cùng vùng nhớ
        int[] mang10 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang11 = mang10;
        mang10[0] = 1;
        System.out.println(Arrays.toString(mang10));
        System.out.println(Arrays.toString(mang11));

        //Clone
        int[] mang12 = {8, 9, 12, 48, 1, 2, 3};
        int[] mang13 = mang12.clone();
        mang12[0] = 100;
        System.out.println(Arrays.toString(mang12));
        System.out.println(Arrays.toString(mang13));
    }
}
