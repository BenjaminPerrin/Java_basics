import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Veuillez entrer une adresse email : ");
        String mail=input.nextLine();

        System.out.print("Veuillez entrer un mdp : ");
        String mdp=input.nextLine();
        int count = 0;

        while (true && count <5){
            System.out.print("Veuillez entrer votre adresse email : ");
            String newMail= input.nextLine();
            System.out.print("Veuillez entrer votre mdp : ");
            String newMdp= input.nextLine();
            if(mail.equals(newMail) && mdp.equals(newMdp)){
                System.out.println("Bienvenu dans votre espace client");
                break;
            }
            count++;
            if (count == 5){
                System.out.println("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué");
                break;
            }
            System.out.println("Identifiants incorrect");
        }
    }
}
