package com.rounakraj8.drools.payload;

import javax.validation.constraints.NotNull;

public class Input {

    @NotNull
    private String designation;
    @NotNull
    private int yearsOfExp;
    @NotNull
    private String qualification;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
