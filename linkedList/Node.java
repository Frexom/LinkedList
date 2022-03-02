package linkedList;

public abstract class Node {
	private Object element;

	public Node(Object element){
		this.element=element;
	} 
	public Object getElement() {
		return element;
	}
	public void setElement(Object e) {
		element=e;
	}
	public abstract Node getNext();
	public abstract void setNext(Node ns);
	public String toString(){
		return this.getClass()+"("+element.getClass()+": "+element+")";
	}
}


