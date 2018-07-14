package com.jwebmp.plugins.bs4datetimepicker.options;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BS4DateTimeViewModes
{
	Decades,
	Years,
	Months,
	Days;

	@Override
	@JsonValue
	public String toString()
	{
		return name().toLowerCase();
	}
}
