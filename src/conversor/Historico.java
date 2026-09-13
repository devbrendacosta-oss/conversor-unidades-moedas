package conversor;

import java.util.ArrayList;

public class Historico {

    private ArrayList<String> conversoes;

    public Historico() {
        conversoes = new ArrayList<>();
    }

    public void adicionar(String conversao) {
        conversoes.add(conversao);
    }

    public void mostrar() {

        if (conversoes.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
            return;
        }

        System.out.println("\n========== HISTÓRICO ==========");

        for (int i = 0; i < conversoes.size(); i++) {
            System.out.println((i + 1) + ". " + conversoes.get(i));
        }

        System.out.println("===============================");
    }
}