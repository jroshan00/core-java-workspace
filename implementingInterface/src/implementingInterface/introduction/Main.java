package implementingInterface.introduction;

public class Main {
	public static void main(String[] args) {
		Soul roshanSoul=new Roshan();
		roshanSoul.consciousness();
		roshanSoul.knowledge();
		roshanSoul.love();
		roshanSoul.peace();
		roshanSoul.purity();
		System.out.println("\n===========================\n");
		Body roshanBody=(Body)roshanSoul;
		roshanBody.eyes();
		roshanBody.hair();
		roshanBody.nose();
		System.out.println("\n===========================\n");
	}

}
