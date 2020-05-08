package com.xhb.service.util;

import java.io.Serializable;

public class RestUtil {

    private RestUtil(){}

    public static Rest error(){
        return new RestUtil.Rest(0, "err");
    }

    public static Rest success(){
        return new RestUtil.Rest();
    }

    public static <E> Rest<E> wrap(E data){
        return new RestUtil.Rest<E>(1, "ok", data);
    }


    public static class Rest<T> implements Serializable {
        private static final long serialVersionUID = 1L;
        private int code;
        private String msg;
        private T data;

        private Rest(){
            this.code = 1;
            this.msg = "ok";
        }

        private Rest(int code, String msg){
           this.code = code;
           this.msg = msg;
        }

        private Rest(int code, String msg, T data){
            this.code = code;
            this.data = data;
            this.msg = msg;
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        public T getData() {
            return data;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setData(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Rest{" +
                    "code=" + code +
                    ", msg='" + msg + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

}
