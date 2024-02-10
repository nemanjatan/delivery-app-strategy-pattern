package com.nemanjatanaskovic.delivery.strategy;

public interface DeliverStrategy {
    String deliver(
        int packageValue,
        boolean isExpress,
        double distance
    );
}
