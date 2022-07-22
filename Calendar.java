package Calendar_Java;

public class Calendar{

    private final String[] dayNamesShort = {"Mo","Tu","We","Th","Fr","Sa","Su"};

    Date testDate1 = new Date(26, 2, 2001);

    public void createEmptyCalendar()
    {
        System.out.printf("%10s%5s%n",testDate1.getMonthName(),testDate1.getYear());
        System.out.printf("Mo Tu We Th Fr Sa Su %n");
    }
}