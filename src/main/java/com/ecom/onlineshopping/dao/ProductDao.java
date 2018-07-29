package com.ecom.onlineshopping.dao;

import com.ecom.onlineshopping.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();
        product1.setProductName("iphone 7 Plus");
        product1.setProductCategory("iphone");
        product1.setProductDescription("This is the new iphone 7");
        product1.setProductPrice(80000);
        product1.setProductCondition("New Arrival");
        product1.setProductStatus("Active");
        product1.setUnitInStock(100);
        product1.setProductManufacturer("Apple");

        Product product2 = new Product();
        product2.setProductName("iphone 8 Plus");
        product2.setProductCategory("iphone");
        product2.setProductDescription("This is the new iphone 8");
        product2.setProductPrice(180000);
        product2.setProductCondition("New Arrival");
        product2.setProductStatus("Active");
        product2.setUnitInStock(20);
        product2.setProductManufacturer("Apple");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);

        return productList;
    }

}
