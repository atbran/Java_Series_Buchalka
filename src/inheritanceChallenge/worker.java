package inheritanceChallenge;

public class worker {
    public worker() {
        Name = "Unknown";
        BirthDate = "Unknown";
        endDate = "Unknown";
    }

    public worker(String name, String birthDate, String endDate) {
        Name = name;
        BirthDate = birthDate;
        this.endDate = endDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    String Name;
        String BirthDate;
        String endDate;

        public int getAge(){
            return 0;
        }
        public double collectPay(){
            return 0.0;
        }
        public String terminate(){
            return endDate;
        }

}
