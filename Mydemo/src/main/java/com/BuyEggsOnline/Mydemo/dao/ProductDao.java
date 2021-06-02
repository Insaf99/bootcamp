package com.BuyEggsOnline.Mydemo.dao;

import com.BuyEggsOnline.Mydemo.Model.Product;

import java.util.UUID;

public interface ProductDao {

    int insertProduct(UUID id, Product product);

    default int addProduct(Product product){
        UUID id=UUID.randomUUID();
        return insertProduct(id,product);
    }
}
