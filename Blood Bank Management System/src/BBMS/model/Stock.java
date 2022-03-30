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
public class Stock {
    private String bloodGroup;
    private int units;

    public Stock() {
    }

    public Stock(String bloodGroup, int units) {
        this.bloodGroup = bloodGroup;
        this.units = units;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
}
