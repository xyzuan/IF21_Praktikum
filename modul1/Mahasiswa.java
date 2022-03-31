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

    private String nama_mhs, nim_mhs, pass_mhs;

    Scanner inputData = new Scanner(System.in);

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.daftar();
        System.out.println("\nSelamat " + mhs.getNama() + " Anda berhasil daftar\n");
        System.out.println("Berikut username dan password anda :");
        System.out.println("Username : " + mhs.getNIM());
        System.out.println("Password : " + mhs.getPassword());
    }

    public String getNama(){
        return nama_mhs;
    }

    public void setNama( String params ){
        this.nama_mhs = params;
    }

    public String getNIM(){
        return nim_mhs;
    }

    public void setNIM( String params ){
        this.nim_mhs = params;
    }

    public String getPassword(){
        return pass_mhs;
    }

    public void setPassword(String params){
        this.pass_mhs = params;
    }

    public void daftar(){
        System.out.println("===Daftar===");
        System.out.print("Nama : ");
        setNama(inputData.nextLine());

        do {
            System.out.print("NIM : ");
            setNIM(inputData.nextLine());
            if (getNIM().length() != 15) {
                System.out.println("Nim harus berjumlah 15 angka");
            }
        } while (getNIM().length() != 15);

        do {
            System.out.print("Password : ");
            setPassword(inputData.nextLine());
            if (getPassword().length() < 8) {
                System.out.println("Password minimal 8 karakter");
            }
        } while (getPassword().length() < 8);
    }
}