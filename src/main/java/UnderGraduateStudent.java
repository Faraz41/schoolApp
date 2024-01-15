public class UnderGraduateStudent extends Student {
    private String major;

    public UnderGraduateStudent(String name, int age, String major) {
        super(name, age);
        this.major= major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "UnderGraduateStudent{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }
}
