
public class Lucas {
	
public static void main(String[] args) {
	int[]arr=new int[41];
	int num=0;
	int N=40;
	int sum=0;
	int flag=0;
	arr[0]=2;
	arr[1]=1;
for(int i=2;i<41;i++)
{
	arr[i]=arr[i-1]+arr[i-2];
}
num=arr[N];
while(num>0)
{
flag=num%10;
sum=sum+flag;
num=num/10;

}
System.out.println(sum);
}


}