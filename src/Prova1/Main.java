package Prova1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Docente> lista = new ArrayList<>();

        lista.add(new Docente("Alex", "Prezioso", 123));
        lista.add(new Docente("John", "Doe", 124));
        lista.add(new Docente("Mario", "Rossi", 125));

        System.out.println(lista);
    }
}
