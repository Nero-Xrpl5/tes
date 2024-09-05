public class musik {

    private String jenis;
    private double price;

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public musik() {
        jenis = "kosong";
        price = 0;
    }

    public musik(String j, double p) {
        jenis = j;
        price = p;

    }

    public void print() {
        System.out.println("Jenis : " + jenis);
        System.out.println("Harga : " + price);

    }

}
