package newProject;

import java.util.Scanner;

public class Testclass {
	static float rate;
	static int GST;
	static int finalamount;
	
	static void switchcase(int weight)
	{
		switch(weight)
		{
		case 100:
			rate=1000;
			GST=18;
			finalamount=1180;
			break;
		case 400:
			rate=2000;
			GST=18;
			finalamount=2360;
			break;
		case 500:
			rate=4000;
			GST=18;
			finalamount=4720;
			break;
		case 700:
			rate=6000;
			GST=18;
			finalamount=7080;
			break;
		case 1000:
			rate=10000;
			GST=18;
			finalamount=11800;
			break;
		}
	}
	static void disp(int weight)
	{
		switchcase(weight);
		System.out.println("Weight"+"   "+"Amount"+"   "+"GST"+"   "+"Finalamount(+tax)");
		System.out.println(weight+"      "+rate+"   "+GST+"         "+finalamount);
		//System.out.println(weight);
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Enter the weight of the vehicle");
		int weight=scanner.nextInt();
		
		//System.out.println(weight);
		if(weight==100) 
		{
			disp(weight);
		}
		else if(weight==400)
		{
			disp(weight);
		}
		else if(weight==500)
		{
			disp(weight);
		}
		else if(weight==700)
		{
			disp(weight);
		}
		else if(weight==1000)
		{
			disp(weight);
		}
	}

}
