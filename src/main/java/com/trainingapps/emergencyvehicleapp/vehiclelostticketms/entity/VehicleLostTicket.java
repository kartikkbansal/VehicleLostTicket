package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name="EmergencyVehicle_info")
@Entity
public class VehicleLostTicket {
	
	    @GeneratedValue
	    @Id
	    private Long id; //ticket id
	    private Long ownerId;
	    private String vehicleNumber;
	    private LocalDate lostDate = LocalDate.now();

	    @Override
	    public String toString() {
	        return "VehicleLostTicket [id" + id + ", ownerId=" + ownerId + ",vehicleNumber=" + vehicleNumber + ",lostDate=" + lostDate + "]";
	    }

	    public VehicleLostTicket(Long id, Long ownerId, String vehicleNumber) {
	        super();
	        this.id = id;
	        this.ownerId = ownerId;
	        this.vehicleNumber = vehicleNumber;
	    }
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Long getOwnerId() {
	        return ownerId;
	    }

	    public void setOwnerId(Long ownerId) {
	        this.ownerId = ownerId;
	    }

	    public String getVehicleNumber() {
	        return vehicleNumber;
	    }

	    public void setVehicleNumber(String vehicleNumber) {
	        this.vehicleNumber = vehicleNumber;
	    }

		public Object getLostDate() {
			// TODO Auto-generated method stub
			return null;
		}

		public static void setLostDate(Object lostDate2) {
			// TODO Auto-generated method stub
			
		}

		public Object getStatus() {
			// TODO Auto-generated method stub
			return null;
		}
	}


