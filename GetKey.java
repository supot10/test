import java.util.Scanner;


public class GetKey {

	public static void main(String[] args) {
		Scanner keyB = new Scanner(System.in);
		System.out.println("กรุณาป้อน รัศมี");
		int x = keyB.nextInt();
		double a = cycle(x);
        show(4,65);
		System.out.println("พท ที่ได้ = "+a);
	}
	static double cycle(int r){
		double area ;
		area = 3.141 *r*r ;
		return area;
	}
    //------------------
    static void show (int x,int y){
        x =x*y;
    System.out.println("พท total ="+);
    
    }
	

}
