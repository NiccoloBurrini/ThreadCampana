

public class App {
    public static void main(String[] args) throws InterruptedException {

        Campana campana = new Campana();
        ThreadSuono s1 = new ThreadSuono(campana, note.DIN);
        ThreadSuono s2 = new ThreadSuono(campana, note.DON);
        ThreadSuono s3 = new ThreadSuono(campana, note.DAN);

        s1.start();
        s2.start();
        s3.start();

        Thread.sleep(10000);
        System.exit(0);
    }
}