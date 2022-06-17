package zaggle;

public class Address {
	String HOUSENO;
	int SURVEYNO;
	String LOCALITY,TALUKA, DISTRICT, STATE;	
	Address(String h, int sur, String l,String t,String d,String s){
		HOUSENO = h;
		SURVEYNO = sur;
		LOCALITY = l;
		TALUKA = t;
		DISTRICT = d;
		STATE = s;
	}
	public void setHouseNo(String h) {
		HOUSENO = h;
	}
	public void setSurveyNo(int s) {
		SURVEYNO = s;
	}
	public void setLocality(String l) {
		LOCALITY = l;		
	}
	public void setTaluka(String t) {
		TALUKA = t;		
	}
	public void setDistrict(String d) {
		DISTRICT = d;
	}
	public void setState(String s) {
		STATE = s;
	}
	public String getHouseNo() {
		return HOUSENO;
	}
	public int getSurveyNo() {
		return SURVEYNO;
	}
	public String getLocality() {
		return LOCALITY;
	}
	public String getTaluka() {
		return TALUKA;
	}
	public String getDistrict() {
		return DISTRICT;
	}
	public String getState() {
		return STATE;
	}
	public void displayAddress() {
		System.out.println("House Number :- "+HOUSENO);
		System.out.println("Survey Number :- "+SURVEYNO);
		System.out.println("Locality :- "+LOCALITY);
		System.out.println("Taluka :- "+TALUKA);
		System.out.println("District :- "+DISTRICT);
		System.out.println("State :- "+STATE);
		
	}
}

