/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;
import java.util.Scanner;
/**
 *
 * @author asahi
 */
public class BMICalculator {
public static void main(String[] args) {
Scanner masukan = new Scanner(System.in);
int jk;
float berat, tinggi, bmi, meter;
System.out.println("PROGRAM PERHITUNGAN BMI");
System.out.println("Masukkan jenis kelamin (1.laki laki) |(2. perempuan) : ");
jk = masukan.nextInt();
System.out.println("Masukan berat badan :");
berat = masukan.nextFloat();
System.out.println("Masukkan tinggi badan :");
tinggi = masukan.nextFloat();

meter=tinggi/100;
bmi = (berat/(meter*meter));

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("BMI: "+bmi+" ");

if(bmi <18.5){
System.out.println("KURUS");
}
else if (bmi <=22.9){
System.out.println("IDEAL");
}
else if (bmi <24.9){
System.out.println("OVERWEIGHT");
}
else{
System.out.println("OBESITAS"); 
}
    }
}





