package linkedList;

public class TestRingBuffer {

    public static void initListeDebut(RingBuffer li) {
        li.addBeginning(1);
        li.addBeginning(2);
        li.addBeginning(4);
    }

    public static void initListeFin(RingBuffer li) {
        li.addEnding(3);
        li.addEnding(5);
        li.addEnding(7);
    }

    public static void main(String[] args) {
        RingBuffer li = new RingBuffer();

        System.out.println("######################");
        System.out.println("DEBUT ");
        initListeDebut(li);
        System.out.println(li);

        System.out.println("SUPPRIME");

        while (!li.isEmpty()) {
            Object o = li.deleteEnding();
            System.out.println(o + "::::::::" + li);
        }


        System.out.println("######################");
        System.out.println("FIN ");
        initListeFin(li);
        System.out.println(li);

        System.out.println("SUPPRIME");

        while (!li.isEmpty()) {
            Object o = li.deleteEnding();
            System.out.println(o + "::::::::" + li);
        }
    }
}