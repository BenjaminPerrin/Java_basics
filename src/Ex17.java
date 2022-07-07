import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         String newNb ="";
        System.out.print("Veuillez entrer un nombre : ");
        int nb=input.nextInt();
        int length = String.valueOf(nb).length();
        for (int i = 0; i < length; i++) {
            if (String.valueOf(nb).charAt(i) != '0' && String.valueOf(nb).charAt(i) > '0') {

                newNb =  String.valueOf(nb).charAt(i) + newNb;
            }
        }
        if (String.valueOf(nb).contains("-")){
            newNb = "-" + newNb;
        }
        System.out.println(newNb);
    }
}
