// You are using Java
import java.util.*;
class file{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int k = sc.nextInt();
            int n = sc.nextInt();
            int pa[] = new int[n];
            int pr[] = new int[n];
            
            for(int i=0;i<n;i++){
                pa[i] = sc.nextInt();
                pr[i] = sc.nextInt();
                
            }
            int req = x-y;
            int flag =0;
            for(int i=0;i<n;i++){
                if(req<=pa[i] && k>=pr[i]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println("LuckyChef");
            }
            else{
                System.out.println("UnluckyChef");
            }
        }
        
    }
}
