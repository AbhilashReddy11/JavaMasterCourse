package pojoAndRecord;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            // we use toString method to print the values
            System.out.println(s);}
            for (int j = 1; j<= 5; j++) {
                LPAStudent r = new LPAStudent("S92300" + j,
                        switch (j) {
                            case 1 -> "Mary";
                            case 2 -> "Carol";
                            case 3 -> "Tim";
                            case 4 -> "Harry";
                            case 5 -> "Lisa";
                            default -> "Anonymous";
                        },
                        "05/11/1985",
                        "Java Masterclass");
                System.out.println(r);
        }
            Student pojoStudent = new Student("S923006", "Ann",
                    "05/11/1985", "Java Masterclass");
            LPAStudent recordStudent = new LPAStudent("S923007", "Bill",
                    "05/11/1985", "Java Masterclass");

            System.out.println(pojoStudent);
            System.out.println(recordStudent);

            pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
            //Record doesnot have setters , 
            // records are immutable
//            recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

            System.out.println(pojoStudent.getName() + " is taking " +
                    pojoStudent.getClassList());
            System.out.println(recordStudent.name() + " is taking " +
                    recordStudent.classList());
        
    }
    }
