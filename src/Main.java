import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese coordenada x1 de la primera ciudad: ");
        double x1 = scan.nextDouble();
        System.out.println("Ingrese coordenada y1 de la primera ciudad: ");
        double y1 = scan.nextDouble();
        System.out.println("Ingrese coordenada x2 de la segunda ciudad: ");
        double x2 = scan.nextDouble();
        System.out.println("Ingrese coordenada y2 de la segunda ciudad: ");
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y1 - y2,2));

        System.out.println("La distancia entre las dos ciudades es de: "+distancia);
        }
    }
