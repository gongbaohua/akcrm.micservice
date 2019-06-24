package com.avatech.edi.akcrm.service.Config;

public class ServiceException extends BaseException {
    private String code;

    private String message;

    public ServiceException() {
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ServiceException(String message){
        super();
        this.message = message;
    }

    public ServiceException(String code,String message){
        super();
        this.code = code;
        this.message = message;
    }

}
