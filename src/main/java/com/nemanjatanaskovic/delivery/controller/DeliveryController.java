package com.nemanjatanaskovic.delivery.controller;

import com.nemanjatanaskovic.delivery.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliverService deliverService;

    @GetMapping("")
    public ResponseEntity<String> deliverPackage(
        @RequestParam int packageValue,
        @RequestParam boolean isExpress,
        @RequestParam double distance
    ) {
        String response = deliverService.deliverPackage(
            packageValue, isExpress, distance
        );

        return ResponseEntity.ok(response);
    }

}
