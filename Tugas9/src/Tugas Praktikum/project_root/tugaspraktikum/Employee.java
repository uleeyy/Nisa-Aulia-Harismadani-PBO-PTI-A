package project_root.tugaspraktikum;

class Employee implements Payable {
    private String name;
    private int registrationNumber;
    private int salaryPerMonth; 
    private Invoice[] invoices;
    
    Employee (String name, int registrationNumber, int salaryPerMonth, int allInvoice) {
    this. name = name;
    this.registrationNumber = registrationNumber;
    this. salaryPerMonth = salaryPerMonth;
    this. invoices = new Invoice[allInvoice];
    }

    public String getName() {
        return name;
    }
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
    public Invoice[] getInvoices() {
        return invoices;
    }
    @Override
    public double getPayableAmount() {
        double pAmount = 0;
        for (Invoice in : invoices) {
            pAmount += in.getPayableAmount();
        }
        return getSalaryPerMonth() - pAmount;
    }

    public void output() {
        System.out.println("");

        System.out.println ("===============================================");
        System.out.println ("Nama\t\t\t\t: " + getName ());
        System.out.println ("Nomor Registrasi\t: " + getRegistrationNumber ());
        System.out.println ("Gaji per Bulan\t\t: " + getSalaryPerMonth ());

        System.out.println ("===============================================");
        System.out.println("\t\t\tPRODUK YANG DIBELI");
        System.out.println ("===============================================");
        System.out.println("Nama Produk" + "\tHarga Per Item" + "\tJumlah Produk");
        for (Invoice in : invoices) {
            in.output();
        }
    }
}