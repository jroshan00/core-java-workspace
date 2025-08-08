package InterviewPrep.string;

public class CountVowelConsonants {
	public static void main(String[] args) {
		String str="RoShan";
		System.out.println("String value : "+str);
		int[] count=countVowelConsonants(str);
		System.out.println("Total Vowels : "+count[0]);
		System.out.println("Total Consonants : "+count[1]);
	}
	
	public static int[] countVowelConsonants(String str) {
		char[] ch=str.toCharArray();
		int countVowel=0;
		int countConsonent=0;
		for(char c:ch) {
			if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'
				|| c=='A'|| c=='E' || c=='I' || c=='O' || c=='U') {
				countVowel++;
			}else {
				countConsonent++;
			}
		}
		return new int[]{countVowel,countConsonent};
	}

}
