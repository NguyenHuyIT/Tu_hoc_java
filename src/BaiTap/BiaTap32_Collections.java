package BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class BiaTap32_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> danhsach = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int element = sc.nextInt();
            danhsach.add(element);
        }
        System.out.println("Số nhỏ thứ 2 trong danh sách là: " + second_small(danhsach));
        System.out.println("Vị trí của số nhỏ thứ 2 trong danh sách là: " + danhsach.indexOf(second_small(danhsach)));
        System.out.println("Số lớn thứ 2 trong danh sách là: " + second_big(danhsach));
        System.out.println("Vị trí của số lớn thứ 2 trong danh sách là: " + danhsach.indexOf(second_big(danhsach)));
    }

    static int second_small(ArrayList<Integer> danhsach){
        int firstMin, secondMin;
        if(danhsach.getFirst() < danhsach.get(1)){
            firstMin = danhsach.getFirst();
            secondMin = danhsach.get(1);
        }else {
            secondMin = danhsach.getFirst();
            firstMin = danhsach.get(1);
        }
        for(int i = 2; i < danhsach.size(); i++){
            int Min = danhsach.get(i);
            if(Min < firstMin){
                secondMin = firstMin;
                firstMin = Min;
            }else if (danhsach.get(i) < secondMin){
                secondMin = Min;
            }
        }
        return secondMin;
    }

    static int second_big(ArrayList<Integer> danhsach){
        int firstMax, secondMax;
        if(danhsach.getFirst() > danhsach.get(1)){
            firstMax = danhsach.getFirst();
            secondMax = danhsach.get(1);
        }else {
            secondMax = danhsach.getFirst();
            firstMax = danhsach.get(1);
        }
        for(int i = 2; i < danhsach.size(); i++){
            int Max = danhsach.get(i);
            if(Max > firstMax){
                secondMax = firstMax;
                firstMax = Max;
            }else if (danhsach.get(i) > secondMax){
                secondMax = Max;
            }
        }
        return secondMax;
    }
}
