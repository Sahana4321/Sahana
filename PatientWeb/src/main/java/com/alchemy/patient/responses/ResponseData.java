package com.alchemy.patient.responses;

public class ResponseData {
    private Integer statusCode;
    private Object data;
    private String message;
    public ResponseData(int i, Object object, String string) {
    }
    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "ResponseData [data=" + data + ", message=" + message + ", statusCode=" + statusCode + "]";
    }
    
}
