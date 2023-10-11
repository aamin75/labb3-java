package edu.lernia.labb3;

class Patient {

		private String name;
		private String sickness;

		Patient(String name) {
	        this.name = name;
	    }
		
		Patient(String name, String sickness) {
	        this.name = name;
	        this.sickness = sickness;
	    }
	    
	    public boolean isSick() {
	    	if (this.sickness == null || this.sickness.isEmpty()) {
	    		return false;
	    	} else {
	    		return true;
	    	}
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    
	    public String getSickness() {
	    	return sickness;
	    }
	    

		public void takeMedication(Medicine medicine) {
			 if (isSick() && this.sickness.equals(medicine.getTreatmentName())) {
			      sickness=null;
			 }  
		}
}
