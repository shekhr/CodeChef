import java.util.Scanner;
 
class PackagingCupcakes {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		try {
		  int times = c.nextInt();
		for(int i=0; i<times; i++){
			int n = c.nextInt();
			System.out.println(n/2 + 1);
		}  
		} catch(Exception e) {
		}
		
 
	}
 
}
 