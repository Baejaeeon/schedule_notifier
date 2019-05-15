package com.osc.notifier.test;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;

public class EncryptTest {

	@Test
	public void test() {
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("osc");
         
        String url = "jdbc url here";
        String username = "username here";
        String password = "password here";
        String email =  "email address here";
        String mailPw = "email password here";
        
        System.out.println("before  URL :: " + url + " | after URL :: " + pbeEnc.encrypt(url));
        System.out.println("before  username :: " + username + " | after username :: " + pbeEnc.encrypt(username));
        System.out.println("before  password :: " + password + " | after password :: " + pbeEnc.encrypt(password));
        System.out.println("before  email :: " + email + " | after email :: " + pbeEnc.encrypt(email));
        System.out.println("before  emailPw :: " + mailPw + " | after emailPw :: " + pbeEnc.encrypt(mailPw));
	}
}
