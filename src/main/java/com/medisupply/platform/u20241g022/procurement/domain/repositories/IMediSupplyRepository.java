package com.medisupply.platform.u20241g022.procurement.domain.repositories;
import java.util.Optional;
import com.medisupply.platform.u20241g022.procurement.domain.model.aggregates.MediSupply;

public interface IMediSupplyRepository extends ICrudservice<MediSupply, Long> {
    Optional<MediSupply> findByCode(String code);

}
