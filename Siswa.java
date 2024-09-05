package javasatunya;

public class Siswa {
    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }

    //Constructor Parameter

    public Siswa (int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;



    }

    //getter untuk mengambil nilai var

    public int getID() {
        return id;
    }
    
    //Setter Untuk Mengubah nilai
    
    public void setID(int id) {
        this.id = id;
    }

    //Method

    public void print () {
        System.out.println("ID : "+id);
        System.out.println("Nama : "+nama);
        System.out.println("IPK : "+ipk);
    }




    

}
