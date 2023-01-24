package calcul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Bienvenue dans ma Calculatrice");
            System.out.println("Que voulez vous faire comme operation");
            System.out.println("1-Addition");
            System.out.println("2-Soustraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5-Quitter de l'application");
            Scanner scanner = new Scanner(System.in);
            int choix = scanner.nextInt();
            if (choix == 1) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                float som = add + add1;
                System.out.println("l'addition de : " + add + " " + " + " + add1 + " " + " = " + som);

            } else if (choix == 2) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                float sous = add - add1;
                System.out.println("la soustraction de : " + add + " " + " - " + add1 + " " + " = " + sous);
            } else if (choix == 3) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                float multi = add * add1;
                System.out.println("la multiplication de : " + add + " " + " * " + add1 + " " + " = " + multi);
            } else if (choix == 4) {
                System.out.println("Veuillez saisir un entier ");
                Scanner scanner1 = new Scanner(System.in);
                float add = scanner1.nextFloat();
                System.out.println("Veuillez saisir un deuxieme entier ");
                Scanner clavier = new Scanner(System.in);
                float add1 = clavier.nextFloat();
                float div = add / add1;
                if (add % 2 == 0)

                    System.out.println("la division de : " + add + " " + " / " + add1 + " " + " = " + div);
                else
                    System.out.println("impossible d'effectuer cette division");

            } else if (choix == 5) {
                System.exit(0);
            }
        }
    }
}
