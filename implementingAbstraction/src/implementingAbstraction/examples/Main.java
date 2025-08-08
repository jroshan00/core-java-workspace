package implementingAbstraction.examples;

public class Main {
	public static void main(String[] args) {
		Building building=new RoomNo200();
		System.out.println(building);
		building.color();
		building.floors();
		building.lift();
		
		System.out.println("=========================");
		
		//Floor floors=new Floor();  can't instantiate the Floor abstract class
		Floor floor=new RoomNo200();
		System.out.println(floor);
		floor.color();
		floor.floors();
		floor.lift();
		floor.reception();
		
		System.out.println("=========================");
		
		RoomNo200 room=new RoomNo200();
		System.out.println(room);
		room.color();
		room.floors();
		room.lift();
		room.reception();
	}

}
