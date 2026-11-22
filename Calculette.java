import java.util.Scanner;

public class Calculette {

    public double additionner(double b, double a) {
        return a + b;
    }

    public double soustraire(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double divisionChangement(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Impossible.");
        }
        return a / b;
    }

    public double calculer(double a, double b, char operateur) {
        return switch (operateur) {
            case '+' -> additionner(a, b);
            case '-' -> soustraire(a, b);
            case '*' -> multiplication(a, b);
            case '/' -> divisionChangement(a, b);
            default -> throw new IllegalArgumentException("Opérateur invalide : " + operateur);
        };
    }

    public static void main(String[] args) {//ceci est un commentaire
        Calculette calculette = new Calculette();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Opérateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);

            System.out.print("Deuxième nombre : ");
            double b = scanner.nextDouble();

            double resultat = calculette.calculer(a, b, operateur);
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
