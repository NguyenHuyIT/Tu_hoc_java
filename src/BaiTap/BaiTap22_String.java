package BaiTap;

public class BaiTap22_String {
    public static void main(String[] args) {
        String a = "tôi chăm học tôi chịu khó tôi đẹp zai";
        System.out.println(a);
        String[] arr = a.split(" ");
        int count = 0;
        for(String st : arr){
            if(st.equalsIgnoreCase("tôi")){
                count++;
            }
        }
        System.out.printf("Trong chuỗi trên có %s từ \"tôi\".", count);
    }
}
