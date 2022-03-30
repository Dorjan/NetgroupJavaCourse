package Prova1;

public class Test {

    public static void main(String[] args) {
        /*
        int [] vetA = new int[4];
        vetA[0] = 4;
        List <String> listB = new ArrayList<>();
        listB.add("Alessandra");//[0]
        listB.add("Francesco"); //[1]
        listB.add("Dorjan"); //[2]
        System.out.println(listB);
        listB.remove(1);
        System.out.println(listB);
        System.out.println(listB.size());
         */
        double[] v = {3, 2.3, 5.7, 6};
        int i = 0;

        // i < 4 in questo caso. vettore ha dimensione 4
        while (i < v.length) {
            // vogliamo stampare gli elementi dell'array
            System.out.println(v[i]);
            i++;
        }

        System.out.println("*************************");

        int j = 0;
        while (j < v.length) {
            if (v[j] > 3) {
                System.out.println(v[j]);
            }
            j++;
        }

        System.out.println("*************************");

        i = 0;
        do {
            System.out.println(v[i]);
            i++;
        } while (i < v.length);
    }
}
