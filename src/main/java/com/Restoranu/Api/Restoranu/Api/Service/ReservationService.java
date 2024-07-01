package com.Restoranu.Api.Restoranu.Api.Service;

import com.Restoranu.Api.Restoranu.Api.Entity.ReservationsEntity;

import java.time.LocalDate;
import java.util.List;

public interface ReservationService {
	ReservationsEntity create(ReservationsEntity reservation);
	List<ReservationsEntity> getAllReservations();
	List<ReservationsEntity> getAllReservationsByClientId(Long ClientId);
	List<ReservationsEntity> getAllReservationsByDate(LocalDate date);
	List<ReservationsEntity> getAllReservationsByStatus(String status);
	void deleteReservationById(Long reservationId);
}
