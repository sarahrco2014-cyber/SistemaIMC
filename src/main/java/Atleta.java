public class Atleta extends Pessoa {
     private String esporte;
     public String getEsporte() {
         return esporte;
     }
     public void setEsporte(String esporte) {
         this.esporte = esporte;
     }

     @Override
        public String classificarIMC(double imc) {
            if (imc < 20.0) {
                return "Abaixo do ideal para atleta";
            } else if (imc < 27.0) {
                return "Ideal para atleta";
            } else {
                return "Acima do ideal para atleta";
            }

        }

     // Calcula o IMC do próprio atleta e retorna a classificação.
     @Override 
     public String classificarIMC() {
         return classificarIMC(calcularIMC());
   }

     @Override
     public String exibirPerfil() {
        return "Atleta: " + getNome() + 
               ", Idade: " + getIdade() +
               ", Peso: " + getPeso() +
               ", Altura: " + getAltura() +
               ", Esporte: " + getEsporte();
     }
    
}
