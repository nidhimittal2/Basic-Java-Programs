// You are using Java
import java.util.*;
class file{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            String s = sc.next();
            int l = s.length();
            if(l%2 == 0){
                String sub1 = s.substring(0,l/2);
                String sub2 = s.substring(l/2,l);
                char s1[] = sub1.toCharArray();
                Arrays.sort(s1);
                sub1 = Arrays.toString(s1);
                s1 = sub2.toCharArray();
                Arrays.sort(s1);
                sub2 = Arrays.toString(s1);
                if(sub1.equals(sub2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
                
            }
            else{
                String subb1 = s.substring(0,l/2);
                String subb2 = s.substring((l/2)+1 , l);
                char w[] = subb1.toCharArray();
                Arrays.sort(w);
                subb1 = Arrays.toString(w);
                w = subb2.toCharArray();
                Arrays.sort(w);
                subb2 = Arrays.toString(w);
                if(subb1.equals(subb2)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                
                
            }
        }
        
        
        
    }
    
    
}
