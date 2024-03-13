
public class Fib {

	public static void main(String[] args) {
		int f = fib(3);
		
		
		System.out.println(f);
		
	}
	
	
	public static int fib(int num) {
		if(num==0) return 0;
		if(num<3) return 1;
		return fib(num-1) + fib(num-2);
	}
	
	
}
