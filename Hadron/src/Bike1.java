
public class Bike1 extends Bike {

	@Override
	void StartEngine() {
		System.out.println("Start engine");
		
	}

	@Override
	void CloseEngine() {
		System.out.println("Close engine");
		
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Bike b=new Bike1();
		b.CloseEngine();
		b.StartEngine();
	}
	
	

}
