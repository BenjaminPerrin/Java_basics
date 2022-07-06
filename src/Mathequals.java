import java.util.Scanner;

public class Mathequals {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("votre nombre : ");
        byte nb=input.nextByte();

        if (nb > 0){
            System.out.println("nb positif");
        }else if(nb < 0){
            System.out.println("nb negatif");
        }else{
            System.out.println("0 !");
        }
    }
}
