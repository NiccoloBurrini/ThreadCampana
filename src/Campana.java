import java.util.ArrayList;

public class Campana {

    private static ArrayList<note> notes = new ArrayList<note>();
    private static int suonoCorrente = 0;

    public Campana() {
        notes.add(note.DIN);
        notes.add(note.DON);
        notes.add(note.DAN);
    }

    public synchronized void emettiSuono(note suono) throws Exception {
        try {
            while (suono != notes.get(suonoCorrente)) {
                wait();
            }
        } catch (Exception ignored) {
        }
        System.out.println(notes.get(suonoCorrente));
        if (suonoCorrente == 2)
            suonoCorrente = -1;
        Thread.sleep(1000);
        suonoCorrente++;
        notifyAll();
    }

}

enum note {
    DIN,
    DON,
    DAN
}