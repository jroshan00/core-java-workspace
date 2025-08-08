package implementingDeque.sampleProject;

import java.util.Objects;

public class Task implements Comparable<Task> {
	private String taskName;
	private Integer noOfDays;
	private Double funds;
	
	public Task() {}
	public Task(String taskName, Integer noOfDays, Double funds) {
		super();
		this.taskName = taskName;
		this.noOfDays = noOfDays;
		this.funds = funds;
	}
	@Override
	public int hashCode() {
		return Objects.hash(funds, noOfDays, taskName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(funds, other.funds) && Objects.equals(noOfDays, other.noOfDays)
				&& Objects.equals(taskName, other.taskName);
	}
	
	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", noOfDays=" + noOfDays + ", funds=" + funds.intValue() + "]";
	}
	@Override
	public int compareTo(Task t) {
		if(this.noOfDays==t.noOfDays) {
			return (int)(this.funds-t.funds);
		}
		return this.noOfDays-t.noOfDays;
	}
	

}
