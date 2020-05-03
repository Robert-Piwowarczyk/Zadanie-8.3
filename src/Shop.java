public class Shop {
    public static void main(String[] args) {
        Product painting = new Product("Kobieta z perłą",
                "Obraz na płótnie","Jan Vermeer",
                10500);
        Product sculpture = new Product("Dawid","rzeźba",
                "Michaello Angello",22000);
        Customer ordinaryCustomer = new Customer("Maciej",
                "Mierzwa","Opole","Bułgarska",
                "8A",16,"zwykły klient");
        Company company = new Company("XYZ","Katowice","Górnicza"
        ,"2B",1);
        CustomerPremium premiumCustomer = new CustomerPremium("Maria",
                "Dąbrowska","Pszczyna","Parkowa","19C",
                5,"klient premium",0.1);

        System.out.println("Paragon zakupu dla:"+ordinaryCustomer
                +" " + Bill.customerBill);
        System.out.println("Paragon zakupu dla:"+ premiumCustomer
        +" "+ Bill.customerBill);
        System.out.println("Faktura zakupu dla firmy:"+ company+" "+
                Invoice.companyInvoice);
    }
}
