package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.BS4DateTimeViewModes;

import java.time.LocalDate;

public class BS4DateTimePickerGroupTest extends BaseTestClass
{
	@Test
	public void getCalendarSelectSpan()
	{
	}

	@Test
	public void bind()
	{
		BS4DateTimePickerInputGroup inputGroup = new BS4DateTimePickerInputGroup("bind.me");
		BS4DateTimePicker ip = new BS4DateTimePicker();
		ip.getOptions().setFormat("asdf");
		inputGroup.setInput(ip);
		inputGroup.getOptions().setFormat("Format");
		System.out.println(inputGroup.toString(0));

	}

	@Test
	public void testJavascript()
	{
		BS4DateTimePickerInputGroup inputGroup = new BS4DateTimePickerInputGroup("bind.me");
		inputGroup.getOptions().setFormat("Format");
		System.out.println(inputGroup.renderJavascript());

	}

	@Test
	public void testMe()
	{
		BS4DateTimePickerInputGroup birthdaypicker = new BS4DateTimePickerInputGroup("subscribe.birthDate");
		birthdaypicker.getOptions().setFormat("YYYY-MM-dd");
		birthdaypicker.getOptions().setMaxDate(LocalDate.now().minusYears(18l));
		birthdaypicker.getOptions().setViewMode(BS4DateTimeViewModes.Years);
		birthdaypicker.setRequired(true);
		birthdaypicker.getInput().setPlaceholder("Birth Date");
		birthdaypicker.bind("subscribe.birthDate");

		System.out.println(birthdaypicker.toString(0));
		System.out.println(birthdaypicker.renderJavascript());


		BSFormGroup birthDayGroup = new BSFormGroup();
		birthDayGroup.setInputComponent(birthdaypicker.getInput());
		birthDayGroup.setAngularValidation(true);
		birthDayGroup.setShowControlFeedback(true);

		System.out.println(birthDayGroup.renderJavascript());
	}

}
