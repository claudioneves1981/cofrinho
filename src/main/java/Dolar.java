public class Dolar extends Moeda{

    public Dolar(double valor){
        this.valor = valor;
    }


    @Override
    public void info() {

    }

    @Override
    public void converter() {
         this.valor *= 5;
    }

    @Override
    public String toString() {
        String result = "Dolar{" +
                "valor=" + valor +
                '}';
        converter();
        return result;
    }
}
