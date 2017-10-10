package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BS4DateTimeToolbarPlacements
{
	Default,
	Top,
	Bottom;
	
	@Override
	@JsonValue
	public String toString()
	{
		return name().toLowerCase();
	}
}
