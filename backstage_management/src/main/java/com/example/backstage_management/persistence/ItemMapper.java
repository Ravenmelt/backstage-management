package com.example.backstage_management.persistence;

import com.example.backstage_management.domain.Category;
import com.example.backstage_management.domain.Item;
import com.example.backstage_management.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemMapper {

    void insertItem(Item item);

    void updateItem(Item item);

    List<Item> getItemList();

    void deleteItem(String itemid);

    void insertProduct(Product product);

    void updateProduct(Product product);

    List<Product> getProductList();

    void deleteProduct(String productid);

    void insertCategory(Category category);

    void updateCategory(Category category);

    List<Category> getCategoryList();

    void deleteCategory(String catId);

    Item getItem(String itemId);

    Product getProduct(String productId);

    Category getCategory(String categoryId);

}
