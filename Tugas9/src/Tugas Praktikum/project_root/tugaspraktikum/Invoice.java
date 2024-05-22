package project_root.tugaspraktikum;

class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    Invoice (String productName, int quantity, int pricePerItem)
{
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;    
    }

    public String getProductName () {
        return productName;
    }
    public int getQuantity () {
        return quantity;
    }
    public int getPricePerItem () {
        return pricePerItem;
    }
    @Override
    public double getPayableAmount () {
        return quantity * pricePerItem;
    }

    public void output () {
        System.out.println(getProductName() + "\t\t\t" + getPricePerItem() + "t\t\t" + getQuantity());
    }
}