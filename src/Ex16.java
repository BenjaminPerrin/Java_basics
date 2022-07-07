import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String newTxt = "";
        System.out.print("Veuillez entrer un text : ");
        String txt=input.nextLine().toLowerCase();;
        for (int i = 0; i < txt.length(); i++) {
            if (String.valueOf(txt.charAt(i)).matches(" ")){
                newTxt =  ' ' + newTxt;

            }else {
                newTxt =  txt.charAt(i) + newTxt;

            }

        }
        System.out.println(newTxt);
    }
}
