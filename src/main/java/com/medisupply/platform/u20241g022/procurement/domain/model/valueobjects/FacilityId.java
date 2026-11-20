package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

public record FacilityId(String Id){
    public FacilityId {
        if(Id==null || Id.isBlank() || Id.isEmpty() || Id.length() <= 0) {
            throw new IllegalArgumentException("Facility ID cannot be null or less than or equal to zero");
        }
    }
}
