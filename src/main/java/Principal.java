public class Principal {

    public static void main(String[] args) {

        Moeda dolar = new Dolar(4.00);
        Moeda dolar1 = new Dolar(3.50);
        Moeda real = new Real(5.00);
        Moeda euro = new Euro(3.00);
        Cofrinho cofrinho = new Cofrinho();

        cofrinho.adicionar(dolar);
        cofrinho.adicionar(dolar1);
        cofrinho.adicionar(real);
        cofrinho.adicionar(euro);
        cofrinho.remover(real);
        cofrinho.listagemMoedas();
        cofrinho.totalConvertido();
    }
}
