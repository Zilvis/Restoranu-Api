package com.Restoranu.Api.Restoranu.Api.Controller;

import com.Restoranu.Api.Restoranu.Api.Entity.ReservationsEntity;
import com.Restoranu.Api.Restoranu.Api.Service.ReservationService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@PostMapping("/reservations")
	public ReservationsEntity create(@RequestBody ReservationsEntity reservation){
		LocalDate date = LocalDate.now();
		reservation.setReservationDate(date);
		return reservationService.create(reservation);
	}

	@GetMapping("/reservations")
	public List<ReservationsEntity> getAllReservations(@RequestParam (required = false) LocalDate date) {
		if(date!=null){
            return reservationService.getAllReservationsByDate(date);
        }
		return reservationService.getAllReservations();
	}

	@GetMapping("/reservations/client/{clientId}")
    public List<ReservationsEntity> getReservationById(@PathVariable Long clientId){
        return reservationService.getAllReservationsByClientId(clientId);
    }

	@GetMapping("/reservations/confirmed")
	public List<ReservationsEntity> getAllConfirmedReservations(){
        return reservationService.getAllReservationsByStatus("Confirmed");
    }

	@GetMapping("/reservations/canceled")
	public List<ReservationsEntity> getAllCanceledReservations(){
		return reservationService.getAllReservationsByStatus("Canceled");
	}

	@DeleteMapping("/reservations/{reservationId}")
	public void deleteReservation(@PathVariable Long reservationId){
        reservationService.deleteReservationById(reservationId);
    }
}
