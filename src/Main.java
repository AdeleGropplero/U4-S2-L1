import es3.BancaException;
import es3.ContoCorrente;
import es3.ContoOnline;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Es1 es1 = new Es1();
        es1.fillArray();
        es1.modifyArray(sc);


        ContoCorrente cc = new ContoCorrente("gianni", 20);
        ContoOnline co = new ContoOnline("giannetta", 50, 150);
        try {
            cc.preleva(60);
        } catch (BancaException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            co.preleva(200);
        } catch (BancaException exception) {
            System.out.println(exception.getMessage());
        }


    }

}