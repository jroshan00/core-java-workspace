package implementingAbstraction.examples;

public abstract class Floor implements Building {
	private int floors;
	abstract boolean reception();
	
	protected Floor() {
	}
	
	protected Floor(int floors) {
		this.floors=floors;
	}
	
	@Override
	public boolean lift() {
		System.out.println("Lift Available....");
		return true;
	}

	@Override
	public String color() {
		System.out.println("Interior color of the room is Grey");
		return "Grey";
	}

	@Override
	public int floors() {
		System.out.println("There are 20 floors available");
		return floors;
	}
}
