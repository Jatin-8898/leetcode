import java.util.regex.Pattern;

class SplitInPattern{

	private static final String regex = ":";
	private static final String input = "one:two:three:four";


	/*private static final String regex2 = ",";
	private static final String input2 = "1,2,3,4,5,6,7,8";
	*/
	
	public static void main(String[] args) {
		
		Pattern p  = Pattern.compile(regex);
		String[] item = p.split(input);

		for(String s : item)
			System.out.println(s);


		/*Pattern p2  = Pattern.compile(regex2);
		String[] item2 = p2.split(input2);

		for(String s2 : item2)
			System.out.println(s2);
		*/


	}
}