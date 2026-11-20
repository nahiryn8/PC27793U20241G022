package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

public record FacilityId(Long id){
    public FacilityId {
        if(id==null || id<=0) {
            throw new IllegalArgumentException("Facility ID cannot be null or less than or equal to zero");
        }
    }
}
