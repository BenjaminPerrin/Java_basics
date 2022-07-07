import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ArraysEx14 {
    public static void main(String[] args) {
        List<Integer> nb = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for(int index=0;index<nb.size();index++){
            System.out.printf("Saisir un chiffre %d : ",index+1);
            nb.add(input.nextInt());
        }
        while (true){
            System.out.printf("Saisir un chiffre : ");
            if (String.valueOf(input.nextInt()) == "stop"){
                //break;
            }
            nb.add(input.nextInt());
        }
    }
}
