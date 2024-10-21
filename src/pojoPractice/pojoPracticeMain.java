package pojoPractice;

public class pojoPracticeMain {
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch(i){
                case 1 -> "Bob";
                case 2 -> "Alice";
                case 3 -> "Charlie";
                case 4 -> "David";
                case 5 -> "Eve";
                default -> "Unknown";
                    },
                    "01/01/2000",
                    "Math, Science, English");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S923001",
                "Bob",
                "01/01/2000",
                "Math, Science, English");
        System.out.println(pojoStudent.getName());
        LPAStudent lpaStudent = new LPAStudent("S923001",
                "Bob",
                "01/01/2000",
                "Math, Science, English");
        System.out.println(lpaStudent.name());
    }


}
