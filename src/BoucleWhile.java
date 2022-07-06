import java.util.Scanner;


public class BoucleWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Fixer le nombre de caractères à 4
//        Demander à l'utilisateur de reessayer tant que le code PIN ne contient pas
//        exactement 4 chiffres
        int codePIN;
        int codePINATester;

        while (true){
            System.out.print("Veuillez définir un code PIN : ");
            codePIN= input.nextInt();
            if(String.valueOf(codePIN).length()==4){
                System.out.println("Code PIN défini avec succès");
                break;
            }
            System.out.println("Erreur : Le code PIN doit être composé de 4 chiffres");
        }

//        Limiter le nombre de tentatives à 3.Mais ne pas utiliser une boucle for
//        Si au bout 3 tentatives, le code PIN n'est toujours pas correct, alors on
//        affiche "Votre appareil est bloqué, et on sort de la boucle"
        int count = 0;
        while (true && count <3){
            System.out.print("Entrer un code PIN pour déverouiller l'appareil " +
                    ": ");
            codePINATester=input.nextInt();//1234
            if(codePINATester==codePIN){
                System.out.println("**************************");
                System.out.println("** Appareil déverouillé **");
                System.out.println("**************************");
                break;
            }
            count++;
            if (count == 3){
                System.out.println("LOCKED");
                break;
            }
            System.out.println("Code PIN Erroné.Veuillez reessayer");
        }
//
    }
}