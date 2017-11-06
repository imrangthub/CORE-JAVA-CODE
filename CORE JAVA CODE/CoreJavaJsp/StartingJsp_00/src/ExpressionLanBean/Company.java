package ExpressionLanBean;

public class Company {
	
	private String companyName="";
	private String companyType="";
	
	
	
	public Company(String comName, String comType){
		
		setCompanyName(comName);
		setCompanyType(comType);
		
	}
	
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	
	

}
