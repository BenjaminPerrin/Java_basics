import java.util.Scanner;

public class degre3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("entrez a : ");
        byte a=input.nextByte();
        System.out.print("entrez b : ");
        byte b=input.nextByte();
        System.out.print("entrez c : ");
        byte c=input.nextByte();
        System.out.print("entrez x : ");
        double x=input.nextByte();
//((a+b)/2)x3 + (a+b)2x2 + a + b + c
        //double valeur = (Math.pow(x,3)*((double)(a+b)/(double)2)) + (math.pow(x,2)* math.pow((a+b),2)) + a + b + c;
        //System.out.println("La valeur du polynôme est :" + valeur);
    }
}
