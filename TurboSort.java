import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class TurboSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times=0;
				Scanner c= new Scanner(System.in);
				try{
			times=c.nextInt();
			ArrayList<Integer> list=new ArrayList<>();
			while(times!=0){
				int listItem=c.nextInt();
				list.add(listItem);
				times--;
			}
			Collections.sort(list);
			PrintWriter writer = new PrintWriter(System.out);
			for (int eachNumber : list) {
				writer.println(eachNumber);
			}
			writer.flush();
		    writer.close();
		}catch(Exception e){
			
		}
	}

}
