public class Customer {

    private String grade;
    private boolean temContrato;

    public Customer(String grade, boolean temContrato) {
        this.grade= grade;
        this.temContrato = temContrato;
    }
    public boolean temContrato() {
        return temContrato;
    }
    public String grade() {
        return grade;
    }
}
