

 // BlackJack


 import javax.swing.*;

 public class Main {
    public static void main(String[] args) {



        Zahl bank = new Zahl();

        while(true){
            bank.spielerZieht();
            if(bank.summe == 0) continue;
            bank.computerZieht();


            int antwort = JOptionPane.showConfirmDialog(
                    null,"weiter spielen?",
                    "Option waehlen",JOptionPane.YES_NO_OPTION);

            //falls yes eine karte Ziehen
            if(antwort == JOptionPane.NO_OPTION || antwort == JOptionPane.CANCEL_OPTION)break;

        }





    }
}