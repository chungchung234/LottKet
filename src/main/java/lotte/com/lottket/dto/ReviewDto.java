package lotte.com.lottket.dto;

import java.util.Date;

public class ReviewDto {
    private int reviewId;
    private int userId;
    private int productId;
    private String content;
    private Date reviewDate;
    private Double rating;

    public ReviewDto() {

    }

    public ReviewDto(int reviewId, int userId, int productId, String content, Date reviewDate, Double rating) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.content = content;
        this.reviewDate = reviewDate;
        this.rating = rating;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public String getContent() {
        return content;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public Double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
                "reviewId=" + reviewId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", content='" + content + '\'' +
                ", reviewDate=" + reviewDate +
                ", rating=" + rating +
                '}';
    }
}
