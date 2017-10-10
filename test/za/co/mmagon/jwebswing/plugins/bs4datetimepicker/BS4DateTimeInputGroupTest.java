package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.BS4DateTimeViewModes;

import java.time.LocalDate;

class BS4DateTimeInputGroupTest extends BaseTestClass
{
	@Test
	void getCalendarSelectSpan()
	{
	}
	
	@Test
	void bind()
	{
		BS4DateTimeInputGroup inputGroup = new BS4DateTimeInputGroup("bind.me");
		BS4DateTimeInput ip = new BS4DateTimeInput();
		ip.getOptions().setFormat("asdf");
		inputGroup.setInput(ip);
		inputGroup.getOptions().setFormat("Format");
		System.out.println(inputGroup.toString(0));
		
	}
	
	@Test
	void testJavascript()
	{
		BS4DateTimeInputGroup inputGroup = new BS4DateTimeInputGroup("bind.me");
		inputGroup.getOptions().setFormat("Format");
		System.out.println(inputGroup.renderJavascript());
		
	}
	
	@Test
	void testMe()
	{
		BS4DateTimeInputGroup birthdaypicker = new BS4DateTimeInputGroup("subscribe.birthDate");
		birthdaypicker.getOptions().setFormat("YYYY-MM-dd");
		birthdaypicker.getOptions().setMaxDate(LocalDate.now().minusYears(18l));
		birthdaypicker.getOptions().setViewMode(BS4DateTimeViewModes.Years);
		birthdaypicker.setRequired(true);
		birthdaypicker.getInput().setPlaceholder("Birth Date");
		birthdaypicker.bind("subscribe.birthDate");
		System.out.println(birthdaypicker.renderJavascript());
		
		
		BSFormGroup birthDayGroup = new BSFormGroup();
		birthDayGroup.setInputComponent(birthdaypicker.getInput());
		birthDayGroup.setAngularValidation(true);
		birthDayGroup.setShowControlFeedback(true);
		
		System.out.println(birthDayGroup.renderJavascript());
	}
	
}
