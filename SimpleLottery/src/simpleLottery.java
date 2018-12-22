import java.util.Scanner;

public class simpleLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		double winAmount=500.00;
		double allNumberwinAmount=300.00;
		double oneNumberwinAmount=100.00;
		
		int number=(int)(Math.random()*101);// This generate a number 0-200 
		System.out.println("|----------------------------------------|");
		System.out.println("     Simple Lottery Programme 2 digits " );
		System.out.println("|----------------------------------------|");
		System.out.println();
		System.out.print("  Enter your lottery Number(2 digits): " );
		int pickedNumber=input.nextInt();
		
		
int lotteryunm1=number/10; // to get  the deviser  number  to valid user input
int lotterynum2=number%10;//  to get  the reminder  number to valid  user input 

int pickeNum1=pickedNumber / 10; // 
int pickeNum2=pickedNumber % 10;//

System.out.println("The lottery Number is " + number);

if(pickedNumber==number) // exactly  matching number
{
	System.out.println("You won the Full Amount: €"+ winAmount);
	
	}
else if(pickeNum1==lotterynum2 && pickeNum2==lotteryunm1 )// number match but not pattern match
{
	System.out.println("You won all  number Matching winning Amount: €"+ allNumberwinAmount);
	
	}
else if(pickeNum1==lotteryunm1 || pickeNum1==lotterynum2 || lotteryunm1==pickeNum1 ||lotterynum2==pickeNum2) // Single digit matching 
{
	System.out.println("You won the single digit matching winning Amount: €"+oneNumberwinAmount);

}
else 
{
	System.out.println("Better Luck Next Time !! ");
	}
input.close();
}


		
}
	
	
	
