package switch_expressions;

public class ReturnFromSwitch {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    /*
    case label_1, label_2, ..., label_n -> expression;|throw-statement;|block
     */
    public static void main(String[] args) {

        Day day = Day.WEDNESDAY;
        System.out.println(
                switch (day) {
                    case MONDAY, FRIDAY, SUNDAY -> 6;
                    case TUESDAY -> 7;
                    case THURSDAY, SATURDAY -> 8;
                    case WEDNESDAY -> 9;
                    default -> throw new IllegalStateException("Invalid day: " + day); // default is not required on an enum
                }
        );

        int numLetters = 0;
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
            case TUESDAY -> numLetters = 7;
            case THURSDAY, SATURDAY -> numLetters = 8;
            case WEDNESDAY -> numLetters = 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        }
        System.out.println(numLetters);
    }

}
