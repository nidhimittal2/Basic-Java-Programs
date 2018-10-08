import java.util.*;
class ll1{

public static void main (String args[]){
LinkedList<String> ob = new LinkedList<String>();
HashSet<String> ob1 = new HashSet<String>();
ob.add("AB");
ob.addFirst("ab");
ob.addLast("12");
ob.add(1,"cf");
ob.remove(2);
ob.removeFirst();
ob.removeLast();
ob1.add("nidhi");
ob1.add("kriti");
ob1.add(null);
for(String a:ob){
System.out.print(a);

}
ob.add("AB");
Object o = ob.getFirst();
System.out.print(o);
Object o1 = ob.getLast();
System.out.print(o1);
for(String a:ob1){
System.out.print(a);

}
}

}
