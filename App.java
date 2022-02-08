import java.util.Scanner;

public class App {

public static int maxValue(int a ,int  b , int c ) {
    // dung int la de check so nguyen
        int maxValue = a;
         if (b> a) {
             maxValue = b;
         }
         if (c> b) {maxValue = c;
         }
         //dung 2 if la vi kiem tra lan luot, neu dung else la sai 
         return maxValue; 
     }
public static void main(String[] args){
    //day la so cho san 
    // int x = 1;
    // int y = 2;
    // int z = 3;
    // tao input cho nguoi dung
Scanner scan = new Scanner(System.in);
//xuat thong bao nhap vao 3 so
System.out.println("MaxValue finder");
System.out.println("input your 1st number");
int x = Integer.parseInt(scan.nextLine());
System.out.println("input your 2nd number");
int y = Integer.parseInt(scan.nextLine());
System.out.println("input your 3rd number");
int z = Integer.parseInt(scan.nextLine());

int result = maxValue(x,y,z);
System.out.println("so lon nhat is: " + result); 
    }
}
