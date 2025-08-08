package implementingQueue.programs;

import java.util.Objects;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Patient implements Comparable<Patient> {
	private String patientName;
	private String patientId;
	private Doctor doctor;
	
	Patient(String patientName,String patientId, Doctor doctor){
		this.patientId=patientId;
		this.patientName=patientName;
		this.doctor=doctor;
	}
	
	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", patientId=" + patientId + ", doctor=" + doctor + "]";
	}
	
	public static void main(String[] args) {
		Queue<Patient> appointments=new PriorityQueue<>();
		appointments.add(new Patient("Roshan","101",new Doctor("Harish Verma","65987")));
		appointments.add(new Patient("Rohan","102",new Doctor("Harish Verma","65987")));
		appointments.add(new Patient("Ishan","103",new Doctor("Harish Verma","65987")));
		
		System.out.println("===========Default======");
		for (Patient patient : appointments) {
			System.out.println(patient);
		}
		
		System.out.println("==========FIFO=========");
		appointments.stream()
		.sorted((p1,p2)->(Integer.parseInt(p1.patientId)-Integer.parseInt(p2.patientId)))
		.forEach(patient->System.out.println(patient));
		
		System.out.println("==========LIFO=========");
		appointments.stream()
		.sorted((p1,p2)->-(Integer.parseInt(p1.patientId)+Integer.parseInt(p2.patientId)))
		.forEach(patient->System.out.println(patient));
		
		/**
		 * Not Applicable for Queue<>
		 * <code>
		 * Collections.sort(appointments,(Patient p1, Patient p2)->(Integer.parseInt(p1.patientId)-Integer.parseInt(p2.patientId)));
		 * </code>
		 */
	
		
	}
	
	private static class Doctor{
		private String doctorName;
		private String doctorId;
		public Doctor(String doctorname, String doctorId) {
			super();
			this.doctorName = doctorname;
			this.doctorId = doctorId;
		}
		 @Override
		 public String toString(){
			 return "Doctor [doctorName : "+doctorName+", doctorId : "+doctorId+" ]";
		 }
		 @Override
			public int hashCode() {
				return Objects.hash(doctorId, doctorName);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Doctor other = (Doctor) obj;
				return Objects.equals(doctorId, other.doctorId) && Objects.equals(doctorName, other.doctorName);
			}
	}
	
	@Override
	public int compareTo(Patient p) {
		return Integer.parseInt(this.patientId)-Integer.parseInt(p.patientId);
	}
	@Override
	public int hashCode() {
		return Objects.hash(doctor, patientId, patientName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(doctor, other.doctor) && Objects.equals(patientId, other.patientId)
				&& Objects.equals(patientName, other.patientName);
	}
}
