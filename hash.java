import java.util.*;
class hash{
public static void main(String args[]){
HashMap<Integer,String> ob = new HashMap<Integer,String>();
ob.put(1,"Nidhi");
ob.put(2,"chair");
/*for(Map.Entry k:ob.entrySet()){
  System.out.print(k.getValue()+ " ");
  System.out.print(k.getKey());
  System.out.println();
}*/
Set s = ob.entrySet();
Iterator it = s.iterator();
while(it.hasNext()){
  Map.Entry e = (Map.Entry)it.next();
  System.out.println(e);
}
System.out.println(ob.containsKey(3));
System.out.println(ob.containsValue("chair"));
System.out.println(ob.get(2));
}



}
