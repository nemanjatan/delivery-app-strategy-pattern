package com.nemanjatanaskovic.delivery.strategy;

import org.springframework.stereotype.Component;

@Component
public class DroneDelivery implements DeliverStrategy {
    @Override
    public String deliver(int packageValue, boolean isExpress, double distance) {
        return "Drone delivery activated!";

        // all the logic on selecting the best drone for delivery
    }
}
