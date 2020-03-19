package newProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class newclass {
	static int Amount;
	static int GST;
	static float finalamount;
	newclass(int Amount,int GST,float finalamount)
	{
		this.Amount=Amount;
		this.GST=GST;
		this.finalamount=finalamount;
	}
	
	public void servicesprovided(int weight)
	{
		System.out.println("Please  choose the service required");
		System.out.println("1.Service and Repair(Specific)"+"\n"+"2.General Service "+"\n"+"3.Car Wash"+"\n"+"4.Other Services");
		System.out.println("From the above how many service do you want");
		Scanner scanner= new Scanner(System.in);
		int no_of_services=scanner.nextInt();
		ArrayList<Integer> inputlist = new ArrayList<Integer>(no_of_services);
		System.out.println("Select the services");
		 for (int i=1; i<=no_of_services; i++) 
		 {
			 Scanner sc = new Scanner(System.in);
		 	 int servicevalue=sc.nextInt();
		 	 inputlist.add(servicevalue);
		 }	 
		 //System.out.println(inputlist);
		 function(weight,inputlist);
		 remove(weight,inputlist);
	}
	public static void function(int weight, ArrayList<Integer> inputlist) 
	{
		
		
		for (int i=0;i<inputlist.size();i++)
		{
			Amount=(int) (weight*1.5);
			if(inputlist.get(i)==1)
			{
				Amount+=1000;
				finalamount=(float) ((Amount*1.18)+(Amount*0.15));
				System.out.println("Weight"+"   "+"Amount"+"   "+"GST"+"   "+"Discount"+"   "+"Finalamount(+tax)");
				System.out.println(weight+"      "+Amount+"     "+GST+"         "+"15%"+"         "+finalamount);
			}
			if(inputlist.get(i)==2)
			{
				Amount+=500;
				finalamount=(float) ((Amount*1.18)+(Amount*0.10));
				System.out.println("Weight"+"   "+"Amount"+"   "+"GST"+"   "+"Discount"+"   "+"Finalamount(+tax)");
				System.out.println(weight+"      "+Amount+"     "+GST+"         "+"10%"+"         "+finalamount);
			}
			if(inputlist.get(i)==3)
			{
				Amount+=300;
				finalamount=(float) ((Amount*1.18));
				System.out.println("Weight"+"   "+"Amount"+"   "+"GST"+"   "+"Discount"+"   "+"Finalamount(+tax)");
				System.out.println(weight+"      "+Amount+"     "+GST+"         "+"0%"+"         "+finalamount);
			}
			if(inputlist.get(i)==4)
			{
				Amount+=1500;
				finalamount=(float) ((Amount*1.18));
				System.out.println("Weight"+"   "+"Amount"+"   "+"GST"+"   "+"Discount"+"   "+"Finalamount(+tax)");
				System.out.println(weight+"      "+Amount+"     "+GST+"         "+"0%"+"         "+finalamount);
			}
		}
	}
	@SuppressWarnings("deprecation")
	public static void remove(int weight,ArrayList<Integer> inputlist)
	{
		System.out.println("Do you want to remove any service");
		Scanner scc= new Scanner(System.in);
		boolean removeinput=scc.hasNextBoolean();
		if(removeinput)
		{
			System.out.println("Enter the service you want to remove");
			Scanner scanner= new Scanner(System.in);
			int value=scanner.nextInt();
			inputlist.remove(new Integer(value));
			System.out.println(inputlist);
			function(weight,inputlist);
			
			
		}
		
	}
	
}

class mainclass extends newclass {
	
	
	
	mainclass(int Amount, int GST, float finalamount) {
		super(Amount, GST, finalamount);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		System.out.println("Choose your category vehicle");
		System.out.println("1.100"+"\n"+"2.400"+"\n"+"3.500"+"\n"+"4.700"+"\n"+"5.1000");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Choose your vehicle weight");
		int weight=scanner.nextInt();
		//System.out.println(weight);
		newclass obj = new newclass(0,18,0);
		obj.servicesprovided(weight);
		
		

		
	}

}
