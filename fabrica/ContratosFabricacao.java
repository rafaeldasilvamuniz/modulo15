public class ContratosFabricacao extends Factory {
    @Override
    Carro retrieveCar(String grade) {
        if ("A".equals(grade)) {
            return new Fusca(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
