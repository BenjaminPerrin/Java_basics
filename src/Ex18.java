import java.util.HashMap;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Veuillez entrer un mot : ");
        String word=input.nextLine();
        System.out.print("Veuillez entrer second mot : ");
        String word2=input.nextLine();

        String phraseWord=word.replaceAll("[^A-Za-z]","").toLowerCase();
        String phraseWord2=word2.replaceAll("[^A-Za-z]","").toLowerCase();

        HashMap<Character,Integer> occurences=new HashMap<>();
        HashMap<Character,Integer> newOcc=new HashMap<>();
        HashMap<Character,Integer> newOcc2=new HashMap<>();

            for(int index=0;index<word.length();index++){
                char lettre=word.charAt(index);
                if(occurences.containsKey(lettre)){
                    int ancienneValeur=occurences.get(lettre);
                    occurences.replace(lettre,ancienneValeur+1);
                }else{
                    occurences.put(lettre,1);
                }
                newOcc = occurences;
            }
        for(int index=0;index<word2.length();index++){
            char lettre=word2.charAt(index);
            if(occurences.containsKey(lettre)){
                int ancienneValeur=occurences.get(lettre);
                occurences.replace(lettre,ancienneValeur+1);
            }else{
                occurences.put(lettre,1);
            }
            newOcc2 = occurences;
        }
        if (newOcc.equals(newOcc2)) {
            System.out.println(word+" est un anagramme de "+word2);
        }
        }
    }

