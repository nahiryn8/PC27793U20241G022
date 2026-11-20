package com.medisupply.platform.u20241g022.procurement.application.commands;

public record CreateMediSupplyCommand(
        Long id,
        String requestNotes


) {

    public CreateMediSupplyCommand {
        if(id==null ) {
            throw new IllegalArgumentException("Id cannot be null");
        }
        if(requestNotes==null || requestNotes.isBlank()) {
            throw new IllegalArgumentException("Request notes cannot be null or blank");
        }
    }

}
