import java.util.Scanner;

public class diam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        1. Demander à l'utilisateur : nom,prenom,age, poids
        System.out.print("Valeur de la surface : ");
        byte diametre=input.nextByte();


        final double PI=3.14;
        double rayon=diametre/2;
        double surface=rayon*rayon*PI;
        System.out.printf("surface : %f\n",surface);

    }
}
