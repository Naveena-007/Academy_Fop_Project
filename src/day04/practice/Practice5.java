package day04.practice;


public class Practice5 {	​
	public static void main(String[] args) {
		Leave leave1 = new Leave("Ram", "2023-07-10", "2023-07-15", "Vacation");
		leave1.applyLeave();
		leave1.cancelLeave();
	}

	public static class Leave {
		private String employeeName;
		private String startDate;
		private String endDate;
		private String reason;

		public Leave(String employeeName, String startDate, String endDate, String reason) {
			this.employeeName = employeeName;
			this.startDate = startDate;
			this.endDate = endDate;
			this.reason = reason;
		}
		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
		public void applyLeave() {
		
			System.out.println("Leave application submitted.");
		}

		public void cancelLeave() {
			
			System.out.println("Leave application canceled.");
		}
	}
}