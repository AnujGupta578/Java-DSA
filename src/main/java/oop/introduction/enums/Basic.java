package oop.introduction.enums;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

//        these are eums constants
//        public, static, and final
//        since its final you can't create chi;ld enums
//        type is Week
        Week() {
            System.out.println("Constructor called for" + this);
        }

//        this si not public or protected, only private r default
//        why ? We don't want to create new objects
//        this is not the enum concept, that's why
//        internally: public static final Week Monday = new Week();

    }


    public static void main(String[] args) {
        Week week;
        week = Week.Friday;

//        System.out.println(week);
//        System.out.println(week.ordinal());

//        for (Week day: Week.values()
//             ) {
//            System.out.println(day);
//
//        }
    }
}
