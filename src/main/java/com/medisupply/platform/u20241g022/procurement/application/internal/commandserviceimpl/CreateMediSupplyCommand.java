package com.medisupply.platform.u20241g022.procurement.application.internal.commandserviceimpl;

import com.medisupply.platform.u20241g022.procurement.application.commands.CreateMediSupplyCommand;
import com.medisupply.platform.u20241g022.procurement.application.commandservices.CreateMediSupplyCommandService;
import com.medisupply.platform.u20241g022.procurement.domain.model.aggregates.MediSupply;
import com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects.FacilityId;
import com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects.FulfillmentPeriod;
import com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects.RequestCode;
import com.medisupply.platform.u20241g022.procurement.domain.model.valueobjects.SupplyBatch;
import com.medisupply.platform.u20241g022.procurement.domain.repositories.IMediSupplyRepository;

public class CreateMediSupplyCommand implements CreateMediSupplyCommand {
private final IMediSupplyRepository mediSupplyRepository;

    public CreateMediSupplyCommand(IMediSupplyRepository mediSupplyRepository) {
        this.mediSupplyRepository = mediSupplyRepository;
    }
    @Override
    public MediSupply handle(CreateMediSupplyCommand command) {
        // Create value objects
        RequestCode requestCode = new RequestCode(command.requestCode());
        FacilityId facilityId = new FacilityId(command.facilityId());
        FulfillmentPeriod fulfillmentPeriod = new FulfillmentPeriod(command.fulfillmentPeriod());
        SupplyBatch supplyBatch = new SupplyBatch(command.supplyBatch());

        // Create MediSupply aggregate
        MediSupply mediSupply = new MediSupply(null, requestCode, facilityId, fulfillmentPeriod, supplyBatch);

        // Save the MediSupply aggregate to the repository
        return mediSupplyRepository.save(mediSupply);
    }

}
