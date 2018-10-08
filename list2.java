import java.util.*;
class list2{
public static void main(String args[]){
ArrayList <String> ob = new ArrayList<String>();
ArrayList <Integer> ob1 = new ArrayList<Integer>();
ob.add("nidhi");
ob.add(1,"kriti");
ob1.add(1);
ob1.add(2);
ob1.add(3);
ob1.add(2);
ob1.remove(2);
ob1.set(1,5);

Iterator t = ob.iterator();
ob.remove("kriti");
for(String a:ob){
System.out.println(a);
}
System.out.println(ob1);
System.out.println(ob1.get(1));
System.out.println("Index of 1: "+ob1.indexOf(1));
System.out.println("Size of Arraylist: "+ob1.size());
System.out.println("contains 1?: "+ob1.contains(1));
ob.clear();
System.out.println("Size of Arraylist(string): "+ob.size());
Collections.swap(ob1,0,2);
System.out.println("After swapping: "+ ob1);
}
}
