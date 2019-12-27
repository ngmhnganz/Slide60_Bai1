package Lop1k.com.model;

import java.util.Comparator;

public class SinhVien {
	private String ten;
	private int stt;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	@Override
	public String toString() {
		return stt + ". " + ten;
	}
	public SinhVien(String ten, int stt) {
		super();
		this.ten = ten;
		this.stt = stt;
	}
	public SinhVien() {
		super();
	}
	public static Comparator<SinhVien> tenAZComparator = new Comparator<SinhVien>()
	{
		public int compare(SinhVien sinhVien1, SinhVien sinhVien2) 
		{
		return (int) (sinhVien1.getTen().substring(sinhVien1.getTen().lastIndexOf(" ")+1).compareTo(sinhVien2.getTen().substring(sinhVien2.getTen().lastIndexOf(" ")+1)));
		}
	};
	public static Comparator<SinhVien> tenZAComparator = new Comparator<SinhVien>()
	{
		public int compare(SinhVien sinhVien1, SinhVien sinhVien2) 
		{
		return (int) (sinhVien2.getTen().substring(sinhVien2.getTen().lastIndexOf(" ")+1).compareTo(sinhVien1.getTen().substring(sinhVien1.getTen().lastIndexOf(" ")+1)));
		}
	};
}
