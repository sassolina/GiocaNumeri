import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studenti
 */
public class Giocatore implements Runnable{
    String nome;
    int punteggio;

    public Giocatore(String nome){
        this.nome= nome;
    }

    @Override
    public void run(){
        gioca();
    }

    public void gioca() {
        int numero = 10;
        String parola = "buongiorno";
        punteggio = 100;

        System.out.println("giocatore: "+ nome);

        for (int i=0; i<numero; i++){
            try {
                System.out.println("giocatore "+nome +" i: "+i);
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException ex) {
                System.err.println("Errore nella transiozione da RUNNING a SLEEPING "+ex.getMessage());
            }
        }

        System.out.println("Giocatore "+nome +" punteggio: "+punteggio);
    }

}