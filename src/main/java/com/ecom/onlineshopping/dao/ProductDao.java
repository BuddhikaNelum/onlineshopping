package com.ecom.onlineshopping.dao;

import com.ecom.onlineshopping.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();
        product1.setProductId("ID01");
        product1.setProductName("iphone 7 Plus");
        product1.setProductCategory("iphone");
        product1.setProductDescription("This is the new iphone 7");
        product1.setProductPrice(80000);
        product1.setProductCondition("New Arrival");
        product1.setProductStatus("Active");
        product1.setUnitInStock(100);
        product1.setProductManufacturer("Apple");

        Product product2 = new Product();
        product2.setProductId("ID02");
        product2.setProductName("iphone 8 Plus");
        product2.setProductCategory("iphone");
        product2.setProductDescription("This is the new iphone 8");
        product2.setProductPrice(180000);
        product2.setProductCondition("New Arrival");
        product2.setProductStatus("Active");
        product2.setUnitInStock(20);
        product2.setProductManufacturer("Apple");

        Product product3 = new Product();
        product3.setProductId("ID03");
        product3.setProductName("Nokia 6");
        product3.setProductCategory("Nokia");
        product3.setProductDescription("This is the new Nokia 6");
        product3.setProductPrice(120000);
        product3.setProductCondition("New Arrival");
        product3.setProductStatus("Active");
        product3.setUnitInStock(25);
        product3.setProductManufacturer("Nokia");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductbById(String productId) throws IOException{
        for(Product product:getProductList()){
            if(product.getProductId().equals(productId)){
                return product;
            }
        }
        throw new IOException("No products found");
    }

}
