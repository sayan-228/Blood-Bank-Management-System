/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBMS.model;

/**
 *
 * @author Mr.Lucky
 */
public class Donor {
    private int donorId;
    private String name;
    private String fatherName;
    private String motherName;
    private String dateOfBirth;
    private String mobileNo;
    private String gender;
    private String email;
    private String bloodGroup;
    private String city;
    private String address;
    private String covidStatus;

    public Donor() {
    }

    public Donor(int donorId, String name, String fatherName, String motherName, String dateOfBirth, String mobileNo, String gender, String email, String bloodGroup, String city, String address, String covidStatus) {
        this.donorId = donorId;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.dateOfBirth = dateOfBirth;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.email = email;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.address = address;
        this.covidStatus = covidStatus;
    }

    public String getCovidStatus() {
        return covidStatus;
    }

    public void setCovidStatus(String covidStatus) {
        this.covidStatus = covidStatus;
    }

    @Override
    public String toString() {
        return "Donor{" + "donorId=" + donorId + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName + ", dateOfBirth=" + dateOfBirth + ", mobileNo=" + mobileNo + ", gender=" + gender + ", email=" + email + ", bloodGroup=" + bloodGroup + ", city=" + city + ", address=" + address + '}';
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
