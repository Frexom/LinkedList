package linkedList;

public class SimpleList {
		Node first;
		Node last;
		
		
		public SimpleList() {
			this.first = null;
			this.last = null;
		}
		
		
		
		/**
	    * returns true is the list is empty, else false
	    */
	    public boolean isEmpty(){
	    	return this.first == null;
	    }	
	    /**
	     * Appends the element passed as parameter at the beginning of the list
	    */
	    public void addBeginning(Object element){
	    	
	    	Node n = new SimpleNode(element);
	    	if(this.isEmpty()) {
	    		this.last = n;
	    	}
	    	n.setNext(first);
	    	this.first = n;
	    	
	    }
	    /**
	    * Deletes the first element of the list
	    * Method return the deleted elemnt
	    */
	    public Object deleteBeginning(){
	    	Object tmp = first.getElement();
	    	if(this.isEmpty()) {
	    		first = null;
	    		last = null;
	    	}
	    	else {
	    		first = first.getNext();
	    	}
	    	return tmp;
	    }
	    
	    
	    /**
	    * return the String representation of the list
	    */
	    public String toString(){
	    	String s = new String();
	    	Node n = first;
	    	if(!this.isEmpty()) {
	    		s = n.getElement().toString();
	    	
	    		
	    		while(n.getNext() != null) {
	    			s += ", ";
	    			n = n.getNext();
	    			s += n.getElement().toString();
	    		}
	    		return s;
	    	}
	    	return "";
	    }
	    
	    
	    /**
	    * appends the element passed as parameter at the end of the list
	    */
	    public void addEnding(Object element){
	    	Node n = new SimpleNode(element);
	    	last.setNext(n);
	    	this.last = n;
	    }
	    
	    
	    /**
	    * deletes the last element of the list
	    * Method return deleted elemnt.
	    */
	    public Object deleteEnding(){
	    	if(! this.isEmpty()) {
	    		if(first == last) {
	    			Object tmp = first.getElement();
	    			first = null;
	    			last = null;
	    			return tmp;
	    		}
	    		else {
		    		Node n = first;
		    		Node tmp = first;
		    		while(n != last) {
		    			tmp = n;
		    			n = n.getNext();
		    		}
		    		tmp.setNext(null);
		    		last = tmp;
		    		return n.getElement();
	    		}
	    	}
	    	return null;
	    }
	    
	    
	    /**
	    * Method returns address of the first node containing the element. If the element is not found, return null
	    */
	    public Node searchElement(Object Element){
	    	Node n;
	    	n = first;
	    	while(n.getElement() != null) {
	    		if(n.getElement().equals(Element)){
	    			return n;
	    		}
	    		n = n.getNext();
	    	}
	    	return null;
	    }
	    
	    
	    /**
	    *Method searches for the first parameter element and inserts the seconds parameter right before it. Return true if successful, else false.
	    */
	    public boolean insertBefore(Object element1, Object element2){    
	    	Node found = searchElement(element1);
	    	if(found != null){
	    		if(found == first) {
	    			this.addBeginning(element2);
	    		}
	    		else {
		    		Node n = first;
		    		while(n.getNext().getElement() != element1) {
		    			n = n.getNext();
		    		}
		    		Node insert = new SimpleNode(element2);
		    		n.setNext(insert);
		    		insert.setNext(found);
	    		}
	    		return true;
	    	}
	    	return false;
	    }
	    
	    
}
