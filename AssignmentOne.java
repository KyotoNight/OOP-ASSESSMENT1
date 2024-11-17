import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    
    public static boolean createAppointment(String patientName, String patientPhone, 
                                          String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.trim().isEmpty() ||
            patientPhone == null || patientPhone.trim().isEmpty() ||
            timeSlot == null || timeSlot.trim().isEmpty() ||
            doctor == null) {
            System.out.println("Error: All appointment information must be provided!");
            return false;
        }
        
        for (Appointment app : appointments) {
            if (app.getTimeSlot().equals(timeSlot) && app.getDoctor().equals(doctor)) {
                System.out.println("Error: This time slot is already booked!");
                return false;
            }
        }
        
        Appointment newAppointment = new Appointment(patientName, patientPhone, timeSlot, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created successfully!");
        return true;
    }
    
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments currently exist.");
            return;
        }
        
        System.out.println("\n=== Existing Appointments List ===");
        for (Appointment app : appointments) {
            app.printAppointmentDetails();
        }
    }
    
    public static boolean cancelBooking(String patientPhone) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientPhone().equals(patientPhone)) {
                appointments.remove(i);
                System.out.println("Appointment cancelled successfully!");
                return true;
            }
        }
        System.out.println("Error: No appointment found for this phone number.");
        return false;
    }

    public static void main(String[] args) {
        // Part 3 - Using Classes and Objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1001, "Dr. Zhang", "General Medicine", 10, true);
        GeneralPractitioner gp2 = new GeneralPractitioner(1002, "Dr. Wang", "General Medicine", 15, false);
        GeneralPractitioner gp3 = new GeneralPractitioner(1003, "Dr. Liu", "General Medicine", 5, true);

        Specialist sp1 = new Specialist(2001, "Dr. Li", "Cardiology", "Cardiovascular Disease", 200.0);
        Specialist sp2 = new Specialist(2002, "Dr. Chen", "Orthopedics", "Joint Surgery", 180.0);

        System.out.println("\n=== Health Professionals List ===");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        sp1.printDetails();
        sp2.printDetails();

        System.out.println("------------------------------");

        // Part 5 - Collection of Appointments
        System.out.println("\n=== Creating Appointments Test ===");
        
        createAppointment("Mr. Zhao", "13800138000", "09:30", gp1);
        createAppointment("Mr. Qian", "13900139000", "10:30", gp2);
        createAppointment("Mr. Sun", "13700137000", "14:30", sp1);
        createAppointment("Mr. Li", "13600136000", "15:30", sp2);
        
        System.out.println("\n=== Printing All Appointments ===");
        printExistingAppointments();
        
        System.out.println("\n=== Cancelling Appointment Test ===");
        cancelBooking("13800138000");
        
        System.out.println("\n=== Updated Appointments List ===");
        printExistingAppointments();
        
        System.out.println("------------------------------");
    }
} 