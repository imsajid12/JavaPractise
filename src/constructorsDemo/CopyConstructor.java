package constructorsDemo;

//Java code to initialize the values from one object to another object
class Student {
	int id;
    String name; 
    
    //constructor to initialize integer and string  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    //constructor to initialize another object  
    Student(Student s){  
    id = s.id;  
    name =s.name;  
    }
    
    public String toString() {
    	return id + " " + name;
    }
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(12, "Sajid");
		Student s2 = new Student(s1);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
