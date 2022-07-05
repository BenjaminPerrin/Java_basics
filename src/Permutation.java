import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("valeur a : ");
        float a=input.nextFloat();
        System.out.print("valeur b : ");
        float b=input.nextFloat();
        System.out.print("valeur c : ");
        float c=input.nextFloat();
        float tmp;
        tmp = a;
        a = c;
        c = b;
        b =tmp;
        System.out.printf("a : %f\nPrenom : %f\nb : %f\n",a,b,
                c);
    }
}
