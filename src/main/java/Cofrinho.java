
import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();


    public void adicionar(Moeda moeda){
        this.listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda){
        this.listaMoedas.remove(moeda);
    }

    public void listagemMoedas(){
        System.out.println(this.listaMoedas);
    }

    public void totalConvertido(){

        long cont = this.listaMoedas.size();
        double soma = 0;

        for (int i = 0; i< cont; i++){
            soma = soma + this.listaMoedas.get(i).valor;
        }

        System.out.println("No Cofrinho contem "+cont+" moedas e o Total convertido em Reais é R$" + soma);
    }


}
