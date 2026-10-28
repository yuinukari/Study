public class Review {

    private String productId;
    private String reviewer;
    private int rating;
    private String comment;

    public Review(String productId, String reviewer, int rating, String comment) { ... }

    public String getProductId() { return productId; }
    public String getReviewer() { return reviewer; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
}
