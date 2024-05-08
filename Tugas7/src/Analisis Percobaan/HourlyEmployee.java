public class HourlyEmployee extends Employee { 
    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu
    private String tanggalLahir; // tanggal lahir dalam format dd-mm-yyyy 
    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked, String tanggalLahir) { 
        super(name, noKTP, tanggalLahir);
        setWage(hourlyWage); 
        setHours(hoursWorked);
        setTanggalLahir(tanggalLahir);
    }
    public void setWage(double hourlyWage){ 
        wage = hourlyWage;
    }
    public double getWage(){ 
        return wage;
    }
    public void setHours(double hoursWorked){ 
        hours = hoursWorked;
    }
    public double getHours(){ 
        return hours;
    }
    public void setTanggalLahir(String tanggalLahir){ 
        tanggalLahir = tanggalLahir;
    }
    public String getTanggalLahir(){ 
        return tanggalLahir;
    }
    public double earnings(){ 
        if(getHours()<=40)
            return getWage() * getHours();
        else
            return 40 * getWage() + ( getHours()-40) * getWage() * 1.5;
    }
    public String toString(){
    return	String.format("Hourly	employee: "+super.toString() +"\nhourly	wage "+getWage()+"\nhours	worked: "+getHours());
    }
}