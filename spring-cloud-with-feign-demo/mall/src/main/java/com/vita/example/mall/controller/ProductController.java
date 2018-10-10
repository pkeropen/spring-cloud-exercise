package com.vita.example.mall.controller;

import com.vita.example.mall.service.ProductService;
import com.vita.example.service.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Product Controller
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        return this.productService.findAll();
    }

//    @RequestMapping(value = "/{itemCode}", method = RequestMethod.POST)
//    public Product detail(@PathVariable String itemCode) {
//        System.out.println("dddddddddd");
//        return this.productService.loadByItemCodeEx(itemCode, "OBgEDj", "restore");
//    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detailEx(@PathVariable String itemCode) {
        System.out.println("dddddddddd");
        return this.productService.loadByItemCode(itemCode);
    }
}
