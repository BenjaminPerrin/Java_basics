import java.util.Scanner;

public class Mathequals {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("votre nombre : ");
        byte nb=input.nextByte();

        String isPair;
        if (nb % 2 == 0) {
            isPair = "pair";
        }else{
            isPair = "impair";
    }
        if (nb > 0){
            System.out.println("Le nombre est positif et "+isPair);
        }else if(nb < 0){
            System.out.println("Le nombre est negatif et "+isPair);
        }else{
            System.out.println("0 !");
        }
    }
}
