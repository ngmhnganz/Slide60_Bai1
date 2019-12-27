package Lop1k.com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Lop1k.com.model.SinhVien;
public class Main 
{
	static ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>() {};
	static void Menu() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số chức năng bạn muốn.");
		System.out.println("1. Thêm sinh viên. ");
		System.out.println("2. Xuất danh sách sinh viên. ");
		System.out.println("3. Sửa sinh viên. ");
		System.out.println("4. Xoá sinh viên chứa tên bất kỳ. ");
		System.out.println("5. Xoá sinh viên chứa tên An. ");
		System.out.println("6. Sắp xếp sinh viên. ");
		System.out.println("7. Xuất ra số lượng sinh viên. ");
		String pick = sc.nextLine();
		switch (pick) {
		case "1":
			themSinhVien();
			break;
		case "2":
			xuatSinhVien();
			break;
		case "3":
			suaSinhVien();
			break;
		case "4":
			xoaSinhVienBatKy();
			break;
		case "5":
			xoaSinhVienAn();
			break;
		case "6":
			sapXepSinhVien();
			break;	
		case "7":
			xuatSoLuongSinhVien();
			break;
		}
	}
	private static void sapXepSinhVien() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn cách sắp xếp bạn muốn: ");
		System.out.println("1. Từ A - Z.");
		System.out.println("2. Từ Z - A.");
		int pick = sc.nextInt();
		switch (pick) 
		{
		case 1:
			System.out.print('\u000C');
			dsSinhVien.sort(SinhVien.tenAZComparator);
			for (int i=0; i<dsSinhVien.size();i++) 
			{
				System.out.println(dsSinhVien.get(i));
			}
			break ;
		case 2:
			System.out.print('\u000C');
			dsSinhVien.sort(SinhVien.tenZAComparator);
			for (int i=0; i<dsSinhVien.size();i++) 
			{
				System.out.println(dsSinhVien.get(i));
			}
			break ;
		}
	}
	private static void xuatSoLuongSinhVien() 
	{
		System.out.print('\u000C');
		System.out.println("Số lượng sinh viên là: ");
		System.out.print(dsSinhVien.size());
	}
	private static void xoaSinhVienAn() 
	{
		for (int i=0; i<dsSinhVien.size();i++) 
		{
			SinhVien sinhVien= new SinhVien();
			sinhVien=dsSinhVien.get(i);
			if (sinhVien.getTen().contains("An")) 
			{
				dsSinhVien.remove(i);
			}
		}
	}
	private static void xoaSinhVienBatKy() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Đây là danh sách sinh viên. Hãy chọn stt sinh viên bạn muốn xoá.");
		for (int i=0; i<dsSinhVien.size();i++) 
		{
			System.out.println(dsSinhVien.get(i));
		}
		System.out.print("Thứ tự bạn muốn xoá là: "); int pick = sc.nextInt();
		dsSinhVien.remove(pick-1);
	}
	private static void suaSinhVien()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Đây là danh sách sinh viên. Hãy chọn stt sinh viên bạn muốn sửa.");
		for (int i=0; i<dsSinhVien.size();i++) 
		{
			System.out.println(dsSinhVien.get(i));
		}
		System.out.print("Thứ tự bạn muốn sửa là: "); int pick = sc.nextInt();
		System.out.println("Nhập nội dung bạn muốn sửa: ");
		String thayDoi = new Scanner(System.in).nextLine();
		SinhVien sinhVien= new SinhVien();
		sinhVien.setStt(pick);
		sinhVien.setTen(thayDoi);
		dsSinhVien.set(pick-1, sinhVien);
	}
	private static void xuatSinhVien() 
	{
		System.out.print('\u000C');
		System.out.println("Đây là danh sách sinh viên.");
		for (int i=0; i<dsSinhVien.size();i++) 
		{
			System.out.println(dsSinhVien.get(i));
		}
	}
	private static void themSinhVien() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập tên sinh viên.");
		String ten= sc.nextLine();
		SinhVien sinhVien= new SinhVien();
		sinhVien.setStt(dsSinhVien.size()+1);
		sinhVien.setTen(ten);
		dsSinhVien.add(sinhVien);
		System.out.print('\u000C');
		System.out.println("Đã thêm.");
	}
	public static void main(String[] args)
	{
			do {
				Menu();
			} while (true);
	}
}
