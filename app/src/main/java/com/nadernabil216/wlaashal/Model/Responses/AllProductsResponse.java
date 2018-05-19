package com.nadernabil216.wlaashal.Model.Responses;

import com.nadernabil216.wlaashal.Model.Objects.Product;

import java.util.ArrayList;

/**
 * Created by NaderNabil216@gmail.com on 5/16/2018.
 */
public class AllProductsResponse extends SuccessResponse {
    ArrayList<Product> products ;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
