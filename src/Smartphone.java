import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


public class Smartphone implements Cloneable{


    @Getter
    @Setter
    private String brandName;

    @Getter
    @Setter
    private String modelName;

    @Getter
    @Setter
    private int batterymAh;

    @Getter
    @Setter
    private SmartphonePrice producerPrice;

    @Getter
    @Setter
    private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName=brandName;
        this.modelName=modelName;
        this.batterymAh=batterymAh;
        this.producerPrice=producerPrice;
        this.retailPrice=retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && brandName.equals(that.brandName) && modelName.equals(that.modelName) && producerPrice.equals(that.producerPrice) && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
