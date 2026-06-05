package com.nit.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Courier;
import com.nit.service.CourierService;

@RestController
@RequestMapping("/couriers")
public class CourierController {

    @Autowired
    private CourierService service;

    // POST /couriers/send
    @PostMapping("/send")
    public Courier sendCourier(@RequestBody Courier courier) {
        return service.sendCourier(courier);
    }

    // GET /couriers
    @GetMapping
    public List<Courier> getAllCouriers() {
        return service.getAllCouriers();
    }

    // GET /couriers/{id}
    @GetMapping("/{id}")
    public Courier getCourierById(@PathVariable Long id) {
        return service.getCourierById(id);
    }

    // PUT /couriers/update/{id}
    @PutMapping("/update/{id}")
    public Courier updateCourier(@PathVariable Long id,
                                 @RequestBody Courier courier) {
        return service.updateCourier(id, courier);
    }

    // PATCH /couriers/status/{id}
    @PatchMapping("/status/{id}")
    public Courier updateStatus(@PathVariable Long id,
                                @RequestBody Map<String, String> request) {

        String status = request.get("deliveryStatus");
        return service.updateStatus(id, status);
    }

    // DELETE /couriers/delete/{id}
    @DeleteMapping("/delete/{id}")
    public String deleteCourier(@PathVariable Long id) {
        return service.deleteCourier(id);
    }
}
