package com.lti.rest;

import java.util.ArrayList;
import java.util.List;

import com.lti.rest.Passenger.Status;

public class PnrDao {
	public Pnr fetch(int pnrNo) {
		Pnr pnr = new Pnr();
		pnr.setPnrNo(pnrNo);
        pnr.setTrainNo(123456);
        
        List<Passenger> passengers = new ArrayList<>();
        Passenger p = new Passenger();
        p.setName("Passenger 1");
        p.setStatus(Status.RAC);
        
        Passenger p1 = new Passenger();
        p1.setName("Passenger 2");
        p1.setStatus(Status.WAITING);
        
        Passenger p2 = new Passenger();
        p2.setName("Passenger 3");
        p2.setStatus(Status.CONFIRMED);
        
        passengers.add(p);
        passengers.add(p1);
        passengers.add(p2);
        pnr.setPassengers(passengers);
        
        
		return pnr;
	}

}
