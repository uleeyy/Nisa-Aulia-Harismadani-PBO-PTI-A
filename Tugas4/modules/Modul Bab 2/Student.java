public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student(String n, String a, int ag, double math, double english, double science){
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        average = getAverage();
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
        average = getAverage();
    }

    public void setEnglish(int english){
        englishGrade = english;
        average = getAverage();
    }

    public void setScience(int science){
        scienceGrade = science;
        average = getAverage();
    }

    public boolean statusAkhir() {
        if (average >= 61) {
            return true;
        } else {
            return false;
        }
    }

    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+average);
        System.out.println("Status akhir siswa: "+statusAkhir());
    }
}