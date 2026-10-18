public class InvoiceItem {

    private String description;
    private int quantity;
    private int unitPrice;

    public String getDescription() { return description; }
    public int getQuantity() { return quantity; }
    public int getUnitPrice() { return unitPrice; }

    public int calcSubtotal() {
        return quantity * unitPrice;
    }
}