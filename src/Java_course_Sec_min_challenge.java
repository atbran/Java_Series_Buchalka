public class Java_course_Sec_min_challenge {
    public static void main(String[] args) {
        System.out.println("test1 " + getDurationString(25000));
        System.out.println("test2 " +getDurationString(200,54));
        System.out.println("fail1 " +getDurationString(2,90));
        System.out.println("fail2 " +getDurationString(0));


    }
    public static String getDurationString(int seconds){
        if (seconds <= 0){
            return "Invalid duration";
        }
        else {
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            int remaining_seconds = seconds % 60;

            return hours + ":" + minutes + ":" + remaining_seconds;
        }
    }
    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59){
            return "Invalid duration";
        }
        else {
            int conversion_to_sec = minutes * 60 + seconds;
            int hours = conversion_to_sec / 3600;
            int remaining_minutes = (conversion_to_sec % 3600) / 60;
            int remaining_seconds = conversion_to_sec % 60;
            return hours + ":" + remaining_minutes + ":" + remaining_seconds;
        }
    }
}
