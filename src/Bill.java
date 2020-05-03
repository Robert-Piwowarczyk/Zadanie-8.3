import java.util.Objects;

public class Bill {
    private String productInfo;
    private double priceBeforeDiscount;
    private double priceAfterDiscount;

    public Bill(String productInfo, double priceBeforeDiscount,
                double priceAfterDiscount) {
        this.productInfo = productInfo;
        this.priceBeforeDiscount = priceBeforeDiscount;
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public double getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    public void setPriceBeforeDiscount(double priceBeforeDiscount) {
        this.priceBeforeDiscount = priceBeforeDiscount;
    }

    public double getPriceAfterDiscount() {
        return priceBeforeDiscount - priceBeforeDiscount * 0.1;
    }

    public void setPriceAfterDiscount(double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public String customerBill() {
        if (Customer == CustomerPremium )
            return  getProductInfo()+" " + getPriceBeforeDiscount()
                    +"cena po rabacie: "
                    + getPriceAfterDiscount();
    }else{
        return  getProductInfo()+" " + getPriceBeforeDiscount();
    }
}

