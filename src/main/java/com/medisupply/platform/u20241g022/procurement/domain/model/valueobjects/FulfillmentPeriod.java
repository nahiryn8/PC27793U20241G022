package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

import java.time.LocalDate;

public record FulfillmentPeriod(LocalDate startDate, LocalDate endDate) {
    public FulfillmentPeriod{

    if(startDate==null || endDate==null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }

        if(endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
}

}
