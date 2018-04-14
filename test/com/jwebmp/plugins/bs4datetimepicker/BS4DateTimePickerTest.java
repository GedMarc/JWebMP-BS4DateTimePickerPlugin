package com.jwebmp.plugins.bs4datetimepicker;

import com.jwebmp.BaseTestClass;
import com.jwebmp.plugins.bootstrap4.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bs4datetimepicker.options.BS4DateTimeViewModes;
import org.junit.jupiter.api.Test;

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
		BS4DateTimePicker inputGroup = new BS4DateTimePicker();
		inputGroup.getOptions()
		          .setFormat("asdf");
		inputGroup.getOptions()
		          .setFormat("Format");
		System.out.println(inputGroup.toString(0));

	}

	@Test
	public void testJavascript()
	{
		BS4DateTimePicker inputGroup = new BS4DateTimePicker();
		inputGroup.getOptions()
		          .setFormat("Format");
		System.out.println(inputGroup.renderJavascript());
	}

	@Test
	public void testMe()
	{
		BS4DateTimePicker birthdaypicker = new BS4DateTimePicker();
		birthdaypicker.setID("test");
		birthdaypicker.getOptions()
		              .setFormat("YYYY-MM-dd");
		birthdaypicker.getOptions()
		              .setMaxDate(LocalDate.now()
		                                   .minusYears(18l));
		birthdaypicker.getOptions()
		              .setViewMode(BS4DateTimeViewModes.Years);

		birthdaypicker.getInput()
		              .setPlaceholder("Birth Date");

		birthdaypicker.bind("subscribe.birthDate");

		System.out.println(birthdaypicker.toString(0));
		System.out.println(birthdaypicker.renderJavascript());


		BSFormGroup birthDayGroup = new BSFormGroup();
		System.out.println(birthDayGroup.renderJavascript());
	}

	@Test
	public void testNoButton()
	{
		BS4DateTimePicker inputGroup = new BS4DateTimePicker();
		inputGroup.setID("testNoButton");
		inputGroup.setNoIcon();
		System.out.println(inputGroup.toString(0));
	}

	@Test
	public void testLink()
	{
		BS4DateTimePicker inputGroup = new BS4DateTimePicker();
		BS4DateTimePicker inputGroupMax = new BS4DateTimePicker();
		BS4DateTimePicker.linkPickers(inputGroup, inputGroupMax);
		System.out.println(inputGroup.toString(0));
		System.out.println(inputGroup.renderJavascript());
	}
}
