package com.trainingapps.emergencyvehicleapp.vehiclelostticketms.dto;

import java.time.LocalDate;

public class VehicleLostTicketDetails {
	
	    private Long id; //ticket id
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
		public LocalDate getLostDate() {
			return lostDate;
		}
		public void setLostDate(Object object) {
			this.lostDate = (LocalDate) object;
		}
		private Long ownerId;
	    private String vehicleNumber;
	    private LocalDate lostDate = LocalDate.now();

}
