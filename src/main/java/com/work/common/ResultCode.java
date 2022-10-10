package com.work.common;

public enum ResultCode {

    SUCCESS(20000, "SUCCESS", "成功"),
    ERROR(20001, "ERROR", "失败"),
    LOGINERROR(20002, "LOGINERROR", "用户名密码错误"),
    ACCESSERROR(20003, "ACCESSERROR", "权限不足"),
    REMOTEERROR(20004, "REMOTEERROR", "远程调用失败"),
    REPERROR(20005, "REPERROR", "重复操作"),
    NOPASSWORD(2005,"NOPASSWORD","用户名或者密码为空"),

    ;

    private Integer code;
    private String name;
    private String desc;

    ResultCode(Integer code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


