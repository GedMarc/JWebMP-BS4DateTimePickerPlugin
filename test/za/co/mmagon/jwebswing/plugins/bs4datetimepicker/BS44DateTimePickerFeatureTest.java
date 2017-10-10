package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;

class BS44DateTimePickerFeatureTest extends BaseTestClass
{
	@Test
	void getOptions()
	{
		BS44DateTimePickerFeature f = new BS44DateTimePickerFeature(new BS4DateTimeInput());
		f.getOptions().setFormat("stuff");
		System.out.println(f.renderJavascript());
		
		
		BS4DateTimeInput input = new BS4DateTimeInput();
		input.getOptions().setFormat("F");
		
		System.out.println(input.renderJavascript());
	}
	
}
