import java.util.Scanner;

public class SecondDegre {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("a? : ");
        int a=input.nextInt();
        System.out.print("b? : ");
        int b=input.nextInt();
        System.out.print("c? : ");
        int c=input.nextInt();

//((a+b)/2)x3 + (a+b)2x2 + a + b + c
        //double valeur = (Math.pow(x,3)*((double)(a+b)/(double)2)) + (math.pow(x,2)* math.pow((a+b),2)) + a + b + c;
        //ax2+bx+c = 0


        double valeur = (2*(double)a) + (double)b + (double)c;
        System.out.println("La valeur est :" + valeur);
    }
}