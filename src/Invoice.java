public class Invoice extends Bill {
    String infoBuyer;

    public Invoice(String productInfo, double priceBeforeDiscount,
                   double priceAfterDiscount, String infoBuyer) {
        super(productInfo, priceBeforeDiscount, priceAfterDiscount);
        this.infoBuyer = infoBuyer;
    }

    public String getInfoBuyer() {
        return infoBuyer;
    }

    public void setInfoBuyer(String infoBuyer) {
        this.infoBuyer = infoBuyer;
    }
    public String companyInvoice() {
        if (Company == CustomerPremium )
            return getInfoBuyer() +" "+ getProductInfo()+" "
                    + getPriceBeforeDiscount()+"cena po rabacie: "
                    + getPriceAfterDiscount();
    }else{
        return getInfoBuyer()+" " + getProductInfo()+" "
                + getPriceBeforeDiscount();
    }
}
