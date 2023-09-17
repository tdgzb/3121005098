package com.utils.util;

/**
 * @Description:
 * @DATE: 2023/9/16  23:52
 * @Author: 2257736387@qq.com
 * @Version: 1.0
 */

public class ShortStringException extends Exception {

    public ShortStringException() {
        super();
    }

    public ShortStringException(String message) {
        super(message);
    }

    public ShortStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShortStringException(Throwable cause) {
        super(cause);
    }

}

