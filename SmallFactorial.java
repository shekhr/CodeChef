import java.math.BigInteger;
import java.util.Scanner;

class SmallFactorial {


	static BigInteger result(BigInteger res){
		
		if(res.equals(BigInteger.ONE) || res.equals(BigInteger.ONE))
			return BigInteger.ONE;
		
			res=res.multiply(result(res.subtract(BigInteger.ONE)));
		return res;
	}
public static void main(String args[]){

	int times=0;


Scanner c= new Scanner(System.in);
try{
times=c.nextInt();
while (times!=0) {

	int num=c.nextInt();
	BigInteger bigResult=new BigInteger(String.valueOf(num));
	System.out.println(result(bigResult));
	
	times--;
}
}catch(Exception e){
    
}

}
}
