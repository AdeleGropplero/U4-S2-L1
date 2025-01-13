import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es1 {

    int[] myArray = new int[5];

   /* int rand = (int) (Math.random()*11);*/
    Random randomNum = new Random();

    public void fillArray(){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomNum.nextInt(10)+1;
        }
        System.out.println("Array generato: " + Arrays.toString((myArray)));
        System.out.println("Ora scegli un numero da inserire nell'array e in che posizione?");
        System.out.println("Valori validi di posizione 1 a 5");
        System.out.println("Oppure premi 0 per uscire");

    }

   public void modifyArray(java.util.Scanner sc){
        while (true){
            System.out.println("Inserisci un numero che vuoi mettere nel tuo array");
            int nuovoNum = sc.nextInt();
            if (nuovoNum>=1 && nuovoNum<= 10){
                sc.nextLine();
                System.out.println("hai inserito " + nuovoNum);
                System.out.println("Inserisci in che posizione (1 a 5)");
               int nuovaPos = sc.nextInt();
                sc.nextLine();
                if (nuovaPos >= 1 && nuovaPos<=5) {
                    System.out.println("hai scelto la posizione numero " + nuovaPos);
                    myArray[nuovaPos - 1] = nuovoNum;
                }else {
                    System.out.println("per favore seleziona un numero tra 1 e 5");
                }
                System.out.println("Array modificato: " + Arrays.toString((myArray)));
            } else if (nuovoNum == 0) {
                System.out.println("sei uscito correttamente dal programma");
                break;
            }else {
                System.out.println("seleziona un valore valido");
            }

        }

    }





}
