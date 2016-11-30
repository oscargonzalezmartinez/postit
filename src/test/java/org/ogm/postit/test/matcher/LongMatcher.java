package org.ogm.postit.test.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class LongMatcher extends BaseMatcher<Long>{

	private Long value = null;
	public LongMatcher(Long value) {
		super();
		this.value = value;
	}

    public boolean matches(Object item) {
    	return ((Number)item).longValue() == value.longValue();
    }
    
	@Override
	public void describeTo(Description description) {
		// TODO Auto-generated method stub
		
	}


	public static LongMatcher isLong(Long longValue){
		return new LongMatcher(longValue);
	}
	

}
