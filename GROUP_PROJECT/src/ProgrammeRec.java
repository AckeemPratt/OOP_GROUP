
	public class ProgrammeRec {
		
		private String programme;
		
		
		public ProgrammeRec() {
			setProgramme("programme");
		}
		

		 public ProgrammeRec(String programme) {
			 setProgramme(programme);
		}
		 
		public ProgrammeRec(ProgrammeRec programme) {
			setProgramme(programme.getProgramme());
		} 
		
		
		public String getProgramme() {
			return programme;
		}
		public void setProgramme(String programme) {
			this.programme = programme;
		}

		
		public String toString() {
			String out;
			
			out = getProgramme() + "\n";
			return out;
		}
		
		
	}
  
