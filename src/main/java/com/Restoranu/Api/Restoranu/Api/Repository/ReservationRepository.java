package com.Restoranu.Api.Restoranu.Api.Repository;

import com.Restoranu.Api.Restoranu.Api.Entity.ReservationsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationsEntity, Long> {
	Optional<ReservationsEntity> findByClientId(Long clientId);

	Optional<ReservationsEntity> findByReservationDate(LocalDate reservationDate);

	Optional<ReservationsEntity> findByStatusIgnoreCase(String status);
}
