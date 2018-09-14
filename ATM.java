import java.text.DecimalFormat;
import java.util.Scanner;

class ATM {

	public static void main(String[] args) {
		int amtOfCash;
		float initialBalance;
		Scanner c= new Scanner(System.in);
		try{
		amtOfCash=c.nextInt();
		initialBalance=c.nextFloat();
		
		if( amtOfCash >0 && initialBalance >=0 && initialBalance<= 2000f && amtOfCash<=2000 
				&& ((amtOfCash+0.5f)<initialBalance) && ((amtOfCash %5)==0) ){
			float remBalnc=initialBalance-(amtOfCash+0.5f);
			System.out.printf("%.2f", remBalnc);
		}
		else{
			System.out.printf("%.2f", initialBalance);
		}
		
	}
	catch(Exception e){
	    
	}
	}

}
