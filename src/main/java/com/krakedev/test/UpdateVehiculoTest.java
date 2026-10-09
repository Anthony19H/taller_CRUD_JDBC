package com.krakedev.test;

import com.krakedev.entidades.Vehiculo;
import com.krakedev.jdbc.UpdateVehiculo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateVehiculoTest {

	private static final Logger log = LogManager.getLogger(UpdateVehiculoTest.class);

	public static void main(String[] args) {

	    Vehiculo vehiculo = new Vehiculo("PDA-1235", "Chery", "Tigo 7 pro max", 2020, 15000, "naranja", true);

	    UpdateVehiculo.update(vehiculo);

	}

}
