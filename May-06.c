//program for finding unique character in a string

public class demo {

	public static void main(String[] args) {
		
		String input="sathish";
		uniquechar(input);		
	}
	
	private static void uniquechar(String test) {
		boolean[] check=new boolean[255];
		int aval;
		for(int i=0;i<test.length();i++){
			aval=(int) test.charAt(i);
			if(check[aval]==true){
				System.out.println("Not Unique");
				return;
			}
			check[aval]=true;			
		}		
		System.out.println("Unique");
	}
}

//program to reverse a c-based string


public class demo{

	public static void main(String[] args) {
		
		String input="sathish";
		reversestring(input);		
	}
	
	private static void reversestring(String test) {
		StringBuilder reverse=new StringBuilder();
		int i;
		for(i=test.length()-1;i>=0;i--)
			reverse.append(test.charAt(i));
		reverse.append('\0');
		System.out.println(reverse);
	}
}
