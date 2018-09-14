import java.util.Scanner;

class Factorial {
	
	static int result(int res){
		
		res=res/5;
		if(res/5!=0){
			res= res+result(res);
		}
		return res;
	}
public static void main(String args[]){

	int times=0;


Scanner c= new Scanner(System.in);
try{
times=c.nextInt();
while (times!=0) {

	int num=c.nextInt();
	
	System.out.println(result(num));
	
	times--;
}
}catch(Exception e){
    
}
}
}
