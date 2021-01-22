package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.dentalsServices();
		System.out.println(fh.getPatientDetails());
		
		fh.medicalInsurance();
		fh.medicalTraining();
		
		fh.medicalFunds();
		fh.worldMedicalPolicies();
		
		fh.ambulanceServices();
		
		System.out.println(USMedical.min_fee);
		
		USMedical.billing();
		FortisHospital.billing();
		
		//Top Casting: child class object can be referred by parent interface ref variable:
		USMedical us = new FortisHospital();
		
		us.cardioServices();
		us.emergencyServices();
		us.getPatientDetails();
		us.physioServices();
		us.services_911();
		
		//down casting: not allowed
		//new USMedical();
		
		
		
		
		
		
		
		
	}

}