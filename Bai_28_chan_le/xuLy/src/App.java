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
// thay giai

// 	// Hàm kiểm tra chẵn lẻ
// 	public static void kiemTraChanLe(int a) {
// 		//boolean kQua;
// 		if (a % 2 == 0) {// so chẵn
// 			//kQua = true;
// 			System.out.println("Là số chẵn");
// 		} else {
// 			//kQua = false; // số lẻ
// 			System.out.println("Là số lẻ");
// 		}
// 		//return kQua;
// 	}

// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		System.out.println("Chương trình kiểm tra một số là số lẻ hay chẵn");
// 		System.out.println("Mời nhập số để kiểm tra");
// 		int so = Integer.parseInt(scan.nextLine());
// 		kiemTraChanLe(so);
// //		if (kq) {
// //			System.out.println("Số chẵn");
// //		} else {
// //			System.out.println("Số lẻ");
// //		}

// 	}

// }