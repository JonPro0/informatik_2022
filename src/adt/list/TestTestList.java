package adt.list;

public class TestTestList {
    public static void main(String[] args) {
        List<String> meineListe = new List<>();
        System.out.println(meineListe.get(0));

        meineListe.enQueue("HAllo");
        meineListe.enQueue("neue");
        meineListe.enQueue("schöne");
        meineListe.enQueue("Welt");
        System.out.println(meineListe.getSize());
        System.out.println(meineListe);
        meineListe.swap(1, 2);
        System.out.println(meineListe);
    }
}
