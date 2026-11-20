package com.medisupply.platform.u20241g022.procurement.domain.repositories;

public interface ICrudservice <T, ID> {
T save(T entity);
T update(T entity);
void deleteById(ID id);
T findById(ID id);

}
