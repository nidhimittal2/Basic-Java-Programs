import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cupcake {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[] = new int[n];
for(int i=0;i<n;i++){
    a[i] = sc.nextInt();
}
Arrays.sort(a);
int sum =0,k=0;
for(int i=n-1;i>=0;i--){
    sum = (int) sum+ a[i] * (int)Math.pow(2,k);
    k++;
}
System.out.println(sum);
  }
}

