import java.util.Scanner;
import java.util.Arrays;
public class ArraysEx13 {
        public static void main(String[] args) {
            int[] notes1={2,6,8,15,39,11};
            int[] notes2={21,33,12,19,0};
            int[] notes3={17,18,46};
            int[][] notes={notes1,notes2,notes3};
            String multiples = "";
            int notesSum =0;

            for (int i = 0; i < notes.length; i++) {
                for(int i2 = 0; i2 < notes[i].length; i2++){
                    if (notes[i][i2] % 3 == 0 && notes[i][i2] != 0){
                        multiples = multiples + "," + notes[i][i2];
                        notesSum = notesSum + notes[i][i2];
                    }
                }
            }
            for (int i = 0; i < notes.length; i++) {
                System.out.println(Arrays.toString(notes[i]));

            }
            System.out.println("S = "+multiples.substring(1).replace(',','+')+" = "+ notesSum);

        }

}
