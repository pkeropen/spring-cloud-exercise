package com.vita.example.service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Title: Product.java
 * @Package com.vita.example.service.dto
 * @Description: 商品信息DTO对象
 * @author caiz
 * @date 2018/10/10 14:22
 * @version v.3.0
 */
@Data
public class Product {

    private static final long serialVersionUID = 1L;

    // ========================================================================
    // fields =================================================================
    private String itemCode;                                    // 产品货号
    private String name;                                        // 产品名称
    private String bandName;                                    // 产品品牌名称
    private int price;                                          // 产品价格(分)

    // ========================================================================
    // constructor ============================================================
    public Product() {
    }

    public Product(String itemCode, String name, String bandName, int price) {
        this.itemCode = itemCode;
        this.name = name;
        this.bandName = bandName;
        this.price = price;
    }
}
