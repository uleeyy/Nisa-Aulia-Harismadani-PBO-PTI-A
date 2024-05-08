public abstract class Employee {
    private String name; 
    private String noKTP;
    private String tanggalLahir;
    public Employee(String name, String noKTP, String tanggalLahir2){ 
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }
    public String getName(){ 
        return name;
    }
    public String getNoKTP(){ 
        return noKTP;
    }
    public String toString(){
        return	String.format("	"+getName()+"\nNo. KTP :"+getNoKTP());
    }
    public abstract double earnings();//pendapatan
}