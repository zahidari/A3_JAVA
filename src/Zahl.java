import javax.swing.*;
import java.util.Random;

public class Zahl {

    public int  summe;
    private int comSumme;
    private final int[]karten;

    public Zahl(){
        summe = 0;
        comSumme = 0;
        karten = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    }
    private int karteIndexZiehen(){ // index retrn
        Random rnd = new Random();
        return rnd.nextInt(13);
    }

    public void spielerZieht(){

        summe = 0;
        int karte = karten[karteIndexZiehen()];
        System.out.println("Gezogene Karte ist: "+ karte);
        summe += karte;
        karte = karten[karteIndexZiehen()];
        System.out.println("Gezogene Karte ist: "+ karte);
        summe += karte;




        while (true){

            System.out.println("Summe ist: "+ summe);

            if(summe > 21){
                System.out.println("Leider verloren..");
                return;

            }
            System.out.println("Noch eine Ziehen ?");

            int antwort = JOptionPane.showConfirmDialog(
                    null,"Noch eine Karte Ziehen ?",
                    "Option waehlen",JOptionPane.YES_NO_OPTION);

            //falls yes eine karte Ziehen
            if(antwort == JOptionPane.YES_NO_OPTION){
                karte = karten[karteIndexZiehen()];
                System.out.println("Gezogene Karte ist: "+ karte);
                summe+= karte;
                continue;
            }

            break;
        }

    }
    public void computerZieht(){
        int karte = karten[karteIndexZiehen()];

        comSumme += karte;
        System.out.println("Computer zieht : "+ karte);


        while(true){
            System.out.println("Comupter Summe: "+ comSumme);
            if(comSumme <= summe){
                karte = karten[karteIndexZiehen()];
                System.out.println("Computer Zieht: "+ karte);
                comSumme += karte;

            }
            if(comSumme > 21){

                System.out.println("Bank hat Total: " + comSumme + " Du hast gewonnen!");

                break;
            }
            if(comSumme > summe && comSumme < 22) {
                System.out.println("Bank hat gewonnen! Total: "+ comSumme);

                break;
            }

        }//while end
        comSumme = 0;


    }//computerZieht end
}//Class end
