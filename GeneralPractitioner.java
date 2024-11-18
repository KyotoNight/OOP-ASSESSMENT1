public class GeneralPractitioner extends HealthProfessional {
    private int yearsOfExperience;
    private boolean acceptingNewPatients;

    public GeneralPractitioner() {
        super();
        this.yearsOfExperience = 0;
        this.acceptingNewPatients = false;
    }

    public GeneralPractitioner(int id, String name, String specialization, 
                             int yearsOfExperience, boolean acceptingNewPatients) {
        super(id, name, specialization);
        this.yearsOfExperience = yearsOfExperience;
        this.acceptingNewPatients = acceptingNewPatients;
    }

    @Override
    public void printDetails() {
        System.out.println("\nGeneral Practitioner Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Accepting New Patients: " + (acceptingNewPatients ? "Yes" : "No"));
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isAcceptingNewPatients() {
        return acceptingNewPatients;
    }

    public void setAcceptingNewPatients(boolean acceptingNewPatients) {
        this.acceptingNewPatients = acceptingNewPatients;
    }
} 