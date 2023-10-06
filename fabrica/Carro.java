public abstract class Carro {

    private int lataria;
    private String combustivel;
    private String cor;

    public Carro(int lataria, String combustivel, String cor) {
        this.lataria = lataria;
        this.combustivel = combustivel;
        this.cor = cor;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + combustivel + " esta pronto e a " + lataria + " lataria.n também foi finalizada." );
    }
    public void clean(){
        System.out.println("O carro foi limpo. Veja a cor:  " + cor.toLowerCase());
    }
    public void mechanicCheck(){
        System.out.println("O mecânico checou o carro. Que bom!");
    }
    public void fuelCar(){
        System.out.println("Carro com o combustível completo " + combustivel.toLowerCase());
    }
}
