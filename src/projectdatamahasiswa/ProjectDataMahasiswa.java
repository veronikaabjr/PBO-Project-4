/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatamahasiswa;


import java.util.Scanner;
/**
 *
 * @author User
 */
public class ProjectDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
       int pilihMenu;
        dataMahasiswa d1 = new dataMahasiswa();
        boolean menu;
        
        while (true){
            System.out.println("~~~~~ | DATABASE MAHASISWA | ~~~~~\n");
            System.out.println("Menu :");
            System.out.println("      1. Tambah Data");
            System.out.println("      2. Hapus Data");
            System.out.println("      3. Cari Data");
            System.out.println("      4. Tampilkan Semua Data");
            System.out.println("      5. Exit");
            System.out.print("Pilih Menu : ");
            pilihMenu = data.nextInt();    
            switch (pilihMenu){
                case 1 :
                    d1.tambahData();
                    break;

                case 2 :
                    d1.hapusData();
                    break;

                case 3 :
                    d1.cariData();
                    break;

                case 4 :
                    d1.semuaData();
                    break;

                case 5 :
                    menu = false;
                    System.out.println("Terimakasih !");
                    break;

                default :
                    System.out.println("Silahkan Pilih Menu yang Tersedia!");

            }
        }
    }
}

