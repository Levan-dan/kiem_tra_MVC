package com.example.manage_employee.model;

public class Employee {
//    mã nhân viên, họ và tên, tuổi, vị trí công việc, phòng ban, và mức lương.

    private int maNhanVien;
    private String hoVaTen;
    private int tuoi;
    private String viTriCongViec;
    private String phongBan;
    private double mucLuong;

    public Employee(int maNhanVien, String hoVaTen, int tuoi, String viTriCongViec, String phongBan, double mucLuong) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.viTriCongViec = viTriCongViec;
        this.phongBan = phongBan;
        this.mucLuong = mucLuong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getViTriCongViec() {
        return viTriCongViec;
    }

    public void setViTriCongViec(String viTriCongViec) {
        this.viTriCongViec = viTriCongViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }
}
