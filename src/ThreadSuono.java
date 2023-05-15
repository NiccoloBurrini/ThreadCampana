public class ThreadSuono extends Thread {

    Campana campana;
    note suono;

    public ThreadSuono(Campana c, note s) {
        this.campana = c;
        this.suono = s;

    }

    public note getSuono() {
        return suono;
    }

    @Override
    public void run() {
        while (true) {
            try {
                campana.emettiSuono(suono);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}