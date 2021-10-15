import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Candidate
{
	String name;
	short age;
	int year;
	double per12,pergrad;
	
	public Candidate(String name, short age, int year, double per12, double pergrad) 
		{
		
		this.name = name;
		this.age = age;
		this.year = year;
		this.per12 = per12;
		this.pergrad = pergrad;
		}
	
		public String toString()
		{
			return "["+name+","+age+","+year+","+per12+","+pergrad+"]";
		}
		
}

class Company
{
	short age= 24;
	short year= 2019;
	double per12= 60;
	double pergrad = 65;
}
public class JobPortal {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		HashSet<Object> hs = new HashSet<>();
		Company c = new Company();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Name , Age , Year of passout , 12th Percentage , Graduation Percentage");

			String name = sc.next();
			short age = sc.nextShort();
			int year = sc.nextShort();
			double per12 = sc.nextDouble();
			double pergrad = sc.nextDouble();
			Candidate cand = new Candidate(name, age, year, per12, pergrad);
			if ((age >= c.age) && (year >= c.year) && (per12 >= c.per12) && (pergrad >= c.pergrad))
				al.add(name);
			hs.add(cand);

			System.out.println("Successfully Added Data");
			System.out.println("Do You Wnat To Enter More");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("no"))
				break;
		}
		for (String eligible : al) {
			System.out.println("Eligible Candidates Are ");

			System.out.println(eligible);
		}
	}
}