package com.ecom.onlineshopping.dao.impl;

import com.ecom.onlineshopping.dao.ProductDao;
import com.ecom.onlineshopping.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addProduct(Product product) {

    }

    public Product getProductById(String id) {
        return null;
    }

    public List<Product> getAllProducts() {
        return null;
    }

    public void deleteProduct(String id) {

    }
}
