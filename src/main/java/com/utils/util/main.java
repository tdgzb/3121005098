package com.utils.util;


/**
 * @Description:
 * @DATE: 2023/9/16  21:31
 * @Author: 2257736387@qq.com
 * @Version: 1.0
 */
public class main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        String[] str = new String[6];
        str[0] = TxtIOUtils.readTxt(args[0]);
        str[1] = TxtIOUtils.readTxt(args[1]);
        String ansFileName = args[2];
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[1]));
        TxtIOUtils.writeTxt(ans, ansFileName);

    }


}
