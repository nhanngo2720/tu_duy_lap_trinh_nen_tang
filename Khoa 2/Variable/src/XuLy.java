import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n;
		int unit;
		int ten;
		int hundred;
		int sum;
		Scanner nhap = new Scanner(System.in);
		System.out.print(" Vui long nhap vao n ");
		// gán cho n vào scanner nhập
		n = Integer.parseInt(nhap.nextLine());
		hundred = n / 100;
		ten = n % 100 / 10;
		unit = n / 10;
		sum = hundred + ten + unit;
		System.out.print("Tong cua 3 chu so la " + n + " la: " + sum);

	}

}
