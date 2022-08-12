package com.qa.fb.keyword.login;

import org.testng.annotations.Test;

import com.qa.fb.keyword.engine.KeywordEngine;

public class LoginTest {
public KeywordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeywordEngine();
		keyWordEngine.startExecution("signup");
	}
}
