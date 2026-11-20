package com.medisupply.platform.u20241g022.procurement.application.commandservices;

import com.medisupply.platform.u20241g022.procurement.application.commands.CreateMediSupplyCommand;
import com.medisupply.platform.u20241g022.procurement.domain.model.aggregates.MediSupply;

public interface CreateMediSupplyCommandService {
    MediSupply handle(CreateMediSupplyCommand command);
}
