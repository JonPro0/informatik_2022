package adt.list;

public class TestList {
    public static void main(String[] args) {
        List<String> meineListe = new List<>();
        //System.out.println(meineListe.get(0));

        meineListe.enQueue("HAllo");
        meineListe.enQueue("neue");
        meineListe.enQueue("schoene");
        meineListe.enQueue("Welt");
        System.out.println(meineListe.getSize());
        System.out.println(meineListe);
        meineListe.swap(1, 2);
        System.out.println(meineListe);
        int x = 1;
        double y = 2.0;
        System.out.println(Integer.toString(x).compareTo(Double.toString(y)));
    }
}
