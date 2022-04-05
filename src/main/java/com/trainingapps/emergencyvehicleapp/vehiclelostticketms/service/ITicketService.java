package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.service;

import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.dto.VehicleLostTicketDetails;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.entity.VehicleLostTicket;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.util.VehicleLostTicketUtil;

import org.springframework.validation.annotation.Validated;

import java.util.List;



@Validated
public interface ITicketService {
	
	    VehicleLostTicketDetails add(@Valid VehicleLostTicketUtil request);
	    
	    VehicleLostTicketDetails  findTicketDetailsById(@Min(1)Long id);
	    
	    List<VehicleLostTicketDetails> findTicketDetailsByOwnerId(Long ownerId);

		VehicleLostTicketDetails add(VehicleLostTicket request);

	}

}
