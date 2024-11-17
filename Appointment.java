public class Appointment {
    private String patientName;
    private String patientPhone;
    private String timeSlot;
    private HealthProfessional doctor;
    
    public Appointment() {
        this.patientName = "Unspecified";
        this.patientPhone = "Unspecified";
        this.timeSlot = "Unspecified";
        this.doctor = null;
    }
    
    public Appointment(String patientName, String patientPhone, 
                      String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }
    
    public void printAppointmentDetails() {
        System.out.println("\nAppointment Information:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Contact Number: " + patientPhone);
        System.out.println("Appointment Time: " + timeSlot);
        System.out.println("\nDoctor Information:");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor assigned");
        }
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public String getPatientPhone() {
        return patientPhone;
    }
    
    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }
    
    public String getTimeSlot() {
        return timeSlot;
    }
    
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    public HealthProfessional getDoctor() {
        return doctor;
    }
    
    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
} 