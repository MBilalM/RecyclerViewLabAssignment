package com.muhammadbilal.receclerview_191073.ModelInfo;

public class PersonInfo {
    String name,PC,GEND,age,XP;
    int imgAdd;

    public PersonInfo() {

    }

    public PersonInfo(int image,String name, String contact,String AGE,String exp,String sex ) {
        this.imgAdd=image;
        this.name = name;
        this.PC = contact;
        this.age=AGE;
        this.XP=exp;
        this.GEND=sex;
    }
    public void setImgAdd(int address) {
        this.imgAdd = address;
    }
    public int getImgAdd() {
        return imgAdd;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setPC(String contact) {
        this.PC = contact;
    }
    public String getPC() {
        return PC;
    }


    public void setAge(String  year) {
        this.age = year;
    }
    public String getAge() {
        return age;
    }


    public void setXP(String exp) {
        this.XP = exp;
    }
    public String getXP() {
        return XP;
    }

    public void setGEND(String sex) {
        this.GEND = sex;
    }
    public String getGEND() {
        return GEND;
    }


}
