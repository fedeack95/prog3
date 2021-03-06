package clase1;

import java.util.Iterator;

public class MySimpleLinkedList implements  Iterable<Integer> {
protected Node first;
protected int size;	
	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
	}
	
	public void insertFront(Integer o) {
		Node tmp = new Node(o,null);
		tmp.setNext(this.first);
		this.size++;
		this.first = tmp;
	}
	//poner el primero en una variable
	public Integer extractFront() {
		Integer current = this.first.getInfo();
		if(this.first == null) {
			return null;
		}
		this.first =this.first.getNext(); 
		this.size--;
		
		return current;
	}

	public boolean isEmpty() {
		
		return (this.first == null);
	}

	public int size() {
		return this.size;
	}
	
	public Integer get(int index) {
		
		if (this.size <= index) {
			return null;
		}
		Node n = this.first;
		for(int i = 0; i < index; i++) {
			n = n.getNext();
			
		}
		return n.getInfo();
	}

	@Override
	public Iterator<Integer> iterator() {
         return new MyIterator(this.first);         
	}
	
	
	
	
}
