
//Faça um programa com uma classe camiseta com os atributos tecido e tamanho.
//Use encapsulamento nos campos com seus respectivos getters e setters.
//Crie duas camisetas vazias, mude as propriedades com setters e exiba os dados
//delas com os getters.
public class Main {
    public static void main(String[] args) {

        Camiseta camiseta1 = new Camiseta();
        camiseta1.setTecido("Algodão");
        camiseta1.setTamanho("M");

        Camiseta camiseta2 = new Camiseta();
        camiseta2.setTecido("Lã");
        camiseta2.setTamanho("G");

        camiseta1.imprimeDetalhes();
        System.out.println("Camiseta 2 -> Tecido:" + camiseta2.getTecido());
        System.out.println("Camiseta 2 -> Tamanho:" + camiseta2.getTamanho());
    }

}