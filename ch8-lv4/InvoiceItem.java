public class InvoiceItem {
    private String description;
    private int quantity;
    private int unitPrice;

    public int calcSubtotal() {
        return quantity * unitPrice;
    }
    // getter省略
}
