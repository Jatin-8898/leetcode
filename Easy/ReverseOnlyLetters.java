class ReverseOnlyLetters{

	public static void main(String[] args) {
		String s = "abc!=detchg-?hy&*yoo";
		System.out.println("THE REVERSED LETTERS ARE: "+ reverseOnlyLetters(s));
	}
	
	/*The idea is to take 
		1.	Save only letters into StringBuilder;
		2.  Reverse it;
		3.	Insert the non-letters like !=& whenever they are found.
	*/

	private static String reverseOnlyLetters(String s){
		StringBuffer sb = new StringBuffer();
		
		for(char c : s.toCharArray()){
			if(Character.isLetter(c))		//if its a letter then append it to the SB
				sb.append(c);				//eg abcdetchghyyoo in the sb
		}
		sb.reverse();						//Since we want reverse do the rev



		for (int i=0; i<s.length(); ++i) {		//take a loop from start to end
			char c = s.charAt(i);				//get the character

			if(!Character.isLetter(c)){			//if its not the letter 
				sb.insert(i, c);				//Insert at ith place the non letter we found
				System.out.println(sb.toString());
			}
		}

		return sb.toString();
	}	
}