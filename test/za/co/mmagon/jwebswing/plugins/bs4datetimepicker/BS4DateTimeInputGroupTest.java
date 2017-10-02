package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;

class BS4DateTimeInputGroupTest extends BaseTestClass
{
	@Test
	void bind()
	{
		BS4DateTimeInputGroup inputGroup = new BS4DateTimeInputGroup("bind.me");
		System.out.println(inputGroup.toString(0));
		
	}
	
	@Test
	void testJavascript()
	{
		BS4DateTimeInputGroup inputGroup = new BS4DateTimeInputGroup("bind.me");
		System.out.println(inputGroup.renderJavascript());
		
	}
}
