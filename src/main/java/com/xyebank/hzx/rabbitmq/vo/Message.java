package com.xyebank.hzx.rabbitmq.vo;

/**
 * Created by perfection on 16-5-30.
 */
public class Message {

    private Long productId;

    private Integer version;

    private Long applyId;

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
