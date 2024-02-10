package com.nemanjatanaskovic.delivery.strategy;

import org.springframework.stereotype.Component;

@Component
public class ExpressDelivery implements DeliverStrategy {
    @Override
    public String deliver(int packageValue, boolean isExpress, double distance) {
        return "F1 activated for an Express delivery!";

        // all the logic on selecting the appropriate F1 vehicle and driver
    }
}
