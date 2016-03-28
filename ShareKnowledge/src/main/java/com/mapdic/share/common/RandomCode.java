package com.mapdic.share.common;

import java.util.Random;

/**
 * Created by liuyong on 2016/3/28.
 */
public class RandomCode {
    /**
     * 随机产生几位数字：例：maxLength=3,则结果可能是 012
     */
    public static final int produceNumber(int maxLength){
        Random random = new Random();
        return random.nextInt(maxLength);
    }

    public static int produceRegionNumber(int minNumber,int maxNumber){
        return minNumber + produceNumber(maxNumber);
    }

    private static String doProduce(int maxLength, String source) {
        StringBuffer sb = new StringBuffer(100);
        for (int i = 0; i < maxLength; i++) {
            final int number =  produceNumber(source.length());
            sb.append(source.charAt(number));
        }
        return sb.toString();
    }

    /**
     * 随机产生几位字符串：例：maxLength=3,则结果可能是 aAz
     * @param maxLength 传入数必须是正数。
     */
    public static String produceString(int maxLength){
        String source = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return doProduce(maxLength, source);
    }
    public static void main(String[] args) {
        System.out.println(produceString(15));
    }
}
