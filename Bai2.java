/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        // Khai báo mảng để lưu danh sách tên sinh viên
        String[] danhSach = new String[N];

        // Nhập danh sách tên sinh viên
        System.out.println("Nhập danh sách tên sinh viên:");
        for (int i = 0; i < N; i++) {
            System.out.print("Tên sinh viên " + (i + 1) + ": ");
            danhSach[i] = scanner.nextLine();
        }

        // Sắp xếp danh sách theo thứ tự từ z đến a
        Arrays.sort(danhSach, Collections.reverseOrder());

        // In ra danh sách đã sắp xếp
        System.out.println("\nDanh sách tên sinh viên sau khi sắp xếp:");
        for (int i = 0; i < N; i++) {
            System.out.println(danhSach[i]);
        }

        // Nhập tên cần tìm kiếm
        System.out.print("\nNhập tên cần tìm kiếm: ");
        String tenCanTim = scanner.nextLine();

        // Tìm kiếm và in ra vị trí của tên trong danh sách
        int viTri = Arrays.binarySearch(danhSach, tenCanTim, Collections.reverseOrder());
        if (viTri >= 0) {
            System.out.println("Tên được tìm thấy ở vị trí " + (viTri + 1) + " trong danh sách.");
        } else {
            System.out.println("NO");
        }
    }
}// TODO code application logic here
    
   
