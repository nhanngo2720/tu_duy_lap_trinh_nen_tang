public class App {

    public static int tinhTong(int a, int b) {
//int a, int b chi mang tinh chat tham khao   
        int tong = a + b;        
        return tong;
}
    public static void main(String[] args){
     int x = 10;
     int y = 9;
     int result = tinhTong(x, y);
    System.out.println("ket qua la " + result);
    }
}
