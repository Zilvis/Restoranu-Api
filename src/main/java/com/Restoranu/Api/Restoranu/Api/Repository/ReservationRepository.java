package com.Restoranu.Api.Restoranu.Api.Repository;

import com.Restoranu.Api.Restoranu.Api.Entity.ReservationsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationsEntity, Long> {
}
