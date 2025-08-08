package implementingAbstraction.examples;

public class RoomNo200 extends Floor implements Building {
	
	/*
	@Override
	public boolean lift() {
		System.out.println("Lift N/A in Room....");
		return false;
	}
	 */

	@Override
	public String color() {
		System.out.println("Interior color of the room is White");
		return "White";
	}
	
	/*
	@Override
	public int floors() {
		System.out.println("No Floors Available in Room");
		return 10;
	}
	*/

	@Override
	boolean reception() {
		System.out.println("Reception area N/A IN Room");
		return false;
	}

}
