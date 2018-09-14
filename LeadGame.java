import java.util.Scanner;

class LeadGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int times=0;
		
		Scanner c= new Scanner(System.in);
		
		try {
			times= c.nextInt();
			int playerA[]=new int[times+1];
			int playerB[]=new int[times+1];
			int winner[]=new int[times+1];
			int lead[]=new int[times+1];
			playerA[0]=0;
			playerB[0]=0;
			winner[0]=0;
			lead[0]=0;
			for (int i = 1; i <= times; i++) {
				playerA[i]=c.nextInt();
				playerA[i]=playerA[i-1]+playerA[i];
				playerB[i]=c.nextInt();
				playerB[i]=playerB[i-1]+playerB[i];
				
				if(playerA[i]>playerB[i])
				{
					winner[i]=1;
					lead[i]=playerA[i]-playerB[i];
				}else{
					winner[i]=2;
					lead[i]=playerB[i]-playerA[i];
				}
														
			}
			
			for (int i = 1; i <= times; i++) {
				if(lead[i]>lead[0]){
					lead[0]=lead[i];
					winner[0]=winner[i];
				}
				
				}
			System.out.println(winner[0]+" "+lead[0]);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
