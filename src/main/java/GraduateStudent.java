public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                "researchTopic='" + researchTopic + '\'' +
                "} " + super.toString();
    }
}
