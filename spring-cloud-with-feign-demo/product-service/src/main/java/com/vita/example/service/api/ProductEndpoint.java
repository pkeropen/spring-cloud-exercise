package com.vita.example.service.api;

import com.vita.example.service.dto.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Product API服务
 *
 * @author CD826(CD826Dong @ gmail.com)
 * @since 1.0.0
 */
@RestController
@RequestMapping("/products")
public class ProductEndpoint {
    protected Logger logger = LoggerFactory.getLogger(ProductEndpoint.class);

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        return this.buildProducts();
    }

    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode) {
        List<Product> products = this.buildProducts();
        for (Product product : products) {
            if (product.getItemCode().equalsIgnoreCase(itemCode)){
                return product;
            }
        }
        return null;
    }

//    @RequestMapping(value = "/item/{itemCode}/instruction/execute", method = RequestMethod.POST)
//    public Product detailEx(@PathVariable String itemCode,
//                            @RequestParam(value = "user_id", required = false) String userId,
//                            @RequestParam(value = "instruction_code") String instructionCode) {
//        System.out.println("userId = " + userId);
//        List<Product> products = this.buildProducts();
//        for (Product product : products) {
//            if (product.getItemCode().equalsIgnoreCase(itemCode)) {
//                return product;
//            }
//        }
//        return null;
//    }

    protected List<Product> buildProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("item-1", "测试商品-1", "TwoStepsFromJava", 100));
        products.add(new Product("item-2", "测试商品-2", "TwoStepsFromJava", 200));
        products.add(new Product("item-3", "测试商品-3", "TwoStepsFromJava", 300));
        products.add(new Product("item-4", "测试商品-4", "TwoStepsFromJava", 400));
        products.add(new Product("item-5", "测试商品-5", "TwoStepsFromJava", 500));
        products.add(new Product("item-6", "测试商品-6", "TwoStepsFromJava", 600));
        return products;
    }
}
