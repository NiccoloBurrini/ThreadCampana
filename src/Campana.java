import java.util.ArrayList;

public class Campana {

    private static ArrayList<String> notes = new ArrayList<>();
    private static int suonoCorrente = 0;

    public Campana() {
        notes.add("DIN");
        notes.add("DON");
        notes.add("DAN");
    }

    public synchronized void emettiSuono(String suono) throws Exception {
        try {
            while (!suono.equals(notes.get(suonoCorrente))) {
                wait();
            }
        } catch (Exception e) {
        }
        System.out.println(notes.get(suonoCorrente));
        if (suonoCorrente == 2)
            suonoCorrente = -1;
        Thread.sleep(1000);
        suonoCorrente++;
        notifyAll();
    }

}
