package com.example.backstage_management.service;

import com.example.backstage_management.domain.Category;
import com.example.backstage_management.domain.Item;
import com.example.backstage_management.domain.Product;
import com.example.backstage_management.persistence.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemMapper itemMapper;

    public void insertItem(Item item){
        itemMapper.insertItem(item);
    };

    public void updateItem(Item item){
        itemMapper.updateItem(item);
    };

    public List<Item> getItemList() {
        return itemMapper.getItemList();
    };

    public void deleteItem(String id){
        itemMapper.deleteItem(id);
    };

    public void insertProduct(Product product){
        itemMapper.insertProduct(product);
    };

    public void updateProduct(Product product){
        itemMapper.updateProduct(product);
    };

    public List<Product> getProductList(){
        return itemMapper.getProductList();
    };

    public void deleteProduct(String id){
        itemMapper.deleteProduct(id);
    };

    public void insertCategory(Category category){
        itemMapper.insertCategory(category);
    };

    public void updateCategory(Category category){
        itemMapper.updateCategory(category);
    };

    public List<Category> getCategoryList(){
        return itemMapper.getCategoryList();
    };

    public void deleteCategory(String id){
        itemMapper.deleteCategory(id);
    };

    public Item getItem(String id){return itemMapper.getItem(id);};

    public Product getProduct(String id){return itemMapper.getProduct(id);};

    public Category getCategory(String id){return itemMapper.getCategory(id);};
}
