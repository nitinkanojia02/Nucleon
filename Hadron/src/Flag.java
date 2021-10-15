
public class Flag {

	public static void main(String[] args) {
		int N=10;
	int []arr=new int[] {1,2,3,4,5,-5,-4,-3,-2,-1};
	int []sum=new int[N];
	for(int i=0;i<N;i++)
	{
		for(int j=i;j<N;j=j+3)
		{
			sum[i]=sum[i]+arr[j];
		}
	}
	for(int n:sum)
	System.out.println(n);
	}
	

}
