package adt.list;

public class TestList {
    public static void main(String[] args) {
        List<String> meineListe = new List<>();
        System.out.println(meineListe.get(0));

        meineListe.enQueue("HAllo");
        meineListe.enQueue("neue");
        meineListe.enQueue("schöne");
        meineListe.enQueue("Welt");
        System.out.println(meineListe.getSize());

        meineListe.swap(1, 2);
        System.out.println(meineListe);
    }
}
