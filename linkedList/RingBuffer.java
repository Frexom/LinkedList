package linkedList;

public class RingBuffer extends SimpleList{
	
			
			public RingBuffer() {
				super.first = null;
				super.last = null;
			}
			
			
			
			public Node getFirst() {
		    	return first;
		    }
		    
		    public Node getLast() {
		    	return last;
		    }
			
			
		    /**
		     * Appends the element passed as parameter at the beginning of the list
		    */
		    @Override
		    public void addBeginning(Object element){
		    	if(element != null) {
		    		Node n = new SimpleNode(element);
		    		if(this.isEmpty()) {
		    			first = n;
		    			last = n;
		    			first.setNext(last);
		    			last.setNext(first);
		    		}
		    		else {
		    			n.setNext(first);
		    			last.setNext(n);
		    			first = n;
		    		}
		    	}
		    }
		    
		    
		    /**
		    * Deletes the first element of the list
		    * Method return the deleted elemnt
		    */
		    @Override
		    public Object deleteBeginning(){
		    	if(! this.isEmpty()) {
		    		Object o;
		    		if(first == last) {
		    			o = first.getElement();
		    			first = null;
		    			last = null;
		    		}
			    	else {
			    		o = first.getElement();
			    		last.setNext(first.getNext());
			    		first = first.getNext();
		    		}
		    		return o;
		    	}
		    	return null;
		    }
		    
		    
		    /**
		    * appends the element passed as parameter at the end of the list
		    */
		    @Override
		    public void addEnding(Object element){
		    	if(element != null) {
		    		Node n = new SimpleNode(element);
		    		if(this.isEmpty()) {
		    			first = n;
		    			last = n;
		    			first.setNext(last);
		    			last.setNext(first);
		    		}
		    		else {
		    			last.setNext(n);
		    			n.setNext(first);
		    			last = n;
		    		}
		    	}
		    }
		    
		    
		    /**
		    * deletes the last element of the list
		    * Method return deleted elemnt.
		    */
		    @Override
		    public Object deleteEnding(){
		    	if(! this.isEmpty()) {
		    		Object o;
		    		if(first == last) {
		    			o = first.getElement();
		    			first = null;
		    			last = null;
		    		}
			    	else {
			    		o = last.getElement();
			    		Node n = first;
			    		while(n.getNext() != last) {
			    			n = n.getNext();
			    		}
			    		n.setNext(first);
			    		last = n;
		    		}
		    		return o;
		    	}
		    	return null;
		    }
		    
		    
		    /**
		    *Method searches for the first parameter element and inserts the seconds parameter right before it. Return true if successful, else false.
		    */
		    @Override
		    public boolean insertBefore(Object element1, Object element2){    
		    	boolean result = super.insertBefore(element1,  element2);
		    	last.setNext(first);
		    	return result;
		    }
		    
		    
		    /**
			* return the String representation of the list
		    */
		    @Override
		    public String toString(){
		    	String s = new String();
		    	Node n = first;
		    	if(!this.isEmpty()) {
		    		s = n.getElement().toString();
		    	
		    		
		    		while(n != last) {
		    			s += ", ";
		    			n = n.getNext();
		    			s += n.getElement().toString();
		    		}
		    		return s;
		    	}
		    	return "";
		    }
		    
		    public Node deleteNode(Node n) {
		    	Node cursor = first;
		    	while(cursor != last) {
		    		if(cursor.getNext() == n) {
		    			Node delete = cursor.getNext();
		    			cursor.setNext(delete.getNext());
		    			return delete;
		    		}
		    		cursor = cursor.getNext();
		    	}
		    	return null;
		    }
		    
		    public Node forwardN(Node n, int forward) {
		    	Node cursor = first;
		    	Node return_node = null;
		    	while(cursor != last && return_node == null) {
		    		if(cursor == n) {
		    			return_node = n;
		    		}
		    	}
		    	for(int i = 0; i < forward; i++) {
		    		return_node = return_node.getNext();
		    	}
		    	return return_node;
		    }
		   
	}