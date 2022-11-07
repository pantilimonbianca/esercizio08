import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {


    @Getter
    @Setter
    private String priceType;


    @Getter
    @Setter
    private double priceInEuro;

    public SmartphonePrice(String priceType, double priceInEuro){
        this.priceType=priceType;
        this.priceInEuro=priceInEuro;
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuro=" + priceInEuro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuro, priceInEuro) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuro);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
