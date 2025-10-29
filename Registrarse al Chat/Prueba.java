import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora básica (introduce números con punto decimal si hace falta).");

        while (true) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) División");
            System.out.println("5) Potencia (a^b)");
            System.out.println("6) Salir");
            int op = readInt(sc, "Opción: ");

            if (op == 6) {
                System.out.println("Saliendo. ¡Hasta luego!");
                break;
            }

            if (op < 1 || op > 6) {
                System.out.println("Opción no válida.");
                continue;
            }

            double a = readDouble(sc, "Introduce el primer número: ");
            double b = readDouble(sc, "Introduce el segundo número: ");
            double resultado;
            switch (op) {
                case 1:
                    resultado = a + b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: división por cero.");
                    } else {
                        resultado = a / b;
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case 5:
                    resultado = Math.pow(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operación no implementada.");
            }
        }

        sc.close();
    }

    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, introduce un número entero.");
            }
        }
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, introduce un número válido.");
            }
        }
    }
}