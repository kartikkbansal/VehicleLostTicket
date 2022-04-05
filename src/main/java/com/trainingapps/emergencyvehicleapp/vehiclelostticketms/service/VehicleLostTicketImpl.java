package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.service;

import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.dto.VehicleLostTicketDetails;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.entity.VehicleLostTicket;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import com.trainingapps.emergencyvehicleapp.vehiclelostticketms.util.VehicleLostTicketUtil;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Transactional
@Service
public class VehicleLostTicketImpl implements ITicketService {
	

	    @Autowired
	    ITicketRepository repository;

	    @Autowired
	    VehicleLostTicketUtil vehicleLostTicketUtil;



	    @Override
	    public VehicleLostTicketDetails add(VehicleLostTicket request) {
	    	VehicleLostTicket vehicleLostTicket = new VehicleLostTicket();
	    	VehicleLostTicket.setId(request.getId());
	    	VehicleLostTicket.setOwnerId(request.getOwnerId());
	    	VehicleLostTicket.setVehicleNumber(request.getVehicleNumber());
	    	VehicleLostTicket.setLostDate(request.getLostDate());
	    	VehicleLostTicket.setStatus(request.getStatus());

	    	VehicleLostTicket = repository.save(vehicleLostRequest);

	       VehicleLostTicketDetails out  = vehicleLostRequestUtil.toVehicleLostTicketDetails(vehicleLostRequest);


	         return out;


	    }

	    @Override
	    public TicketDetails findById(Long id) {

	        Optional<TicketDetails> optional = repository.findById(id);
	        if(!optional.isPresent()){
	            System.out.println("Id not availaible");
	        }

	       TicketDetails output = optional.get();


	        return output;
	    }

	    @Override
	    public TicketDetails findTicketDetailsById(Long id) {
	        TicketDetails ticketDetails = findById(id);
	        TicketDetails details = vehicleLostRequestUtil.toTicketDetails(ticketDetails);
	        return details;
	    }

}
