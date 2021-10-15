
public class SuperiorElement {

	public static void main(String[] args) {
		int n=6;
		int []arr=new int[] {2,8,9,7,4,2};
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			int flag=0;
			for(int j=1;j<n;j++)
			{ 
				if(arr[i]>=arr[j])
					flag++;
			}
			if(flag>((n-1)-i))
				count++;
		}
System.out.println(count);
	}

}
