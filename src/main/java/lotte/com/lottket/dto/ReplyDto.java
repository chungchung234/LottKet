package lotte.com.lottket.dto;

import java.util.Date;

public class ReplyDto {
    private int replyId;
    private int reviewId;
    private String content;
    private Date replyDate;

    public ReplyDto() {

    }

    public ReplyDto(int replyId, int reviewId, String content, Date replyDate) {
        this.replyId = replyId;
        this.reviewId = reviewId;
        this.content = content;
        this.replyDate = replyDate;
    }

    public int getReplyId() {
        return replyId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getContent() {
        return content;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    @Override
    public String toString() {
        return "ReplyDto{" +
                "replyId=" + replyId +
                ", reviewId=" + reviewId +
                ", content='" + content + '\'' +
                ", replyDate=" + replyDate +
                '}';
    }
}
