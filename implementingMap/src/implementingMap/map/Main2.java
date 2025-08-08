package implementingMap.map;

public class Main2 {
	public static void main(String[] args) {
		MyMap<String,String> monsoons= new MyHashMap<>();
		monsoons.put("1", null);
		monsoons.put("2", "Raining Weather");
		monsoons.put("3", "Cloudy Weather");
		monsoons.put("4", "Sunny Weather");
		
		String value=monsoons.get("2");
		System.out.println(value);
		
		System.out.println(monsoons.containsKey("2")?"available ": "Na");
		
	}

}
