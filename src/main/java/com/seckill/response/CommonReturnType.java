package com.seckill.response;

public class CommonReturnType {
    //show the responding result "success" or "fail"
    private String status;

    //if status = success, return the Json data that the front end needs
    //if status = fail, use common error code format
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
