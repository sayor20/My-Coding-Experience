public class SimpleCollection {
	private static int[] bubblesort(int[] test){
		boolean flag=true;
		int i,temp;
		while(flag){	
			flag=false;
			for(i=0;i<test.length-1;i++){
				if(test[i]>test[i+1]){
					temp=test[i+1];
					test[i+1]=test[i];
					test[i]=temp;
					flag=true;
				}
			}
		}
		return test;
	}
	
	private static int[] selectionsort(int[] test){
		for(int i=test.length-1;i>0;i--){
			int maxvalue=test[i];
			for(int j=i-1;j>=0;j--){
				if(test[j]>maxvalue){
					int temp=maxvalue;
					maxvalue=test[j];
					test[j]=temp;					
			}	
			test[i]=maxvalue;
		}		
	}
		return test;	
	}
	
	public static void main(String[] args) {
		int[] unsorted={3,4,1,8,7};
		int i,j;
		System.out.println("The array before sorting: ");
		for(i=0;i<unsorted.length;i++){
			System.out.print(unsorted[i]+" ");
		}
		int sorted[]= selectionsort(unsorted);
		System.out.println("\n");		
		System.out.println("The array after insertion sort: ");
		for(j=0;j<unsorted.length;j++){
			System.out.print(sorted[j]+" ");
		}
	}
}
