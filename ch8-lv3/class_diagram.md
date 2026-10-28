classDiagram
    class Product {
        -String productId
        -String productName
        -String category
        +Product(String productId, String productName, String category)
        +getProductId() String
        +getProductName() String
        +getCategory() String
    }

    class Review {
        -String productId
        -String reviewer
        -int rating
        -String comment
        +Review(String productId, String reviewer, int rating, String comment)
        +getProductId() String
        +getReviewer() String
        +getRating() int
        +getComment() String
    }

    class ProductRepository {
        -Product[] products
        -int count
        +ProductRepository(int capacity)
        +save(Product product) void
        +findById(String productId) Product
    }

    class ReviewService {
        -ProductRepository productRepository
        -Review[] reviews
        -int reviewCount
        +ReviewService(ProductRepository productRepository, int reviewCapacity)
        +addReview(Review review) void
        +printAllReviews() void
        +calcAverageRating(String productId) double
    }

    %% クラス間のリレーションシップ定義
    ProductRepository "1" o-- "0..*" Product : 集約 (products配列として保持)
    ReviewService "1" o-- "0..*" Review : 集約 (reviews配列として保持)
    ReviewService "1" --> "1" ProductRepository : 関連 (フィールドとして保持)
    ReviewService ..> Product : 依存 (平均点計算時の内部処理・ドメイン参照)
