package lotte.com.lottket.dto;

public class ProductDetailDto {
    private int productDetailId;
    private int productId;
    private String productDetailImageUrl;

    public ProductDetailDto() {

    }

    public ProductDetailDto(int productDetailId, int productId, String productDetailImageUrl) {
        this.productDetailId = productDetailId;
        this.productId = productId;
        this.productDetailImageUrl = productDetailImageUrl;
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductDetailImageUrl() {
        return productDetailImageUrl;
    }

    @Override
    public String toString() {
        return "ProductDetailDto{" +
                "productDetailId=" + productDetailId +
                ", productId=" + productId +
                ", productDetailImageUrl='" + productDetailImageUrl + '\'' +
                '}';
    }
}
