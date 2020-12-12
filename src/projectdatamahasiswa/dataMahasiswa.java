/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatamahasiswa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;



/**
 *
 * @author User
 */
public class dataMahasiswa {
    
    Scanner input = new Scanner(System.in);
    ArrayList<String> nimMhs = new ArrayList<>();
    ArrayList<String> namaMhs = new ArrayList<>();
    ArrayList<Date> tglLahirMhs = new ArrayList<>();
    ArrayList<Integer> genderMhs = new ArrayList<>();
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    
    void tambahData(){
        String nim;
        String nama;
        String tgl;
        int gender;
        int hari,bulan,tahun;
        char tambahlagi;
        
        do{
            System.out.printf("~~~~~ | TAMBAH DATA MAHASISWA | ~~~~~\n");
            System.out.print("NIM                   : ");
                nim = input.nextLine();
                nimMhs.add(nim);
            System.out.print("Nama                  : ");
                nama = input.next();
                namaMhs.add(nama);
            System.out.println("Tanggal Lahir");
            System.out.print("          Tanggal     : ");
                hari = input.nextInt();
            System.out.print("          Bulan       : ");
                bulan = input.nextInt();
            System.out.print("          Tahun       : ");    
                tahun = input.nextInt();             
                
            Date tanggal = new GregorianCalendar(tahun, bulan, hari).getTime();
                tglLahirMhs.add(tanggal);
            System.out.print("Gender (0:LK ; 1:PR)  : ");
                gender = input.nextInt();
                genderMhs.add(gender);
                      
            System.out.print("\nIngin tambah data lagi? (y/n) : ");
            tambahlagi = input.next().charAt(0);
            input.nextLine();
                        
        } while (tambahlagi != 'n');
    }
    
    void hapusData(){
        char hapuslagi;
        
        do{
            System.out.println("~~~~~ | HAPUS DATA MAHASISWA | ~~~~~");
            if(nimMhs.size() <= 0){
                System.out.println("DATA TIDAK TERSEDIA !");
            }                
            else{
                System.out.print("NIM           :");
                String hapus = input.nextLine();
                input.nextLine();
                int a = nimMhs.indexOf(hapus);                
                nimMhs.remove(a);
                namaMhs.remove(a);
                tglLahirMhs.remove(a);
                genderMhs.remove(a);
                System.out.println("Data berhasil dihapus!");
            }
            
            System.out.println("Ingin hapus data lagi? (y/n) : ");
            hapuslagi = input.next().charAt(0);
            input.nextLine();
        } while(hapuslagi != 'n');
    }
    
    void cariData(){      
        System.out.println("~~~~~ | MENCARI DATA MAHASISWA | ~~~~~");
        System.out.println("1. Cari Berdasarkan NIM");
        System.out.println("2. Cari berdasarkan Gender");
        System.out.print("Pilih Cara : ");
        int temukan = input.nextInt();
        input.nextLine();
            switch (temukan) {
                case 1:
                    System.out.println("Masukkan NIM    :");
                    String cari = input.nextLine();
                    if(nimMhs.contains(cari)){
                        int b = nimMhs.indexOf(cari);
                        String ultah = formatDate.format(tglLahirMhs.get(b));
                        String gender1 = (genderMhs.get(b) == 0) ? "Laki-Laki" : "Perempuan";
                        
                        System.out.println("\n~~~~~ | HASIL PENCARIAN | ~~~~~");
                        System.out.println("NIM             : " + nimMhs.get(b));
                        System.out.println("Nama            : " + namaMhs.get(b));
                        System.out.println("Tanggal Lahir   : " + ultah);
                        System.out.println("Gender          : " + gender1);
                    }
                    else{
                        System.out.println("DATA TIDAK DITEMUKAN!");
                       
                    } break;
                case 2:
                    System.out.println("Pilih Gender    :");
                    int cari2 = input.nextInt();
                    for(int n = 0; n < genderMhs.size(); n++){
                        if(genderMhs.get(n) == cari2){
                            String ultah = formatDate.format(tglLahirMhs.get(n));
                            String gender1 = (genderMhs.get(n) == 0) ? "Laki-Laki" : "Perempuan";
                            
                            System.out.println("\n~~~~~ | HASIL PENCARIAN | ~~~~~");
                            System.out.println("NIM             : " + this.nimMhs.get(n));
                            System.out.println("Nama            : " + this.namaMhs.get(n));
                            System.out.println("Tanggal Lahir   : " + ultah);
                            System.out.println("Gender          : " + gender1);
                        }
                        else{
                            System.out.println("DATA TIDAK DITEMUKAN!");
                        }
                    }break;
                default:
                    System.out.println("TIDAK DAPAT MELAKUKAN PeNCARIAN !");
                    break;
            }
    }          
        
  
    void semuaData(){
        if(nimMhs.size() <= 0){
            System.out.println("DATABASE KOSONG!");
        }
        else{
            for(int n = 0; n < nimMhs.size(); n++){
                String ultah = formatDate.format(tglLahirMhs.get(n));
                String gender1 = (genderMhs.get(n) == 0) ? "Laki-Laki" : "Perempuan";
                
                System.out.println("~~~~~ | DATABASE MAHASISWA | ~~~~~");
             
                System.out.println("  ~~~ | Mahasiswa ke " + (n+1) + " |~~~");
                System.out.println("NIM            : " + nimMhs.get(n));
                System.out.println("Nama           : " + namaMhs.get(n));
                System.out.println("Tanggal Lahir  : " + ultah);
                System.out.println("Gender         : " + gender1);
            }
            System.out.println("\nTOTAL DATA MAHASISWA : " + nimMhs.size()+ "\n");
        }
        }
    }
    

