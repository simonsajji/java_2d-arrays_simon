package twod;

public class TwodArrays {
	public static void main(String args[]) {
		
		
		int[][] arr2= {{2,1,2},{3,2,2},{5,1,2}};
		
		boolean bool=false;
		
		for(int i=1;i<arr2.length;i++) {
			for(int j=1;j<arr2[i].length;j++) {
				if(i==j) {
					if(arr2[i][j]==arr2[i-1][j-1]) {
						bool=true;
					}
					
					
					else {
						bool=false;
						break;
					}
				}
				
			}
			if(bool==false) {
				break;
			}
			
		}
		System.out.println(bool);
		
		
	}

}
