import java.util.*;
class student implements Comparable<student>{
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
	public int compareTo(student oo){
	if(id==oo.id)
	{return 0;}
	else{
	if(id>oo.id)
	{return 1;}
	else{
	return -1;
	
	}
	
	}
	
	
	}
}

class test1{


public static void main(String[] args){
student o1 = new student(11,"nidhi",90.8);
student o2 = new student(2,"kriti",90.8);
TreeSet<student> ob = new TreeSet<student>();
ob.add(o1);
ob.add(o2);
	for(student a:ob){
	System.out.println(a);
	}
ArrayList<student> ob1 = new ArrayList<student>();
ob1.add(o1);
ob1.add(o2);
	for(student a:ob1){
	System.out.println(a);
	}
}
}
