public class ThreadSuono extends Thread {

    Campana campana;
    String suono;

    public ThreadSuono(Campana c, String s) {
        this.campana = c;
        this.suono = s;

    }

    public String getSuono() {
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