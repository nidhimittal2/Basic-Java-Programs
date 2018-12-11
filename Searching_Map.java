import java.util.*;

class Student
{
	private String name, department, emailId;
  
void setName(String name){
    this.name = name;
}
void setDepartment(String department){
    this.department = department;
}
void setEmailId(String emailId){
    this.emailId = emailId;
}
String getName(){
    return name;
}
String getDepartment(){
    return department;
}
String getEmailId(){
    return emailId;
}
}
class SearchStudent{
    
public void searchStudent(Map<String,Student> m,String id){
    id = id.toUpperCase();
    Student s;
    if(m.containsKey(id)){
        s = m.get(id);
        System.out.println("Student Details");
        System.out.println(s.getName()+ " " + s.getEmailId() + " " + s.getDepartment());
    }
    else{
        System.out.println("Student Not Found");
    }
    
}
}
public class Searching_Map
{
	public static void main(String args[])
	{
		SearchStudent stud=new SearchStudent();
		List<Student> lstStudent=new ArrayList<>();;
		Map<String,Student> mapStudent=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of students");
		int n=sc.nextInt();
		String id,name,email,dept;
		
		if(n>0)
		{
		for(int i=0;i<n;i++){
			Student st=new Student();
			//.out.println("Enter the details of student "+(i+1));
			id=sc.next();
			name=sc.next();
			st.setName(name);
			email=sc.next();
			st.setEmailId(email);
			dept=sc.next();
			st.setDepartment(dept);
			
			lstStudent.add(st);
			mapStudent.put(id,lstStudent.get(i));
			
		}
		    id=sc.next();
			stud.searchStudent(mapStudent,id);
		}else
		{
			System.out.println("No Record To Display");
		}
		
	}

}
