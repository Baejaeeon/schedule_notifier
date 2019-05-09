package com.osc.notifier.test;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Test;

public class EncryptTest {

	@Test
	public void test() {
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword("osc");
         
        String url = "jdbc:mysql://52.78.86.191:3306/OSCDB";
        String username = "root";
        String password = "root";
        
        System.out.println("before  URL :: " + url + " | after URL :: " + pbeEnc.encrypt(url));
        System.out.println("before  username :: " + username + " | after username :: " + pbeEnc.encrypt(username));
        System.out.println("before  password :: " + password + " | after password :: " + pbeEnc.encrypt(password));
	}
}
