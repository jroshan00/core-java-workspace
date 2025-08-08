package implementingMultiThreading.irctc_ticket_booking;

import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
	private String pnr;
	private String trainName;
	private String boardingStation;
	private LocalDateTime journeyDate;
	private String destination;
	private double journeyDistance;
	private double fare;
	
	public Ticket() {}
	
	public Ticket(String pnr, String trainName, String boardingStation, LocalDateTime journeyDate, String destination,
			double journeyDistance, double fare) {
		super();
		this.pnr = pnr;
		this.trainName = trainName;
		this.boardingStation = boardingStation;
		this.journeyDate = journeyDate;
		this.destination = destination;
		this.journeyDistance = journeyDistance;
		this.fare = fare;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getBoardingStation() {
		return boardingStation;
	}

	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}

	public LocalDateTime getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(LocalDateTime journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getJourneyDistance() {
		return journeyDistance;
	}

	public void setJourneyDistance(double journeyDistance) {
		this.journeyDistance = journeyDistance;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", trainName=" + trainName + ", boardingStation=" + boardingStation
				+ ", journeyDate=" + journeyDate + ", destination=" + destination + ", journeyDistance="
				+ journeyDistance + ", fare=" + fare + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardingStation, destination, fare, journeyDate, journeyDistance, pnr, trainName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(boardingStation, other.boardingStation) && Objects.equals(destination, other.destination)
				&& Double.doubleToLongBits(fare) == Double.doubleToLongBits(other.fare)
				&& Objects.equals(journeyDate, other.journeyDate)
				&& Double.doubleToLongBits(journeyDistance) == Double.doubleToLongBits(other.journeyDistance)
				&& Objects.equals(pnr, other.pnr) && Objects.equals(trainName, other.trainName);
	}
}
