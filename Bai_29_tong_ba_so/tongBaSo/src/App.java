import java.util.Scanner;

public class App {

    public static int sumOfThree(int a, int b, int c) {
        int tongBaSo = (a + b + c);
       return tongBaSo; 
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tong ba so");
        System.out.println("vui long nhap so thu nhat");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("vui long nhap so thu hai");
        int y = Integer.parseInt(scan.nextLine());
        System.out.println("vui long nhap so thu ba");
        int z = Integer.parseInt(scan.nextLine());
    int result=  sumOfThree(x, y, z);
    System.out.println("ket qua la " + result);
    }
}
