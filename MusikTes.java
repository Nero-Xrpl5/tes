import java.util.Scanner;

public class MusikTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        musik a = new musik();
        musik b = new musik("Piano", 200.0);
        musik c = new musik("Violin", 150.9);

        a.setJenis("Gitar");;
        a.setPrice(101.5);;
        a.print();
        b.print();
        c.print();
        System.out.println();

        if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Instrumen Termahal Adalah "+ b.getJenis() );
        }else if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Instrumen Termahal Adalah "+a.getJenis());
        }else if (c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
            System.out.println("Instrumen Termahal Adalah "+c.getJenis());
        }

        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Instrumen Termurah Adalah "+a.getJenis());
            
        }else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Instrumen Termurah Adalah "+b.getJenis());
            
        }else if (c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()){
            System.out.println("Insterumen Termurah Adalah "+c.getJenis());
            
        }


        
    }
    
}
