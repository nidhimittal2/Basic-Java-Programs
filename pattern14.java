public class pattern14
{
 public static void main(String [] args)
{
int i,j,k=1,m=1,n;
  for(i=0;i<5;i++)
{
for(j=k;j<m+k;j++)
{
System.out.print(j+" ");
}
n=j;
k=n;
m++;
System.out.println();
}
}
}