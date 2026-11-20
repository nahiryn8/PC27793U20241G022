package com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects;

public record RequestCode(String requestCode) {
    public RequestCode {
            if(requestCode==null || requestCode.isBlank()) {
                throw new IllegalArgumentException("Request code cannot be null or blank");
            }

            if(!requestCode.matches("[A-Z]{3}-[0-9]{4}")) {
                throw new IllegalArgumentException("Request code must be in the format XXX-0000");
            }
}
}
