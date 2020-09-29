package com.artisan.result;
import lombok.Getter;

/**
 * @author 小工匠
 * @version 1.0
 * @description: TODO
 * @date 2020/9/29 21:38
 * @mark: show me the code , change the world
 */

public class CodeMsg {

    private int code;
    private String msg;

    // 通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(-1, "服务端异常");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}


}