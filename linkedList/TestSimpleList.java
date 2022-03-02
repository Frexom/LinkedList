package linkedList;

public class TestSimpleList {

    public static void initListBegin(SimpleList li){
    	li.addBeginning(1);
    	li.addBeginning(2);
    	li.addBeginning(4);

    }

    public static void initListEnd(SimpleList li){
    	li.addEnding(3);
    	li.addEnding(5);
    	li.addEnding(7);
    }

    public static void main(String[] args){
    	SimpleList li=new SimpleList();
	
    	System.out.println("################ AddBeginning");
    	initListBegin(li);
    	System.out.println(li);

    	System.out.println("################ AddEnding");
    	initListEnd(li);
    	System.out.println(li);

    	System.out.println("################ DeeleteBeginning");
    	while (! li.isEmpty()){
    		Object o=li.deleteBeginning();
    		System.out.println(o+" :::::"+ li);
    	}
	
    	System.out.println("################ DeleteEnging");
    	initListBegin(li); 	
    	initListEnd(li);
    	System.out.println(li);
		
    	while (! li.isEmpty()){
    		Object o=li.deleteEnding();
    		System.out.println(o+" :::::"+ li);
    	}
    }
}
