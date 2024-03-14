public class Mobil { 
    private String noPlat; 
    private String warna; 
    private String manufaktur; 
    private double kecepatanKmPerJam; // Ubah tipe data ke double untuk menyimpan nilai km/h
    private double waktu; // Tambahkan variabel waktu
	private double jarak;

    public void setNoPlat(String s) { 
        noPlat = s; 
    } 

    public void setWarna(String s) { 
        warna = s; 
    } 

    public void setManufaktur(String s) { 
        manufaktur = s; 
    }
	
	public void setWaktu(double w) { 
        waktu = w;
		// Panggil method rubahSekon untuk mengubah waktu dari jam ke detik
		rubahSekon();
	} 

	private void rubahSekon() {
		waktu *= 3600; // ubah jam menjadi detik
	}

	public void setJarak(double j) { 
        jarak = j;
		hitungJarak();
	} 

	private void hitungJarak() {
		jarak = kecepatanKmPerJam * waktu;
	}

    public void setKecepatan(double kmPerJam) { 
        kecepatanKmPerJam = kmPerJam; 
        // Panggil method rubahKecepatan untuk mengubah format kecepatan dari km/h ke m/s
        rubahKecepatan();
    } 

    private void rubahKecepatan() {
        // Konversi kecepatan dari km/h menjadi m/s
        double kecepatanMs = kecepatanKmPerJam * (1000.0 / 3600.0);
        // Simpan kecepatan yang sudah diubah ke dalam variabel kecepatan
        kecepatanKmPerJam = kecepatanMs;
    }

    public void displayMessage() { 
        System.out.println("Mobil anda adalah bermerek " + manufaktur); 
        System.out.println("mempunyai nomor plat " + noPlat); 
        System.out.println("serta memililki warna " + warna); 
        System.out.println("dan mampu menempuh kecepatan " + kecepatanKmPerJam + " m/s"); 
        if (waktu != 0) {
        System.out.println("dengan waktu yang ditempuh " + waktu + " detik");
		System.out.println("dan dengan jarak tempuh " + jarak + " km"); 
        }
    } 
}