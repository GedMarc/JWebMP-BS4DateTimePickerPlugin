package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;

public class BS44DateTimePickerFeatureTest extends BaseTestClass
{
	@Test
	public void getOptions()
	{
		BS44DateTimePickerFeature f = new BS44DateTimePickerFeature(new BS4DateTimePickerInput());
		f.getOptions().setFormat("stuff");
		System.out.println(f.renderJavascript());

		BS4DateTimePickerInput input = new BS4DateTimePickerInput();
		input.getOptions().setFormat("F");

		System.out.println(input.renderJavascript());
	}

}
