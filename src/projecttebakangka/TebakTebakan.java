/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka;
import java.util.Random; // untuk memanggil bil bulat secara random
import java.util.Scanner; // untuk proses input data yang dilakukan pemain
/**
 *
 * @author Acer
 */
public class TebakTebakan {
    //attribut
    int tebak; // sebagai variabel angka yang ditebak pemain
    int bil; // sebagai variabel angka yang ditentukan sistem
    //method
    void ayoTebak(){ //rumus yang dibuat sistem untuk project game tebak angka
        Random angka = new Random(); // membuat obyek untuk pemanggilan bil bulat random, obyek = "angka"
        this.bil = angka.nextInt(101); // obyek yang tadi dibuat untuk mendefinisikan attribut bil
        Scanner input = new Scanner(System.in); // membuat obyek untuk input data, obyek =  "input"
        do { // statement do-while untuk proses looping program
            System.out.print("Masukan angka tebakan anda: "); // tampilan kepada pemain untuk memasukan angka tebakannya
            this.tebak = input.nextInt(); // program agar pemain dapat menginput bil bulat
            if (this.tebak > this.bil){ // kondisi saat tebakan pemain terlalu tinggi
                System.out.println("Tebakan anda terlalu tinggi!"); // tampilan untuk pemain yang tebakannya terlalu tinggi/false
            }else if (this.tebak < this.bil){ // kondisi saat tebakan pemain terlalu rendah
                System.out.println("Tebakan anda terlalu rendah!"); // tampilan untuk pemain yang tebakannya terlalu rendah/false
            }else { // kondisi ketika tebakan pemain benar atau sesuai dengan yang ditentukan sistem
                System.out.println("YESS, Selamat tebakan anda tepat!"); // tampilan untuk pemain yang tebakannya tepat/true
            }
        }while (this.tebak != this.bil); // statement do-while untuk proses looping
    }
}
    
