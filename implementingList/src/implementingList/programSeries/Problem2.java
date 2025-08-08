package implementingList.programSeries;

import java.util.List;
import java.util.ListIterator;

public class Problem2 {
	public static void main(String[] args) {
		List<Integer> list= List.of(1,2,3,4,5);
		
		ListIterator<Integer> itr=list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.nextIndex() +" -> "+itr.next() );
		}
		
		System.out.println("=======================================");
		
		ListIterator<Integer> itrr=list.listIterator(list.size());
		while(itrr.hasPrevious()) {
			System.out.println(itrr.previousIndex() +" -> "+itrr.previous() );
		}
	}

}
