public class SistemaIMC {

    // Composição: SistemaIMC possui um Histórico.
    private Historico historico = new Historico();

    public Historico getHistorico() {
        return historico;
    }

    // Processa uma pessoa e registra o resultado no histórico.
    public void processar(Pessoa pessoa) {
       
        double imc = pessoa.calcularIMC(
            pessoa.getPeso(),
            pessoa.getAltura());

        String classificacao = pessoa.classificarIMC(imc);

        historico.adicionarRegistro(
               "Nome: " + pessoa.getNome() 
               + " | IMC: " + String.format("%.2f", imc)
               + " | Classificação: " + classificacao);

        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Classificação: " + classificacao);
    }

    // Exibe todos os registros do histórico.
    public void exibirHistorico() {
        historico.exibirHistorico();
    }

    
}
