import java.util.*;
import java.lang.*;
class student{
	int id;
	String name;
	double marks;
	student(int id,String name,double marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
		}
public String toString(){
	return "student{ " + "id=" + id + ",name=" + name + " ,marks=" + marks + "}";
	}
}
class sortroll implements Comparator<student>{
public int compare(student o1,student o2){
if(o1.id==o2.id){
	return 0;}
	else{
		if(o1.id>o2.id){
		return 1;
		}
	else{
	return -1;
	}
	}

}
}
class sortname implements Comparator<student>{
public int compare(student o1,student o2){
if(o1.name.compareTo(o2.name)==0)
return 0;
else{
if(o1.name.compareTo(o2.name)>0)
return 1;
else
return -1;

}

}




}
class sortmarks implements Comparator<student>{
public int compare(student o1,student o2){
if(o1.marks==o2.marks){
	return 0;}
	else{
		if(o1.marks>o2.marks){
		return 1;
		}
	else{
	return -1;
	}
	}

}

}


class comparator1{


public static void main(String[] args){
student o1 = new student(1,"nidhi",91.8);
student o2 = new student(2,"kriti",90.8);
student o3 = new student(3,"muskan",80.8);
ArrayList<student> ob = new ArrayList<student>();
ob.add(o1);
ob.add(o2);
ob.add(o3);
Collections.sort(ob, new sortroll());
System.out.println("Sort acc to id");
	for(student a:ob){
	System.out.println(a);
	}

	Collections.sort(ob,new sortmarks());
	System.out.println("Sort acc to marks");
	for(student a:ob){
	System.out.println(a);
	}
	Collections.sort(ob,new sortname());
	System.out.println("Sort acc to name");
	for(student a:ob){
	System.out.println(a);
	}

}
}
