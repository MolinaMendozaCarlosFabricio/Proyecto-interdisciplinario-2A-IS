import java.util.Scanner;

public class Menu {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la Opción 1");
                   
                    break;
                case 2:
                    System.out.println("Ha seleccionado la Opción 2");
                    
                    break;
                case 3:
                    System.out.println("Ha seleccionado la Opción 3");
                    
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}