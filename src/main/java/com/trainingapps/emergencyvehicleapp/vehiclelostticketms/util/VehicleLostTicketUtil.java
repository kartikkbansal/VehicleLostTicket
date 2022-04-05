package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.util;

import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.dto.VehicleLostTicketDetails;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.entity.VehicleLostTicket;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class VehicleLostTicketUtil {
	
public  VehicleLostTicketDetails  toVehicleLostTicketDetails(VehicleLostTicket vehicleLostTicket){
				   VehicleLostTicketDetails ticketDetails = new VehicleLostTicketDetails();
			       ticketDetails.setId(vehicleLostTicket.getId());
			       ticketDetails.setOwnerId(vehicleLostTicket.getOwnerId());
			       ticketDetails.setVehicleNumber(vehicleLostTicket.getVehicleNumber());
			       ticketDetails.setLostDate(vehicleLostTicket.getLostDate());
			       return ticketDetails;

			    }


			    
			}

	}


}
