import java.util.*;
public class phi_euler{
	public static int euler(int n)
	{
		int result=n;
		for(int p=2;p*p<=n;p++)
		{
			if(n%p==0)
			{
				while(n%p==0)
				{
					n/=p;
				}
				result-=result/p;
			}

		}
		if(n>1)
		{
			result-=result/n;
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int phi=euler(n);
		System.out.println("phi value:"+phi);


	}

}


