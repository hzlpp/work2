package com.work.common;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result<T> {

    private Boolean success;

    private Integer code;

    private String message;

    private T data;

    /**
     * 把类构造方法私有
     */
    private Result() {
    }

    ;

    /**
     * 成功的静态方法
     *
     * @return
     */
    public static Result ok() {
        Result result = new Result();
        result.setSuccess(Boolean.TRUE);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getName());
        return result;
    }

    public static <T> Result<T> ok(T data) {
        Result result = new Result();
        result.setSuccess(Boolean.TRUE);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getName());
        result.setData(data);
        return result;
    }

    /**
     * 失败的静态方法
     *
     * @return
     */
    public static Result error(String msg,Integer code) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static <T> Result<T> buildResult(ResultCode resultCode, T data) {
        Boolean success = Boolean.FALSE;
        if (resultCode.equals(ResultCode.SUCCESS)) {
            success = Boolean.TRUE;
        }
        return new Result<T>(success, resultCode.getCode(), resultCode.getDesc(), data);
    }

}
