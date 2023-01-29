package Arrays;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
		int [] obj= {1,2,3,5,4,3,5,6,7,8,2,1};
		
		System.out.println("The Duplicates Array Are as follow ");

		for(int i=0;i<obj.length;i++) {
			for(int j=i+1;j<obj.length;j++) {
				
				if(obj[i]==obj[j]) {
					
					System.out.println(obj[j]);
					
				}
			}
		}
		
	}

}
