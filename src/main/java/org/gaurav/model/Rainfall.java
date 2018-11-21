package org.gaurav.model;

import java.io.Serializable;

public class Rainfall implements Serializable {

    private String subdivision;

    private Integer year;

    private Double january;

    private Double february;

    private Double march;

    private Double april;

    private Double may;

    private Double june;

    private Double july;

    private Double august;

    private Double september;

    private Double october;

    private Double november;

    private Double december;

    private Double annual;

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getJanuary() {
        return january;
    }

    public void setJanuary(Double january) {
        this.january = january;
    }

    public Double getFebruary() {
        return february;
    }

    public void setFebruary(Double february) {
        this.february = february;
    }

    public Double getMarch() {
        return march;
    }

    public void setMarch(Double march) {
        this.march = march;
    }

    public Double getApril() {
        return april;
    }

    public void setApril(Double april) {
        this.april = april;
    }

    public Double getMay() {
        return may;
    }

    public void setMay(Double may) {
        this.may = may;
    }

    public Double getJune() {
        return june;
    }

    public void setJune(Double june) {
        this.june = june;
    }

    public Double getJuly() {
        return july;
    }

    public void setJuly(Double july) {
        this.july = july;
    }

    public Double getAugust() {
        return august;
    }

    public void setAugust(Double august) {
        this.august = august;
    }

    public Double getSeptember() {
        return september;
    }

    public void setSeptember(Double september) {
        this.september = september;
    }

    public Double getOctober() {
        return october;
    }

    public void setOctober(Double october) {
        this.october = october;
    }

    public Double getNovember() {
        return november;
    }

    public void setNovember(Double november) {
        this.november = november;
    }

    public Double getDecember() {
        return december;
    }

    public void setDecember(Double december) {
        this.december = december;
    }

    public Double getAnnual() {
        return annual;
    }

    public void setAnnual(Double annual) {
        this.annual = annual;
    }

    @Override
    public String toString() {
        return "Rainfall{" +
                "subdivision='" + subdivision + '\'' +
                ", year=" + year +
                ", january=" + january +
                ", february=" + february +
                ", march=" + march +
                ", april=" + april +
                ", may=" + may +
                ", june=" + june +
                ", july=" + july +
                ", august=" + august +
                ", september=" + september +
                ", october=" + october +
                ", november=" + november +
                ", december=" + december +
                ", annual=" + annual +
                '}';
    }
}
