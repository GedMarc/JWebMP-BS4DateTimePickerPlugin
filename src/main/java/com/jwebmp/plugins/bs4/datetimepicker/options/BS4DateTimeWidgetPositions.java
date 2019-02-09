package com.jwebmp.plugins.bs4.datetimepicker.options;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BS4DateTimeWidgetPositions
{
	auto,
	left,
	right,
	top,
	bottom;

	@Override
	@JsonValue
	public String toString()
	{
		return name().toLowerCase();
	}
}
