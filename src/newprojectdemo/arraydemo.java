package newprojectdemo;

public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 10;
int[] iarrayname = {1,2,3,4,5,22,86,96,2,4};
String[] sname = {"suma","abhinay","nanjegowda","rukmini"};
System.out.println(iarrayname[5]);		
/*		System.out.println(iarrayname[2]+iarrayname[2]);
		String[] sname = {"suma","abhinay","nanjegowda","rukmini"};
		System.out.println(sname[2]);
		// modify the array but cannt insert data while run time
		System.out.println("***********");
		System.out.println(sname[3]);
		sname[3] = "shrinivas";
		System.out.println(sname[3]);
		 
		System.out.println("*******");
		 System.out.println(iarrayname[2]);
		iarrayname[2]=56;
		System.out.println(iarrayname[2]);
		System.out.println("***************");
		System.out.println(iarrayname.length);  // length of an array 
		*/
		
		for(int index=0;index<iarrayname.length;index++) {
		System.out.println(iarrayname[index]);
	}
		
		System.out.println("_--------------");
		System.out.println(sname.length);
		for(int index1=0;index1<sname.length;index1++) {
			System.out.println(sname[index1]);
		}      


//for each   

/*for(int temp:iarrayname)
{ 
	System.out.println(temp);   // System.out.print(temp+',');
}

for(String temp: sname) {
	System.out.println(temp);
}*/
	}
}


