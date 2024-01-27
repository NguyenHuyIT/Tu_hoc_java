package BaiTap;

public class BaiTap19_String {
    /*
    Cho: String str1= “English = 78 Science = 83 Math = 68 History = 65”
    1. tính tổng các số trong chuỗi trên
    2. tính trung bình cộng
     */
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        String[] Arr = str1.split(" ");
        int sum = 0, count = 0;
        for(String arr: Arr){
            try {
                int num = Integer.parseInt(arr);
                sum+=num;
                count++;
            }catch (NumberFormatException e){

            }
        }
        double avg = (double) sum / count;
        System.out.println("Tổng các số trong chuỗi: " + sum);
        System.out.println("Trung bình cộng của các số trong chuỗi: " + avg);
    }
}
