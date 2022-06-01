package com.shangma.common.axios;

public class AxiosReseult {
    private int status;
    private String message;
    private Object data;

    public AxiosReseult() {
    }
    public static <T> AxiosReseult setdata(AxiosStatus axiosStatus , T t)  {
        AxiosReseult axiosReseult = new AxiosReseult();
        axiosReseult.setStatus(axiosStatus.getStatus());
        axiosReseult.setMessage(axiosStatus.getMassage());
        axiosReseult.setData(t);
        return axiosReseult;
    }
    public static AxiosReseult success(){
        AxiosReseult setdata = AxiosReseult.setdata(AxiosStatus.OK, null);
        return setdata;
    }
    public static <T> AxiosReseult success(T t){
        return AxiosReseult.setdata(AxiosStatus.OK,t);
    }
    public static <T> AxiosReseult success(AxiosStatus axiosStatus,T t){
        return AxiosReseult.setdata(axiosStatus,t);
    }
    public static <T> AxiosReseult success(AxiosStatus axiosStatus){
        return AxiosReseult.setdata(axiosStatus,null);
    }
    public static AxiosReseult error(){
        return AxiosReseult.setdata(AxiosStatus.ERROGR,null);
    }
    public static AxiosReseult error(AxiosStatus axiosStatus){
        return AxiosReseult.setdata(axiosStatus,null);
    }
    public static <T>AxiosReseult error(AxiosStatus axiosStatus,T t){
        return AxiosReseult.setdata(axiosStatus,t);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
