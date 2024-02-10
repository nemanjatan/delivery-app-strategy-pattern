package com.nemanjatanaskovic.delivery.service;

import com.nemanjatanaskovic.delivery.strategy.DeliverStrategy;
import com.nemanjatanaskovic.delivery.strategy.DroneDelivery;
import com.nemanjatanaskovic.delivery.strategy.ExpressDelivery;
import com.nemanjatanaskovic.delivery.strategy.StandardDelivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliverService {

    @Autowired
    private StandardDelivery standardDelivery;

    @Autowired
    private ExpressDelivery expressDelivery;

    @Autowired
    private DroneDelivery droneDelivery;

    public String deliverPackage(
        int packageAmount,
        boolean isExpress,
        double distance
    ) {
        DeliverStrategy strategy = standardDelivery;

        if (distance < 2.0) {
            strategy = droneDelivery;
        }

        if (isExpress) {
            strategy = expressDelivery;
        }

        return strategy.deliver(
            packageAmount,
            isExpress,
            distance
        );
    }

}
