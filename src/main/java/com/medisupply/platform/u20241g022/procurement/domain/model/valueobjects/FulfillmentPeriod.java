package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

import java.time.LocalDate;

public record FulfillmentPeriod(LocalDate startDate, LocalDate endDate) {

    boolean contains(LocalDate checkDate) {
        return (checkDate.isEqual(startDate) || checkDate.isAfter(startDate)) &&
                (checkDate.isEqual(endDate) || checkDate.isBefore(endDate));
    }

    public FulfillmentPeriod {

        if(startDate==null || endDate==null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }

        if(endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }

}