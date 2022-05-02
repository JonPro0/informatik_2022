package eisdiele_projekt;

public class EisQueue {
    Information first;

    public EisQueue(){
        first = null;
    }

    public void add(String kunde, String eissorte){
        Information tmp = new Information(kunde ,eissorte);
        if (first == null){
            first = tmp;
        } else {
            Information runner = first;
            while (runner.getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(tmp);
        }
    }

    public String print(){
        StringBuilder output = new StringBuilder();
        //1. Wir nehmen eine Variable runner und setzen sie auf first
        Information runner = first;

        //2. Solange das Element runner einen Nachfolger hat
        while(runner != null) {
            //3. Drucke die data von runner aus
            output.append("Kunde: ").append(runner.getKunde()).append("Bestelltes Eis: ").append(runner.getEissorte());

            //4. Setze runner auf das nächste Element
            runner = runner.getNext();

        }
        return output.toString();
    }

    public boolean isEmpty(){
        return first == null;
    }

    public String first() {
        if (isEmpty()) throw new IllegalArgumentException("Es gibt momentan keinen Kunden!");
        return "Kunde: " + first.getKunde() + "BEstelltes Eis: " + first.getEissorte();
    }

    public void clear() {
        first = null;
    }

    public String dequeue(){
        if (isEmpty()) throw new IllegalArgumentException("Es gibt keinen Kunden zum entfernen!");
        String info = "Kunde: " + first.getKunde() + "BEstelltes Eis: " + first.getEissorte();
        first = first.getNext();
        return info;
    }

    public int getSize() {
        Information runner = first;
        int anzahl = 0;

        //1. Solange das Element runner einen Nachfolger hat
        while(runner != null) {
            anzahl++;
            //2. Setze runner auf das nächste Element
            runner = runner.getNext();
        }
        return anzahl;
    }
}

class Information {
    String kunde;
    String eissorte;
    Information next;

    public Information(String kunde, String eissorte){
        this.kunde = kunde;
        this.eissorte = eissorte;
    }

    public String getKunde(){
        return kunde;
    }

    public String getEissorte(){
        return eissorte;
    }

    public Information getNext(){
        return next;
    }

    public void setNext(Information next) {
        this.next = next;
    }
}
