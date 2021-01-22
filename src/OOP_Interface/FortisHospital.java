package OOP_Interface;

public class FortisHospital extends UNHC implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH - emergencyServices");
	}

	@Override
	public void services_911() {
		System.out.println("FH - services_911");
	}

	@Override
	public String getPatientDetails() {
		System.out.println("FH - getPatientDetails");
		return "some patient detials";
	}

	// UK
	@Override
	public void radiologyServices() {
		System.out.println("FH - radiologyServices");
	}

	@Override
	public void radiologyServices(int doctorCount) {
		System.out.println("FH - radiologyServices with : " + doctorCount);
	}

	@Override
	public void ENTServices() {
		System.out.println("FH - ENTServices");
	}

	// India
	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
	}

	@Override
	public void dentalsServices() {
		System.out.println("FH - dentalsServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
	}

	// FH:
	public void medicalInsurance() {
		System.out.println("FH - medicalInsurance");
	}

	public void medicalTraining() {
		System.out.println("FH - medicalTraining");

	}

	@Override
	public void covid19Testing() {
		System.out.println("FH -- covid19Testing");
	}
	
	public static void billing() {
		System.out.println("FH -- billing system");
	}

	@Override
	public void ambulanceServices() {
		System.out.println("FH -- ambulance Services : " + 400);
	}
	
	
}