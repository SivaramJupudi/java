public class segmentsieve {
	public static void segment(int l, int h)
	{
		boolean arr[]=new boolean[h+1];
		for(int p=2;p*p<=h;p++)
		{
			int sm=(l/p)*p;
			if(sm<l)
			{
				sm+=l;
			}
			for(int i=sm;i<=h;i+=p)
			{
				arr[i]=true;

			}


		}
		for(int i=l;i<=h;i++)
		{
			if(arr[i]==false) {
				System.out.println("prime:" +i);
			}
		}

	}

	public static void main(String[] args)
	{
		segment(10,30);
	}

}



