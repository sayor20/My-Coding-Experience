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