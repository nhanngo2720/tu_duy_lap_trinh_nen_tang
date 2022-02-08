import java.util.Scanner;

public class App {

    public static boolean chanHayLe( int a) {
        boolean kQua ;
        if (a%2 == 0) { //kQua la so chan
            kQua = true;
        }else{
            kQua = false;
        }
        return kQua;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("input your number");
        int x = Integer.parseInt(scan.nextLine());

        // int result = chanHayLe(x);
        if(chanHayLe(x) == true){ 
        System.out.println("so ban vua nhap la chan ");
    }else{ 
        System.out.println("So ban vua nhap la le ");
    }
}
}
