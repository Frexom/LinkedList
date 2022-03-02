package linkedList;

public class SimpleNode extends Node {
	private Node suivant;

	public SimpleNode(Object element) {
		super(element);
		//		System.out.println("Noeud Simple : "+element);
		suivant=null;
	}
	@Override
	public Node getNext() {
		return suivant;
	}
	@Override
	public void setNext( Node ns ) {
		suivant=ns;
		
	}	
}


