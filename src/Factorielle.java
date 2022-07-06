import java.util.Arrays;
import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,fact=1;
        System.out.print("Veuillez entrer un chiffre : ");
        int nb =input.nextInt();
        int[] arr = new int[nb];
        String result = "";
        for(i=1;i<=nb;i++){
            fact=fact*i;
            arr[i-1] = i;
        result = result + "x" + arr[i-1];
        }
        StringBuilder output = new StringBuilder(result).reverse();
        System.out.println("La factorielle de "+nb+" est : "+fact +" result "+ output.substring(0,output.length()-1));
    }
}
