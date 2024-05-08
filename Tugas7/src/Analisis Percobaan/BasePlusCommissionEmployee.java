public	class	BasePlusCommissionEmployee	extends CommissionEmployee {	
	private double baseSalary;//gaji pokok tiap minggu
    private String tanggalLahir;

	public	BasePlusCommissionEmployee(String	name,	String noKTP, double sales, double rate, double salary, String tanggalLahir) {	
        super(name, noKTP, sales, rate, tanggalLahir);	
        setBaseSalary(salary);
        setTanggalLahir(tanggalLahir);	
    }	
	
    private void setTanggalLahir(String tanggalLahir2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTanggalLahir'");
    }

    public void setBaseSalary(double salary) {	
        baseSalary = salary;	
    }	
	
    public double getBaseSalary() {	
        return baseSalary;	
    }	
	
    public double earnings() {	
        return getBaseSalary() + super.earnings();	
    }	
	
    public String toString() {
        return	String.format("Base-Salaried	"	+ super.toString() + "\nbase salary " + getBaseSalary());
    }
}