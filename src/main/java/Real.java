public class Real extends Moeda{

    public Real(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {

    }

    @Override
    public void converter() {
       this.valor*=1;
    }

    @Override
    public String toString() {
        String result = "Real{" +
                "valor=" + valor +
                '}';
        converter();
        return result;
    }
}
