import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 5) {
            System.out.println("****************");
            System.out.println("* Bienvenido/a *\n****************\n");
            System.out.println("1. Buscar libro por titulo ");
            System.out.println("2. Buscar libro por autor ");
            System.out.println("3. Mostrar Inventario");
            System.out.println("4. Agregar libro");
            op = sc.nextInt();
        }
    }
}