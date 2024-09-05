package javasatunya;

public class SiswaTester {
    public static void main(String[] args) {
        Siswa Nafis = new Siswa(101, "Nafis", 70.1);
        Siswa Reyhan = new Siswa(102, "Reyhan", 9.9);

        Nafis.print();
        Reyhan.print();

        //Membandingkan ipk 2 object

        if (Nafis.getIpk() > Reyhan.getIpk()) {
            System.out.println("IPK Nafis lebih besar ");
            
        }else{
            System.out.println("IPK Reyhan lebih besar");
        }

        //Diatas nilai 75 lulus

        if (Nafis.getIpk() >= 75) {
            System.out.println("Lulus");
            
        }else{
            System.out.println("Tidak Lulus");
        }

        //Operator AND

        if (Nafis.getIpk() >= 70 && Nafis.getNama().equals("Nafis")){
            System.out.println("Benar");
            
        }else{
            System.out.println("Salah");
        }

    }    
}
