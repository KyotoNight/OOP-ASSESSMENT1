public class HealthProfessional {
    private int id;
    private String name;
    private String specialization;

    public HealthProfessional() {
        this.id = 0;
        this.name = "Unspecified";
        this.specialization = "Unspecified";
    }

    public HealthProfessional(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    public void printDetails() {
        System.out.println("\nHealth Professional Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
} 