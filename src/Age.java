import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Votre age : ");
        int age=input.nextInt();

        int annee = 2022-age;
        System.out.printf("Votre annee de naissance: %d",annee);

    }
}
