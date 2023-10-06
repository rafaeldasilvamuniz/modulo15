public class Maini {

    public static void main(String[] args) {
        Customer cliente = new Customer("A", false);
        Fabricacao factory = getFactory(cliente);
        Carro carro = factory.create(cliente.grade());
        carro.startEngine();
    }

}
