package practice001.trial02;

public class NameAndPayment {

    private String name;

    private Integer payment = 0;

    public NameAndPayment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public void addPayment(Integer payment) {
        this.payment += payment;
    }

}
