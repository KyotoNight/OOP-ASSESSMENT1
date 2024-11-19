public class Specialist extends HealthProfessional {
    private String subspecialty;
    private double consultationFee;

    public Specialist() {
        super();
        this.subspecialty = "Unspecified";
        this.consultationFee = 0.0;
    }

    public Specialist(int id, String name, String specialization, 
                     String subspecialty, double consultationFee) {
        super(id, name, specialization);
        this.subspecialty = subspecialty;
        this.consultationFee = consultationFee;
    }

    @Override
    public void printDetails() {
        System.out.println("\nSpecialist Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Subspecialty: " + subspecialty);
        System.out.println("Consultation Fee: $" + consultationFee);
    }

    public String getSubspecialty() {
        return subspecialty;
    }

    public void setSubspecialty(String subspecialty) {
        this.subspecialty = subspecialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
} 