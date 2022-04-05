package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.repository;

import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.entity.VehicleLostTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepository extends JpaRepository<VehicleLostTicket,Long> {

}
