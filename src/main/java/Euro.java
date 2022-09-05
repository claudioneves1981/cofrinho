public class Euro extends Moeda{

    public Euro(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {

    }

    @Override
    public void converter() {
        this.valor *=  3;
    }

    @Override
    public String toString() {

        String result = "Euro{" +
                "valor=" + valor +
                '}';
        converter();
        return result;

    }
}
