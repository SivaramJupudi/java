public class sievemethod {
	public static void simplesieve(int limit){
		boolean[] arr=new boolean[limit+1];
		for(int i=2;i<=limit;i++){
			arr[i]=true;
		}

		for(int p=2;p*p<=limit;p++){
			if(arr[p]==true){
				for(int i=p*p;i<=limit;i+=p){
					arr[i]=false;
				}
			}
		}

		for(int p=2;p<=limit;p++){
			if(arr[p]==true){
				System.out.println("prime:"+p);
			}
		}
	}
	public static void main(String[] args){
		simplesieve(20);
	}
}
