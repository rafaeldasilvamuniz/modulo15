
public abstract class Fabricacao {

    public Carro create(String grade) {
        Carro carro = retrieveCar(grade);
        carro = prepareCar(carro);
        return carro;
    }
    private Carro prepareCar(Carro carro){
        carro.clean();
        carro.mechanicCheck();
        carro.fuelCar();
        return carro;
    }
    abstract Carro retrieveCar(String grade);
}
