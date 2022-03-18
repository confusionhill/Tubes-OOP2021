package com.company.rootFolder.model;

public class Stats {
    private double healthPoint;
    private double attackPoint;
    private double defensePoint;
    private double specialAttackPoint;
    private double specialDefensePoint;
    private double speedPoint;

    public Stats(
            double hp, double ap, double dp,
            double sap,double sdp, double sp
            ){
        this.attackPoint = ap;
        this.healthPoint = hp;
        this.defensePoint = dp;
        this.specialAttackPoint = sap;
        this.specialDefensePoint = sdp;
        this.speedPoint = sp;
    }

    public double getHP() {
        return this.healthPoint;
    }
    public double getAttackPoint() {
        return this.attackPoint;
    }
    public double getSpeedPoint() {
        return this.speedPoint;
    }
    public double getDefensePoint() {
        return this.defensePoint;
    }
    public double getSpecialAttackPoint() {
        return  this.specialAttackPoint;
    }
    public double getSpecialDefensePoint(){
        return this.specialDefensePoint;
    }

    public void decreaseHp(double value) {
        this.healthPoint -= value;
    }
}
