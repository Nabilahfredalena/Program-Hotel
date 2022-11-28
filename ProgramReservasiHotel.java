package program.reservasi.hotel;
import java.util.Scanner;
public class ProgramReservasiHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama_kamar=" ",nama_penginap,tanggal,jam,resepsionis,souvenir = " ";
        int jenis_kamar,lama,harga,harga_sewa,total,diskon,uang,bayar,kembalian;
        
        System.out.println("============================");
        System.out.println("Sistem Penghitung Sewa Hotel");
        System.out.println("Tanggal         : ");
        tanggal = input.nextLine();
        System.out.println("Jam             : ");
        jam = input.nextLine();
        System.out.println("Nama Penginap   : ");
        nama_penginap = input.nextLine();
        System.out.println("Resepsionis     : ");
        resepsionis = input.nextLine ();
        
        System.out.println("Jenis Kamar");
        System.out.println("1.Single Room");
        System.out.println("2.Twin Room");
        System.out.println("3.Double Room");
        System.out.println("4.Family Room");
        System.out.println("5.Meeting Room");
        jenis_kamar = input.nextInt();
        
        switch(jenis_kamar){
            case 1:
                nama_kamar = "Single Room";
                harga = 300000;
                souvenir = "-";
                break;
            case 2:
                nama_kamar = "Twin Room";
                harga = 500000;
                souvenir = "-";
                break;
            case 3:
                nama_kamar = "Double Room";
                harga = 700000;
                souvenir = "Selamat Anda Mendapat Souvenir Tas Kecil";
                break;
            case 4:
                nama_kamar = "Family Room";
                harga = 100000;
                souvenir = "Mendapat Tas Kecil";
                break;
            case 5:
                nama_kamar = "Meeting Room";
                harga = 1500000;   
                souvenir = "-";
                break;
            default:
                harga = 0;
             
                 
        }  
        System.out.print("Lama Menginap : ");
        lama = input.nextInt();
        
        harga_sewa = lama*harga;
        
        
            if (lama>3) {
               diskon = harga_sewa*5/100;
            }else if (lama>5){
                diskon = harga_sewa*10/100;
            }else if (lama>10){
                diskon = harga_sewa*20/100;
            }else
               diskon = 0;
        
            total = harga_sewa - diskon;

        System.out.println("====================================");
        System.out.println("    SISTEM PENGHITUNG SEWA HOTEL    ");
        System.out.println("====================================");
        System.out.println("Tanggal "+tanggal);
        System.out.println("Jam "+jam);
        System.out.println("Nama Penginap = "+nama_penginap);
        System.out.println("Nama Resepsionis = "+resepsionis);
        System.out.println("Jenis Kamar = "+nama_kamar);
        System.out.println("Total Harga = "+harga_sewa);
        System.out.println("Diskon = "+diskon);
        System.out.println("Total Sewa = "+total);
        System.out.println("Uang = ");
        bayar = input.nextInt();
        kembalian = bayar - total;
        System.out.println("Kembalian = "+kembalian);
        System.out.println("Souvenir = "+souvenir);
        System.out.println("=======================================");
    }
}
    
        
    
    

 