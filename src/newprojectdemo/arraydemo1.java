package newprojectdemo;

public class arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[][] iarrayname = {{1,2,3},{4,5,6},{7,8,9}};
     
 
     	for (int i=0;i<iarrayname.length;i++)
		{
     		if(i%2==0) {
		for(int j=0; j<iarrayname.length;j++) {
			
			System.out.print(iarrayname[i][j] + " ");	
		
		}System.out.println();
     		}
     		else {
			for(int j=iarrayname.length-i;j>=0;j--) {
			System.out.print(iarrayname[i][j] + " ");
	
	}
	System.out.println();
	
	}
		}
	}
}






