
	public class Date {
		
		private int day;
		private int month;
		private int year;
		
		
		public Date() {
			setDay(01);
			setMonth(01);
			setYear(2018);
		}
		

		 public Date(int day, int month, int year) {
			 setDay(day);
			 setMonth(month);
			 setYear(year);
		}
		 
		public Date(Date date) {
			setDay(date.getDay());
			setMonth(date.getMonth());
			setYear(date.getYear());
		} 
		
		
		public int getDay() {
			return day;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}


		
		public String toString() {
			
			String out;
			out = getDay() + "/";
			out += getMonth() + "/";
			out += getYear();
			return out;
		}
		
		
	}
  
