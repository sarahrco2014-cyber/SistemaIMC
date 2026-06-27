import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) { 
     Scanner entrada = new Scanner(System.in); 
     SistemaIMC sistema = new SistemaIMC(); 
     ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>(); 
     
     int opcao = 0; 
     while (opcao != 4) { 
        
    System.out.println("Sistema IMC"); 
    
    System.out.println("1- Cadastrar pessoa:"); 
    System.out.println("2- Cadastrar atleta:"); 
    System.out.println("3- Exibir histórico:"); 
    System.out.println("4- Sair:"); 
    
    System.out.print("Escolha uma opção:"); 
    opcao = entrada.nextInt(); 
    entrada.nextLine();
    
    if (opcao == 3) { 
        System.out.println("Histórico de cálculos"); 
        sistema.exibirHistorico(); 
     } 
     
     if (opcao == 1) { 
        
        System.out.println("Você escolheu cadastrar pessoa"); 
        
        System.out.println("Digite o nome da pessoa:");
        String nome = entrada.nextLine(); 
        System.out.println("Digite a idade da pessoa:"); 
        int idade = entrada.nextInt(); 
        if (idade < 0) {
            throw new EntradaInvalidaException("Idade inválida. "); 
        }

        System.out.println("Digite o peso da pessoa:"); 
        double peso = entrada.nextDouble(); 
        System.out.println("Digite a altura da pessoa:"); 
        double altura = entrada.nextDouble(); 

        boolean dadosValidos = (peso > 0 && altura > 0);

        try{
            if (!dadosValidos) {
                throw new EntradaInvalidaException(
                    "Peso e altura devem ser maiores que zero."
                );
            }
        } catch (EntradaInvalidaException e) {
            System.out.println(e.getMessage());
            continue; 
        }
        
        Pessoa pessoa1 = new Pessoa(); 
        pessoa1.setNome(nome); 
        pessoa1.setIdade(idade); 
        pessoa1.setPeso(peso); 
        pessoa1.setAltura(altura); 
        pessoas.add(pessoa1); 
        
        System.out.println("Peso: " + pessoa1.getPeso()); 
        System.out.println("Altura: " + pessoa1.getAltura()); 
        
        sistema.processar(pessoa1);
    
    } 
    
    if (opcao == 2) { 
        System.out.println("Você escolheu cadastrar atleta"); 
        System.out.println("Digite o nome do atleta:"); 
        String nome = entrada.next(); 
        System.out.println("Digite a idade do atleta:"); 
        int idade = entrada.nextInt(); 

        if (idade < 0) {
            throw new EntradaInvalidaException("Idade inválida. ");
        }

        System.out.println("Digite o peso do atleta:"); 
        double peso = entrada.nextDouble(); 
        System.out.println("Digite a altura do atleta:"); 
        double altura = entrada.nextDouble(); 
        
        System.out.println("Digite o esporte do atleta:"); 
        String esporte = entrada.next(); 

        boolean dadosValidos = (peso > 0 && altura > 0);

        try{
            if (!dadosValidos) {
                throw new EntradaInvalidaException(
                    "Peso e altura devem ser maiores que zero."
                );
            }
        } catch (EntradaInvalidaException e) {
            System.out.println(e.getMessage());
            continue; 
        }
        
        Atleta atleta1 = new Atleta(); 
        atleta1.setNome(nome); 
        atleta1.setIdade(idade); 
        atleta1.setPeso(peso); 
        atleta1.setAltura(altura); 
        atleta1.setEsporte(esporte); 
        pessoas.add(atleta1); 
        
        sistema.processar(atleta1);
    } 
} 
entrada.close();
 }
}

















































































































