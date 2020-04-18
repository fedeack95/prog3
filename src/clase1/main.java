package clase1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		MySimpleLinkedList m1 = new MySimpleLinkedList();
	/*	m1.insertFront(new Integer(7));
		m1.insertFront(new Integer(4));
		m1.insertFront(new Integer(5));
		m1.insertFront(new Integer(3));*/
		m1.insertFront(new Integer(28));
		m1.insertFront(new Integer(14));
		m1.insertFront(new Integer(19));
		m1.insertFront(new Integer(7));
		m1.insertFront(new Integer(2));
		m1.insertFront(new Integer(2));
		m1.insertFront(new Integer(5));
		m1.insertFront(new Integer(3));
		
		System.out.println(getSequence(m1));
	}
	
	public static List<List<Integer>> getSequence(MySimpleLinkedList list) {
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		MyIterator i = (MyIterator) list.iterator();
		
		if(i.get() == null) {
			return output;
		}
		
		List<Integer> sequence = new ArrayList<Integer>();
		sequence.add(i.get().getInfo());
		
		while((i.hasNext())) {
			Integer current =i.next();
			int compare = current.compareTo(i.get().getInfo());
			
			if(compare == -1 ) {
				sequence.add(i.get().getInfo());
				if(!i.hasNext()) {
					output.add(sequence);
				}
			}else if (compare == 1) {
				output.add(sequence);
				sequence = new ArrayList<Integer>();
				sequence.add(i.get().getInfo());
				
			}else {
				sequence = new ArrayList<Integer>();
				sequence.add(i.get().getInfo());
				
			}
			
		}
		
		return output;
	}

}
