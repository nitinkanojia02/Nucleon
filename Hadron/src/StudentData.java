
public class StudentData 
{
String Name ;
int Age;
int Rollno;

	public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public int getRollno() {
	return Rollno;
}

public void setRollno(int rollno) {
	Rollno = rollno;
}

public void details()
{
	System.out.println(getName()+ " , "+ getAge() +" , "+ getRollno());
}
	
public static void main(String[] args) 
	
{
		StudentData s = new StudentData();
		
		s.setName("NITIN");
		s.setAge(26);
		s.setRollno(69);
		System.out.println(s.getName() +"\n"+ s.getAge() +"\n"+ s.getRollno());
		s.details();
		
}

}
