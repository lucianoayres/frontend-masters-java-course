package objects;

public record RecordExample(
        int id,
        String name,
        int age,
        String country
) {
    public String getIntroduction() {
        return "Hello, I'm " + this.name + " from " + this.country;
    }
}
