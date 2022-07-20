package lotte.com.lottket.dto;

import java.util.Date;

public class ReviewJoinUser {
    private int reviewId;
    private int userId;
    private int productId;
    private String content;
    private Date reviewDate;
    private Double rating;
    private String userName;
    private String userProfileImage;
    private String userGrade;

    public ReviewJoinUser() {

    }

    public ReviewJoinUser(int reviewId, int userId, int productId, String content, Date reviewDate, Double rating, String userName, String userProfileImage, String userGrade) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.content = content;
        this.reviewDate = reviewDate;
        this.rating = rating;
        this.userName = userName;
        this.userProfileImage = userProfileImage;
        this.userGrade = userGrade;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfileImage() {
        return userProfileImage;
    }

    public void setUserProfileImage(String userProfileImage) {
        this.userProfileImage = userProfileImage;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    @Override
    public String toString() {
        return "ReviewJoinUser{" +
                "reviewId=" + reviewId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", content='" + content + '\'' +
                ", reviewDate=" + reviewDate +
                ", rating=" + rating +
                ", userName='" + userName + '\'' +
                ", userProfileImage='" + userProfileImage + '\'' +
                ", userGrade='" + userGrade + '\'' +
                '}';
    }
}
