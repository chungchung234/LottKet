package lotte.com.lottket.dto;

import java.util.Date;
public class ReviewJoinReply {
    private int reviewId;
    private int replyId;
    private String content;
    private Date replyDate;

    public ReviewJoinReply() {

    }

    public ReviewJoinReply(int reviewId, int replyId, String content, Date replyDate) {
        this.reviewId = reviewId;
        this.replyId = replyId;
        this.content = content;
        this.replyDate = replyDate;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    @Override
    public String toString() {
        return "ReviewJoinReply{" +
                "reviewId=" + reviewId +
                ", replyId=" + replyId +
                ", content='" + content + '\'' +
                ", replyDate=" + replyDate +
                '}';
    }
}
