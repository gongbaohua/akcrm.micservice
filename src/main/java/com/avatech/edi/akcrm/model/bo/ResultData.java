package com.avatech.edi.akcrm.model.bo;

public class ResultData {
    private String code = "0";
    private String mes = "SUCCESS";
    private String des = "";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public ResultData(String code,String mes,String des){
        this.code = code;
        this.mes = mes;
        this.des = des;
    }
    public ResultData(){

    }
}
