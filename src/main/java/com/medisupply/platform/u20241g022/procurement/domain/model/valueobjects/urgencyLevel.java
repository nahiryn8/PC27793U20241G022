package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

public record urgencyLevel(int value) {
   public urgencyLevel {
    if(value < 1 || value > 5) {
        throw new IllegalArgumentException("Urgency level must be between 1 and 5");
    }
}}
