 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        if (masaKerja < 5) {
            int gajiPokok = 5000000;
            int uangLembur = jamLembur * 40000;
            int totalGaji = gajiPokok + uangLembur;
            System.out.println(totalGaji);
        } else if (masaKerja >= 5 && masaKerja <= 10) {
            int gajiPokok = 7500000;
            int uangLembur = jamLembur * 50000;
            int totalGaji = gajiPokok + uangLembur;
            System.out.println(totalGaji);
        } else {
            int gajiPokok = 10000000;
            int uangLembur = jamLembur * 75000;
            int totalGaji = gajiPokok + uangLembur;
            System.out.println(totalGaji);
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
