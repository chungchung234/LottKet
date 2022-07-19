package lotte.com.lottket.dto;

public class ProductImageDto {

    private int product_idx;	// auto_increment PK
    private String product_id;	// 고유 품번
    private int product_image_idx;
    private String product_image_url;


    public ProductImageDto() {
    }


    public ProductImageDto(int product_idx, String product_id, int product_image_idx, String product_image_url) {
        this.product_idx = product_idx;
        this.product_id = product_id;
        this.product_image_idx = product_image_idx;
        this.product_image_url = product_image_url;
    }


    public ProductImageDto(String product_id, int product_image_idx, String product_image_url) {
        this.product_image_idx = product_image_idx;
        this.product_id = product_id;
        this.product_image_url = product_image_url;
    }


    public int getProduct_image_idx() {
        return product_image_idx;
    }


    public String getProduct_id() {
        return product_id;
    }

    public int getProduct_idx() {
        return product_idx;
    }

    public String getProduct_image_url() {
        return product_image_url;
    }


    @Override
    public String toString() {
        return "ProductImageDto [product_idx=" + product_idx + ", product_id=" + product_id + ", product_image_idx="
                + product_image_idx + ", product_image_url=" + product_image_url + "]";
    }


}

