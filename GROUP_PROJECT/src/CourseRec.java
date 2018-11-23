
public class CourseRec {
	
	private String code;
	private String name;
	private String description;
	private int credit;
	private Date startDate;
	private Date endDate;
	
	
	
	public CourseRec() {
		setCode("CodeForCourse");              
		setName("name");              
		setDescription("description");
		setCredit(1000);                      
		setStartDate(new Date(01,01,2018));    
		setEndDate(new Date(01,01,2018));        
		                            
	}
	
	
	public CourseRec(String code, String name, String description, int credit, Date startDate, Date endDate) {
		//super();
		setCode(code);
		setName(name);
		setDescription(description);
		setCredit(credit);                                                                                                                                                                                                                                                                                  );
		setStartDate(startDate);
		setEndDate(endDate);
	}
	
	
	public CourseRec(CourseRec obj) {
		setCode(obj.getCode());
		setName(obj.getName());
		setDescription(obj.getDescription());
		setCredit(obj.getCredit());
		
		
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
	
	
	
	
	
}
