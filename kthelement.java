import java.util.LinkedList;


public class kthelement {

	public static void main(String[] args) {
		
		String input="s athi sh";
		space(input);
		
		
	}
	
	private static void space(String test) {
		int count = 0;
		for(int i=0;i<test.length();i++){
			if(test.charAt(i)==' ')
				++count;
		}
		int size=test.length()+(count*2);
		char[] testchar=new char[size];
		int k=0;
		for(int j=0;j<test.length();j++,k++){
			if(test.charAt(j)==' '){
				testchar[k]='%';
				testchar[++k]='2';
				testchar[++k]='0';
				}
			else{
			testchar[k]=test.charAt(j);
			}
		}
		System.out.print(testchar);
		
	}
}
