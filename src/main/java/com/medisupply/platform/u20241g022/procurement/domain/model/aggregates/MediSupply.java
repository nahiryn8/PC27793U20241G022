package com.medisupply.platform.u20241g022.procurement.domain.model.aggregates;

import java.security.PublicKey;
import java.time.Instant;


public class MediSupply {


    private  Long id;
    private String requestNotes;

    public MediSupply(Long id, String requestNotes) {
        this.id = id;
        this.requestNotes = requestNotes;

    }

    public Long getId() {
        return id;
    }
    public String getRequestNotes() {
        return requestNotes;
    }

}

