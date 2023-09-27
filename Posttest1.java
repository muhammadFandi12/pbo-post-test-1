/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.posttest1;

/**
 *
 * @author NITRO 5
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Motor> daftarMotor = new ArrayList<>();

        // Menambahkan motor ke ArrayList
        daftarMotor.add(new Motor("Honda", "CBR 150R", 2020));
        daftarMotor.add(new Motor("Yamaha", "YZF R6", 2021));
        daftarMotor.add(new Motor("Kawasaki", "Ninja 300", 2019));
        daftarMotor.add(new Motor("Ducati", "Ducati Panigale", 2019));
        daftarMotor.add(new Motor("BMW", "S1000RR", 2019));

        // Menampilkan daftar motor
        System.out.println("Daftar Motor:");
        for (Motor motor : daftarMotor) {
            System.out.println(motor);
        }
    }
}

