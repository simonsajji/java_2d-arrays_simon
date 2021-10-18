package twod;
import java.util.*;
public class SumofFirstElementsisThird {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		boolean bool=false;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				if(j!=arr[i].length-1) {
					sum=arr[i][j]+sum;
				}
				else if(j==arr[i].length-1) {
					if(sum==arr[i][j]) {
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
		
		if(bool==true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
	}

}
