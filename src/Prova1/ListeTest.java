package Prova1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        while(true) {
            System.out.println("inserisci un nome: ");
            String user_input = scanner.nextLine();
            if (user_input.isEmpty()) {
                break;
            }

            lista.add(new String(user_input));
        }

        System.out.println(lista);

        System.out.println("***********************************");

        lista.remove(1);

        System.out.println(lista);

    }
}
