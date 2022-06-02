package abstrac;

public class childaircraft extends Parentaircraft {

	public static void main(String[] args) {
		
		
		childaircraft a = new childaircraft();
		a.engine();
		a.colour();
		a.safety();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("White colour is defined");
	}

}
