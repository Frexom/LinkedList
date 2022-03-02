package linkedList;

public class Choix {

    public static void main(String arg[]) {

        RingBuffer li = new RingBuffer();

        for (int i = 1; i <= 7; i++) {
            li.addEnding(i);
        }
        System.out.println(li);

        Node p = li.getFirst();

        while (!(li.getFirst() == li.getLast())) {
            p = li.forwardN(p, 3);
            System.out.println("I am " + p.getElement() + " and i'm gonna leave.");
            p = li.deleteNode(p);
            System.out.println(li);
            System.out.println("#######################");
        }
    }
}