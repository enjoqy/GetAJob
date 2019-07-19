package org.junhi.test;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * @author junhi
 * @date 2019/7/18 21:37
 */
public class DecodeTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String a = "I Love You!";

        Charset charset = Charset.forName("UTF-8");
        Charset charset2 = Charset.forName("unicode");
        ByteBuffer encode = charset.encode(a);
        System.out.println(encode);


    }

}
