package com.lti.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement//(name="p")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pnr {
	
	    @XmlElement(name="pnrNumber")
		private int pnrNo;
		private List<Passenger> passengers;
		
		private int trainNo;
		
		public int getPnrNo() {
			return pnrNo;
		}
		public void setPnrNo(int pnrNo) {
			this.pnrNo = pnrNo;
		}
		public List<Passenger> getPassengers() {
			return passengers;
		}
		public void setPassengers(List<Passenger> passengers) {
			this.passengers = passengers;
		}
		public int getTrainNo() {
			return trainNo;
		}
		public void setTrainNo(int trainNo) {
			this.trainNo = trainNo;
		}
		
		
		
		
}
