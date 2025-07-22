package com.ninfinity.Autowiring.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/Autowiring/spel/config.xml");

		TestExpression te = context.getBean("sp1",TestExpression.class);
		System.out.println(te);
		System.out.println(te.getMyName().length());
		
		ExpressionParser ep = new SpelExpressionParser();
		 org.springframework.expression.Expression ex = ep.parseExpression("11+22");
		System.out.println(ex.getValue());
		
	}
}
