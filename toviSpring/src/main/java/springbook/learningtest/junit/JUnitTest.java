package springbook.learningtest.junit;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@SuppressWarnings("deprecation")
public class JUnitTest {
	
	@Autowired ApplicationContext context;
	
	static Set<JUnitTest> testObject = new HashSet<JUnitTest>();
	static ApplicationContext contextObject = null;
	
	@Test 
	public void test1() {
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
		assertThat(contextObject == null || contextObject == this.context, is(true));
		contextObject = this.context;
	}
	
	@Test 
	public void test2() {
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
		
		assertTrue(contextObject == null || contextObject == this.context);
		contextObject = this.context;
	}
	
	@Test 
	public void test3() {
		assertThat(testObject, not(hasItem(this)));
		testObject.add(this);
		
		assertThat(contextObject, 
				either(is(nullValue())).or(is(this.context)));
		contextObject = this.context;
	}
}
