package objects;

public class RecordUsageExample {
    public static void main(String[] args) {
        RecordExample dummyRecord = new RecordExample(1, "Joe", 29, "Brazil");

        String name = dummyRecord.name();
        String country = dummyRecord.country();
        int age = dummyRecord.age();

        System.out.printf(dummyRecord.getIntroduction());
    }
}
