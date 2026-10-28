public class ReviewService {

    private ProductRepository productRepository;
    private Review[] reviews;
    private int reviewCount;

    public ReviewService(ProductRepository productRepository, int reviewCapacity) { ... }
    public void addReview(Review review) { ... }
    public void printAllReviews() { ... }
    public double calcAverageRating(String productId) { ... }
}