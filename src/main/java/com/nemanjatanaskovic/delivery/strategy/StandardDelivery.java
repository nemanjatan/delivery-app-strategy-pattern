package com.nemanjatanaskovic.delivery.strategy;

import org.springframework.stereotype.Component;

@Component
public class StandardDelivery implements DeliverStrategy {
    @Override
    public String deliver(int packageValue, boolean isExpress, double distance) {
        return "Standard delivery activated...";

        // all the logic on selecting the appropriate vehicle and driver
    }
}
