package clase1;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer>{
	
	private Node node;
	public MyIterator (Node node) {
		this.node = node;
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.node != null;
	}

	@Override
	public Integer next() {
		Node n = this.node;
		this.node = this.node.getNext();
		return n.getInfo();
	}
	
	public Node get() {
		return this.node;
	}

}
