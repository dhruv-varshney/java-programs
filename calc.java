import java.util.Scanner;
public class calc {
	static Double calculate(int a, float b, double c){
		Double res = (a+b)*c;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of integer a, float b and double c");
		int a;
		float b;
		double c;
		Double result;
		a = sc.nextInt();
		b = sc.nextFloat();
		c = sc.nextDouble();
		Integer A = a;
		Float B = b;
		Double C = c;
		result = calculate(A.intValue(),B.floatValue(),C.doubleValue());
		System.out.println("the result is "+result);		
	}
}
