package springcore.java.config;


public class Student {
    private Samosa samosa;

    public Student() {
        super();
    }

    // ✅ ADD THIS
    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study() {
        samosa.display();
        System.out.println("Student is reading book");
    }
}