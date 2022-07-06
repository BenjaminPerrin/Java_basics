public class Tables {
    public static void main(String[] args) {
        int count = 0;
        for (int nb=2;nb<=10;nb++){
            System.out.printf("\n===================\nTable de %d :\n===================\n",nb);
            for(int compteur=1;compteur<=10;compteur++){
                int produit=nb*compteur;
                System.out.printf("%d x %d = %d\n",nb,compteur,produit);
             }
        }

    }
}
