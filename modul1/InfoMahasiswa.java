/*
 * Copyright (C) 2022 xyzuan ( Jody Yuantoro )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Scanner;

class Mahasiswa {
    
    Scanner daftar_mhs = new Scanner(System.in);

    private String nama_mhs;
    private String nim_mhs;
    private String pass_mhs;

    public String getNama(){ return nama_mhs; }

    public void setNama(String nama_mhs){ this.nama_mhs = nama_mhs; }

    public String getNIM(){ return nim_mhs; }

    public void setNIM(String nim_mhs){
        if (nim_mhs.length() != 15){
            System.out.print("Nim harus berjumlah 15 angka\nNIM : ");
            nim_mhs = daftar_mhs.next(); setNIM(nim_mhs);
        } else {
            this.nim_mhs = nim_mhs;
        }
    }

    public void setPassword(String pass_mhs){
        if (pass_mhs.length() < 8){
            System.out.print("Password minimal 8 karakter\nPassword : ");
            pass_mhs = daftar_mhs.next(); setPassword(pass_mhs);
        } else {
            this.pass_mhs = pass_mhs;
        }
    }

    public String getPassword(){
        return pass_mhs;
    }

    public void daftar(){
        System.out.println("===Daftar===");
        System.out.print("Nama : ");
        nama_mhs = daftar_mhs.nextLine(); setNama(nama_mhs);

        System.out.print("NIM : ");
        nim_mhs = daftar_mhs.next(); setNIM(nim_mhs);

        System.out.print("Password : ");
        pass_mhs = daftar_mhs.next(); setPassword(pass_mhs);

        daftar_mhs.close();
    }

    public void info(){
        System.out.println("\nSelamat " + getNama() + " Anda berhasil daftar\n");
        System.out.println("Berikut username dan password anda :");
        System.out.println("Username : " + getNIM());
        System.out.println("Password : " + getPassword());
    }
}

public class InfoMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.daftar();
        mhs.info();
    }
}
