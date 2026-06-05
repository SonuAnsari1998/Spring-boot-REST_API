package com.nit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Courier;
import com.nit.repo.CourierRepository;


@Service
public class CourierService {

    @Autowired
    private CourierRepository repository;

    // Send Courier
    public Courier sendCourier(Courier courier) {
        return repository.save(courier);
    }

    // Get All Couriers
    public List<Courier> getAllCouriers() {
        return repository.findAll();
    }

    // Get Courier By Id
    public Courier getCourierById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Update Courier
    public Courier updateCourier(Long id, Courier updatedCourier) {

        Courier courier = repository.findById(id).orElse(null);

        if (courier != null) {
            courier.setSenderName(updatedCourier.getSenderName());
            courier.setReceiverName(updatedCourier.getReceiverName());
            courier.setCity(updatedCourier.getCity());
            courier.setDeliveryStatus(updatedCourier.getDeliveryStatus());

            return repository.save(courier);
        }

        return null;
    }

    // Update Delivery Status
    public Courier updateStatus(Long id, String status) {

        Courier courier = repository.findById(id).orElse(null);

        if (courier != null) {
            courier.setDeliveryStatus(status);
            return repository.save(courier);
        }

        return null;
    }

    // Delete Courier
    public String deleteCourier(Long id) {

        Courier courier = repository.findById(id).orElse(null);

        if (courier != null) {
            repository.deleteById(id);
            return "Courier Deleted Successfully";
        }

        return "Courier Not Found";
    }
}
