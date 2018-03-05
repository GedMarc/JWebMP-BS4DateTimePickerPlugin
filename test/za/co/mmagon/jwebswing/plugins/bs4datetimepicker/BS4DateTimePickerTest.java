package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.BS4DateTimeViewModes;

import java.time.LocalDate;

public class BS4DateTimePickerTest
		extends BaseTestClass
{
	@Test
	public void getCalendarSelectSpan()
	{
	}

	@Test
	public void bind()
	{
		BS4DateTimePicker inputGroup = new BS4DateTimePicker("bind.me");
		BS4DateTimePickerInput ip = new BS4DateTimePickerInput();
		ip.getOptions()
		  .setFormat("asdf");
		inputGroup.getOptions()
		          .setFormat("Format");
		System.out.println(inputGroup.toString(0));

	}

	@Test
	public void testJavascript()
	{
		BS4DateTimePicker inputGroup = new BS4DateTimePicker("bind.me");
		inputGroup.getOptions()
		          .setFormat("Format");
		System.out.println(inputGroup.renderJavascript());

	}

	@Test
	public void testMe()
	{
		BS4DateTimePicker birthdaypicker = new BS4DateTimePicker("subscribe.birthDate");
		birthdaypicker.getOptions()
		              .setFormat("YYYY-MM-dd");
		birthdaypicker.getOptions()
		              .setMaxDate(LocalDate.now()
		                                   .minusYears(18l));
		birthdaypicker.getOptions()
		              .setViewMode(BS4DateTimeViewModes.Years);
		birthdaypicker.setRequired(true);
		birthdaypicker.getInput()
		              .setPlaceholder("Birth Date");
		birthdaypicker.bind("subscribe.birthDate");

		System.out.println(birthdaypicker.toString(0));
		System.out.println(birthdaypicker.renderJavascript());


		BSFormGroup birthDayGroup = new BSFormGroup();
		System.out.println(birthDayGroup.renderJavascript());
	}

}
