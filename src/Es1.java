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
        while (myArray.length < 5){
            System.out.println("Inserisci un numero che vuoi mettere nel tuo array");

            int nuovoNum = sc.nextInt();
            System.out.println("hai inserito " + nuovoNum);
            System.out.println("Inserisci in che posizione (1 a 5)");
            int nuovaPos = sc.nextInt();
            System.out.println("hai scelto la posizione numero " + nuovaPos);
            myArray[nuovaPos -1] = nuovoNum;
        }

    }





}
