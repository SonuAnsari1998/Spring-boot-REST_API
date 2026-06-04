package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nit.model.CartItem;
import com.nit.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/add")
    public CartItem addItem(@RequestBody CartItem item) {
        return service.addItem(item);
    }

    @GetMapping
    public List<CartItem> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public CartItem getItemById(@PathVariable Integer id) {
        return service.getItemById(id);
    }

    @PutMapping("/update/{id}")
    public CartItem updateItem(@PathVariable Integer id,
                               @RequestBody CartItem item) {
        return service.updateItem(id, item);
    }

    @PatchMapping("/quantity/{id}")
    public CartItem updateQuantity(@PathVariable Integer id,
                                   @RequestParam Integer quantity) {
        return service.updateQuantity(id, quantity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItem(@PathVariable Integer id) {
        service.deleteItem(id);
        return "Cart Item Deleted Successfully";
    }
}