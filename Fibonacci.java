package fibonacci;

public class Fibonacci {
	public static int of(int n){
		if (n==1||n==2){
			return 1;
		}
		return 2*n-3;
	}
	public static void main(String[] args){
		for(int i=1;i<=200;i++){
			System.out.println(Fibonacci.of(i));
		}
	}
}
