package com.jwebmp.plugins.bs4datetimepicker;

import com.jwebmp.plugins.bs4.datetimepicker.options.BS4DateTimePickerOptions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BS4DateTimePickerInputOptionsTest

{
	@Test
	public void getDate()
	{
		BS4DateTimePickerOptions options = new BS4DateTimePickerOptions();
		options.setDate(LocalDate.now());
		options.setFormat("L");
		System.out.println(options);
	}

}
