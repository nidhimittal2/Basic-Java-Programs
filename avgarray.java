import java.util.*;
public class avgarray {
    static void avgArray(int arr[],int n,int avg)
	{
int b[] = new int[n];

for(int i=0;i<n;i++){
    int r = (avg+arr[i])/2;
    int c=0;
    for(int j=0;j<n;j++){
        if(r == arr[j]){
            b[i]++;
           
        }
         
    }
}
for(int i=0;i<n;i++){
    System.out.print(b[i]+ " ");
}
System.out.println();
}   
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n,avg;
		for(int i=0;i<t;i++)
		{
			n=sc.nextInt();
			avg=sc.nextInt();
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
			avgArray(arr,n,avg);
		}
	}
}
