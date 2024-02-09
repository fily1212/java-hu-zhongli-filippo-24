package lezione3;

public class Iterazione {
    public static void main(String[] args) {
        /*
        while(CONDIZIONE){
        }
        * */
        int i = 0;
        while (i > 2){

            System.out.println(i);
            i++;
        }

        /*for(inizializzazione; condizione; aggiornamento)
        * istruzioni */
        /*for(int j = 0; j < 2 ; j++){
            System.out.println(j);
        }*/
        for(int k = 1; k <= 10; k+= 2){
            System.out.println(k);
        }
        int[] a  = new int[10];
        a[0] = 1;
        System.out.println(a[0]);
        int[] b = {1,2,3,4,5,6};
        for(int j = 0; j < b.length; j++){
            System.out.println(b[j]);
        }
        System.out.println(b);

    }
}
