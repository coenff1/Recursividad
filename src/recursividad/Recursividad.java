package recursividad;
import java.util.Scanner;
import metodos.Ackerman;
import metodos.TorresHanoi;

public class Recursividad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu=1, metodo;

        System.out.println(" -------- Bienvenido ");

        while (menu == 1) {
            System.out.println("¿Qué método desea usar?");
            metodo = scan.nextInt();

            switch (metodo) {
                case 1:
                    System.out.println("Numero de discos: ");
                    int ndiscos = scan.nextInt();
                    TorresHanoi.Hanoi(ndiscos, 1, 2, 3);
                    break;

                case 2:
                    int m,
                     n;
                    System.out.println("¿De que numero desea obtener el ackerman?");
                    m = scan.nextInt();
                    n = scan.nextInt();
                    System.out.println("El ackerman de (" + m + ", " + n + ") es:");
                    System.out.println(Ackerman.ackerman(m, n));
                    break;

            }
            
            System.out.println("¿Desea volver al menú?");
            System.out.println("1 -- Si        Otro -- Salir");
            menu=scan.nextInt();
        }
    }
}
