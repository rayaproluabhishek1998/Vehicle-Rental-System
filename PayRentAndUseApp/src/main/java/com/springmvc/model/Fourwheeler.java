package com.springmvc.model;

public class Fourwheeler extends Vehicle {

	public Fourwheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fourwheeler(String vehiclenumber, String vehicletype, String vehiclecolour, String enginenumber,
			String chassisnumber, String price, String e_mail) {
		super(vehiclenumber, vehicletype, vehiclecolour, enginenumber, chassisnumber, price, e_mail);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Fourwheeler [getVehiclenumber()=" + getVehiclenumber() + ", getVehicletype()=" + getVehicletype()
				+ ", getVehiclecolour()=" + getVehiclecolour() + ", getEnginenumber()=" + getEnginenumber()
				+ ", getChassisnumber()=" + getChassisnumber() + ", getPrice()=" + getPrice() + ", getE_mail()="
				+ getE_mail() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	

	
	
}
