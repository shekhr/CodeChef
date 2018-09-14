import java.util.Scanner;

class Enormous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner c = new Scanner(System.in);
	try{	
		double n=c.nextDouble();
		double k=c.nextDouble();
	   int count=0;
		for (int i = 0; i <n; i++) {
			
			double j=c.nextDouble();
			if(j%k==0)
				count++;
		}
	    
		System.out.println(count);
	}catch(Exception e){
   
}
}
}
