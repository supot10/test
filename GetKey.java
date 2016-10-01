import java.util.Scanner;


public class GetKey {

	public static void main(String[] args) {
		Scanner keyB = new Scanner(System.in);
		System.out.println("กรุณาป้อน รัศมี");
		int x = keyB.nextInt();
		double a = cycle(x);
		System.out.println("พท ที่ได้ = "+a);
	}
	static double cycle(int r){
		double area ;
		area = 3.141 *r*r ;
		return area;
	}
	

}
