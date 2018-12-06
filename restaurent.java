// You are using Java
import java.util.*;
class restaurent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum =0;
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
                sum = sum +a[j];
            }
            Arrays.sort(a);
            int max = a[n-1];
            int res = max*n - sum;
            System.out.println(res);
            
            
        }
        
    }
}
