package semesterProject;

import java.util.Scanner;

public class eRickshawManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=7,i,j; // 7 vertex	
		int x[]=new int[10];
		int y[]=new int[10];
		System.out.print("Consider a route which has 7 locations, each having code"
				+ "\nVishwavidyalaya Metro=1,\nKamla Nagar=2,"
				+ "\nGTB Nagar=3,\nRoop Nagar=4,\nMalka Ganj=5,"
				+ "\nShakti Nagar=6,\nVijay Nagar=7\n");
		System.out.println("\nSuch that all are connected in cyclic chain form"
				+ "\n(Vishwavidyalaya Metro-Kamla Nagar-GTB Nagar-Roop Nagar-"
				+ "\nMalka Ganj-Shakti Nagar-Vijay Nagar-Vishwavidyalaya Metro)");
		System.out.println("\nEnter the source location (Enter between 1 to 7)");
		int s=sc.nextInt();
		System.out.println("\nEnter the Destination location (Enter between 1 to 7)");
		int d=sc.nextInt();
		for (i=1;i<=n;i++)
			x[i]=i;
		for (j=n;j>=1;j--)
			y[j]=j;
		
		if(s<d)
		{
			if((d-s)<4)
			{
			System.out.println("\nthe path followed is :");
			int count = 0;
			for (i=s;i<=d;i++){
				if(count==0){
					System.out.print("Board E-Rickshaw from "+nameReturn(x[i]));
					count++;
					continue;
				}
				System.out.print(" ---> "+nameReturn(x[i]));
			}
			}
			
			if((d-s)>=4)
			{
				int p=s;
				System.out.println("\nthe path followed is :");
				if(p==1 || p==2 || p==3)
				{
					int count = 0;
					for (i=p;i>=1;i--)
					{
						if(count==0){
							System.out.print("Board E-Rickshaw from "+nameReturn(x[p]));
							count++;
							p--;
							continue;
						}
					System.out.print(" ---> "+nameReturn(x[p]));
					p--;
					}
				}
				int q=d;
				for(j=7;j>=q;j--)
				{
					System.out.print(" ---> "+nameReturn(y[j]));
					
				}
			}
		}
		
		if(s>d)
		{
			if((s-d)<4)
			{
			System.out.println("\nthe shortest path followed is :");
			int count = 0;
			for (i=s;i>=d;i--){
				if(count==0){
					System.out.print("Board E-Rickshaw from "+nameReturn(x[i]));
					count++;
					continue;
				}
				System.out.print(" ---> "+nameReturn(x[i]));
			}
			}
			
			if((s-d)>=4)
			{
				int e=s;
				System.out.println("\nthe path followed is :");
				if(e==5 || e==6 || e==7)
				{
					int count = 0;
					for (j=e;j<=7;j++)
					{
						if(count==0){
							System.out.print("Board E-Rickshaw from "+nameReturn(y[e]));
							count++;
							e++;
							continue;
						}
					System.out.print(" ---> "+nameReturn(y[e]));
					e++;
					}
				}
				int f=d;
				for(i=1;i<=f;i++)
				{
					System.out.print(" ---> "+nameReturn(x[i]));
					
				}
					
			}
				
		}
		if(s==d)
		{
			System.out.println("\nAlready on Destination\n");
		}
		sc.close();
	}
	public static String nameReturn(int i){
		switch(i){
		case 1: return "Vishvidyalaya Metro";
		case 2: return "Kamla Nagar";
		case 3: return "GTB Nagar";
		case 4: return "Roop Nagar";
		case 5: return "Malka Ganj";
		case 6: return "Shakti Nagar";
		case 7: return "Vijay Nagar";
		default: return null;
		}
	}
}
