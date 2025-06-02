public class Sales {
    String sellerName;
    int noOfSales;
    int saleId;

    // Constructor
    public Sales(String sn, int n, int s) {
        sellerName = sn;
        noOfSales = n;
        saleId = s;
    }

    // Show method
    public void show() {
        System.out.println("Sale Details:");
        System.out.println("Seller Name: " + sellerName);
        System.out.println("No. of Sales: " + noOfSales);
        System.out.println("Sale ID: " + saleId);
    }
    public static void main(String[] args) {
        Bookk b1 = new Bookk("Friendship", "Madamaji", "Tanvi", 2000, "1956");
        b1.display();

        Sales s1 = new ("Chummins", 20, 202);
        s1.show();
    }
}