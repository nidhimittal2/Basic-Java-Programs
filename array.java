import java.util.*;
class array
{
 public static void main(String ar[])
 {
   double value;
  int [] arr = new int[5];
  array ob = new array();
  ob.input(arr);
  value = ob.avg(arr);
  ob.display(value);
  value = ob.max(arr);
  ob.display(value);
  value = ob.min(arr);
  ob.display(value);
 }
void input(int [] a)
 {
 Scanner sc = new Scanner(System.in);
 for(int i=0;i<a.length;i++)
  {
   a[i] = sc.nextInt();
  }
 }
double avg(int a[])
 {
 double sum =0.0d;
 for(int i=0;i<a.length;i++)
 {
  sum = sum + a[i];
 }
 System.out.print("The Average is ");
  return (sum/a.length);
 }
 void display(double av)
 {
  System.out.println(av);
 }
double max (int a[]) 
 { 
  int m =0;
  for(int i=0;i<a.length;i++)
  {
   if(a[i]>m)
   m =a[i];
  }
  System.out.print("The Maximum is ");
 return m;
 }
double min(int a[])
 {
  int m =1000;
  for(int i=0;i<a.length;i++)
  {
   if(a[i]<m)
   m=a[i];
  }
  System.out.print("The Minimum is ");
 return m;
 }
}

 
  