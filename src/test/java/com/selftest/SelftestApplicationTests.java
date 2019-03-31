package com.selftest;

import org.junit.Test;

import com.selftest.demo.FizzBuzzGame;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SelftestApplicationTests {

	@Test
	public void playStage1() {
		FizzBuzzGame.playStage1();
	}

	
	@Test
	public void playStage2() {
		FizzBuzzGame.playStage2();
	}
}
