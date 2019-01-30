/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;
import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.UUID;

/**
 *
 * @author DEKSTOP
 */
public class Konversi {

    /**
     * @param angka
     * @param args the command line arguments
     * @return 
     */
    public static String konversi(BigInteger angka){
        
        String[] ejaan = {"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
        String baca="";
        BigInteger satu = new BigInteger("10");
        BigInteger dua = new BigInteger("100");
        BigInteger tiga = new BigInteger("1000");
        BigInteger enam = new BigInteger("1000000");
        BigInteger sembilan = new BigInteger("1000000000");
        BigInteger duabelas = new BigInteger("1000000000000");
        BigInteger limabelas = new BigInteger("1000000000000000");
        BigInteger delapanbelas = new BigInteger("1000000000000000000");
        BigInteger duasatu = new BigInteger("1000000000000000000000");
        BigInteger duaempat = new BigInteger("1000000000000000000000000");
        BigInteger duatujuh = new BigInteger("1000000000000000000000000000");
        BigInteger tigapuluh = new BigInteger("1000000000000000000000000000000");
        BigInteger tigatiga = new BigInteger("1000000000000000000000000000000000");
        BigInteger tigaenam = new BigInteger("1000000000000000000000000000000000000");
        
        if(angka.compareTo(new BigInteger("12"))==-1) 
            baca = baca + ejaan[angka.intValue()]; 
        else if(angka.compareTo(new BigInteger("20"))==-1)
            baca = baca + konversi(angka.mod(satu)) + " Belas ";
        else if(angka.compareTo(new BigInteger("100"))==-1)
            baca = baca + konversi(angka.divide(satu)) + " Puluh " + ejaan[angka.intValue()%10];
        else if(angka.compareTo(new BigInteger("200"))==-1)
            baca = baca + "Seratus " + konversi(angka.mod(dua));
        else if(angka.compareTo(new BigInteger("1000"))==-1)
            baca = baca + konversi(angka.divide(dua)) + " Ratus " + konversi(angka.mod(dua));
        else if(angka.compareTo(new BigInteger("2000"))==-1)
            baca = baca + "Seribu " + konversi(angka.mod(tiga));
        else if(angka.compareTo(new BigInteger("1000000"))==-1)
            baca = baca + konversi(angka.divide(tiga)) + " Ribu " + konversi(angka.mod(tiga));
        else if(angka.compareTo(new BigInteger("1000000000"))==-1)
            baca = baca + konversi(angka.divide(enam)) + " Juta " + konversi(angka.mod(enam));
        else if(angka.compareTo(new BigInteger("1000000000000"))==-1)
            baca = baca + konversi(angka.divide(sembilan)) + " Miliar " + konversi(angka.mod(sembilan));
        else if(angka.compareTo(new BigInteger("1000000000000000"))==-1)
            baca = baca + konversi(angka.divide(duabelas)) + " Triliun " + konversi(angka.mod(duabelas));
        else if(angka.compareTo(new BigInteger("1000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(limabelas)) + " Kuadriliun " + konversi(angka.mod(limabelas));
        else if(angka.compareTo(new BigInteger("1000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(delapanbelas)) + " Kuantiliun " + konversi(angka.mod(delapanbelas));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(duasatu)) + " Sekstiliun " + konversi(angka.mod(duasatu));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(duaempat)) + " Septiliun " + konversi(angka.mod(duaempat));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(duatujuh)) + " Oktiliun " + konversi(angka.mod(duatujuh));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(tigapuluh)) + " Noniliun " + konversi(angka.mod(tigapuluh));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000000000000000"))==-1)
            baca = baca + konversi(angka.divide(tigatiga)) + " Desiliun " + konversi(angka.mod(tigatiga));
        else if(angka.compareTo(new BigInteger("1000000000000000000000000000000000000000"))==-1)
            baca = "Angka terlalu besar";
        return baca;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        Konversi bacaAngka = new Konversi();
//        JOptionPane dialog = new JOptionPane(); 
//        String input = dialog.showInputDialog("Masukkan Angka : "); 
//        BigInteger angka = BigInteger.parseBigInteger(input); 
//        dialog.showMessageDialog(dialog,input+" = "+ bacaAngka.konversi(angka));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        BigInteger bi = scanner.nextBigInteger();
        
        System.out.print(konversi(bi)+ " rupiah" + "\n");
        
    }
    
}
