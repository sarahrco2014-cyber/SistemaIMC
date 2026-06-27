import java.util.ArrayList;

// Lista que armazena os registros de IMC.
public class Historico {
    private ArrayList<String> registros = new ArrayList<>();

// Adiciona um novo registro ao histórico.
public void adicionarRegistro(String registro) {
    registros.add(registro);
    }

// Exibe todos os registros do histórico.
public void exibirHistorico() {
       if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }
}
   