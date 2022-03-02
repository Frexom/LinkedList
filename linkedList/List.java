package linkedList;

public interface List {

    /**
    * returns true is the list is empty, else false
    */
    public abstract boolean isEmpty();
    /**
    * Appends the element passed as parameter at the beginning of the list
    */
    public abstract void addBeginning(Object element);
    /**
    * Deletes the first element of the list
    * Method return the deleted elemnt
    */
    public abstract Object deleteBeginning();
    /**
    * return the String representation of the list
    */
    public abstract String toString();
    /**
    * appends the element passed as parameter at the end of the list
    */
    public abstract void addEnding(Object element);
    /**
    * deletes the last element of the list
    * Method return deleted elemnt.
    */
    public abstract Object deleteEnding();

    /**.
    * Method returns address of the first node containing the element. If the element is not found, return null
    */
    public abstract Node searchElement(Object element);
    /**
    *Method searches for the first parameter element and inserts the seconds parameter right before it. Return true if successful, else false.
    */
    public abstract boolean insertBefore(Object element1, Object element2);    
} 


