import java.util.*;
import java.util.Arrays;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
			int testCases=sc.nextInt();
			int diff=0;
		for(int t=0;t<testCases;t++)
		{// You are using Java
int n = sc.nextInt();
int k = sc.nextInt();
int a[] = new int[n];
for(int i=0;i<n;i++){
    a[i] = sc.nextInt();
}
Arrays.sort(a);
int s1=0,s2=0;
for(int i=0;i<k;i++){
    s1 = s1 + a[i];
}
for(int j=k;j<n;j++){
    s2 = s2 + a[j];
}
if(s2>=s1){
    diff = s2-s1;
}
else{
    diff = s1-s2;
}		System.out.println(diff);
		}
		
	}
}
