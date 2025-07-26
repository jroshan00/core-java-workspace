package implementingEnum.intro;

//import java.lang.Enum;
public class Main {
	public static void main(String[] args) {
		Day today=Day.MONDAY;
		
		switch(today) {
		case MONDAY:
			System.out.println("HURRAY!! Week Started ");
			break;
		case SUNDAY:
			System.out.println("Weekend vibes!!");
			break;
		default:
			break;
		}
		
		
	}

}
