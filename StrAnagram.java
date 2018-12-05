import java.util.*;

public class file {
static void checkAnagram(String str1,String str2){
    char a[] = str1.toCharArray();
    char b[] = str2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    String s1 = Arrays.toString(a);
    String s2 = Arrays.toString(b);
    if(s1.equals(s2)){
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }
}
public static void main(String args[])
	{
		int t;
		String str1,str2;
		
		Scanner sc=new Scanner(System.in);
		
		t=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<t;i++)
		{
			str1=sc.nextLine();			
			str2=sc.nextLine();
			checkAnagram(str1,str2);
		}
	}
}
