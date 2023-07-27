/** class abstrak */
abstract class Mobil {
    private String merk;
    private String model;
    private int tahunProduksi;

    
    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    // Getter untuk mendapatkan informasi merk mobil
    public String getMerk() {
        return merk;
    }

    // Getter untuk mendapatkan informasi model mobil
    public String getModel() {
        return model;
    }

    // Getter untuk mendapatkan informasi tahun produksi mobil
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    
    public abstract double hitungHarga();
}

// Contoh kelas turunan dari Mobil
class Sedan extends Mobil {
    private double harga;

  
    public Sedan(String merk, String model, int tahunProduksi, double harga) {
        super(merk, model, tahunProduksi);
        this.harga = harga;
    }

    // Implementasi metode hitungHarga untuk menghitung harga mobil sedan
    @Override
    public double hitungHarga() {
        return harga;
    }
}

// Contoh kelas turunan lainnya dari Mobil
class SUV extends Mobil {
    private double harga;
    private boolean offRoad;

    // Konstruktor
    public SUV(String merk, String model, int tahunProduksi, double harga, boolean offRoad) {
        super(merk, model, tahunProduksi);
        this.harga = harga;
        this.offRoad = offRoad;
    }

    // Implementasi metode hitungHarga untuk menghitung harga mobil SUV
    @Override
    public double hitungHarga() {
        if (offRoad) {
            return harga + 5000; // Harga tambahan untuk mobil SUV off-road
        } else {
            return harga;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan inheritance, enkapsulasi, overloading, dan overriding
        Mobil sedan = new Sedan("Toyota", "Camry", 2022, 30000);
        Mobil suv = new SUV("aston", "Explorer", 2021, 40000, true);

        // Mengakses informasi mobil menggunakan getter
        System.out.println("Merk Mobil Sedan: " + sedan.getMerk());
        System.out.println("Model Mobil Sedan: " + sedan.getModel());
        System.out.println("Tahun Produksi Mobil Sedan: " + sedan.getTahunProduksi());
        System.out.println("Harga Mobil Sedan: $" + sedan.hitungHarga());

        System.out.println();

        System.out.println("Merk Mobil SUV: " + suv.getMerk());
        System.out.println("Model Mobil SUV: " + suv.getModel());
        System.out.println("Tahun Produksi Mobil SUV: " + suv.getTahunProduksi());
        System.out.println("Harga Mobil SUV: $" + suv.hitungHarga());
    }
}