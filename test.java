import java.util.*;
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

class test{


public static void main(String[] args){
student o1 = new student(1,"nidhi",90.8);
student o2 = new student(2,"kriti",90.8);
LinkedList<student> ob = new LinkedList<student>();
ob.add(o1);
ob.add(o2);
	for(student a:ob){
	System.out.print(a);
	}
ArrayList<student> ob1 = new ArrayList<student>();
ob1.add(o1);
ob1.add(o2);
	for(student a:ob1){
	System.out.print(a);
	}
}
}
