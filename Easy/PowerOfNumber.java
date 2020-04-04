import java.util.*;

class PowerOfNumber {

	/*Barclays get power of an number and return the last elemnt of it */
	public static void main(String[] args) {
		int a = 6;
		int b = 17;
		int res = getPower(a,b);
		System.out.println(res);
	}

	private static int getPower(int a, int b){
		int ans  = (int)Math.pow(a,b);

		ans = ans % 10;

		return ans;
	}
	
}