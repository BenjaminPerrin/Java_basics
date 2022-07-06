import java.util.Scanner;

public class Mois {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Numero de mois? : ");
        int nb=input.nextInt();

        //String[] mois = {"janvier","fevrier","mars","avril","mai","juin","juillet","aout","septembre","octobre","novembre","decembre"};
        //System.out.printf(mois[nb-1]);
        String monthString;
        switch (nb) {
            case 1:  monthString = "janvier";
                break;
            case 2:  monthString = "fevrier";
                break;
            case 3:  monthString = "mars";
                break;
            case 4:  monthString = "avril";
                break;
            case 5:  monthString = "mai";
                break;
            case 6:  monthString = "juin";
                break;
            case 7:  monthString = "juillet";
                break;
            case 8:  monthString = "aout";
                break;
            case 9:  monthString = "septembre";
                break;
            case 10: monthString = "octobre";
                break;
            case 11: monthString = "novembre";
                break;
            case 12: monthString = "decembre";
                break;
            default: monthString = "mois invalide";
                break;
        }
        System.out.println("Mois: "+nb + "\nResult :  "+monthString);
    }

}
