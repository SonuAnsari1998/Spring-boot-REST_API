package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.CartItem;
import com.nit.repo.CartRepository;

@Service
public class CartService{

    @Autowired
    private CartRepository repo;

    public CartItem addItem(CartItem item) {
        return repo.save(item);
    }

    public List<CartItem> getAllItems() {
        return repo.findAll();
    }

    public CartItem getItemById(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));
    }

    public CartItem updateItem(Integer id, CartItem item) {
        CartItem existingItem = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));

        existingItem.setProductName(item.getProductName());
        existingItem.setQuantity(item.getQuantity());
        existingItem.setPrice(item.getPrice());
        existingItem.setCategory(item.getCategory());

        return repo.save(existingItem);
    }

    public CartItem updateQuantity(Integer id, Integer quantity) {
        CartItem existingItem = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));

        existingItem.setQuantity(quantity);

        return repo.save(existingItem);
    }

    public void deleteItem(Integer id) {
        CartItem existingItem = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));

        repo.delete(existingItem);
    }
}