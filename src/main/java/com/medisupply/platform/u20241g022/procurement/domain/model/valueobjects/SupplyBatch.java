package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

public record SupplyBatch(Integer quantity, String unit) {
    public SupplyBatch {
        if(quantity==null || quantity<=0) {
            throw new IllegalArgumentException("Quantity cannot be null or less than or equal to zero");
        }
        if(unit==null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit cannot be null or blank");
        }
    }



}
