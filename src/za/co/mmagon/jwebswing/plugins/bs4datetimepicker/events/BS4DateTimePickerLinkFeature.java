package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.events;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.BS4DateTimePicker;

/**
 * A client side feature for the date time picker
 */
public class BS4DateTimePickerLinkFeature
		extends Feature
{
	private final BS4DateTimePicker<?> dateTimePickerMin;
	private final BS4DateTimePicker dateTimePickerMax;

	/**
	 * A client side feature for the date time picker
	 */
	public BS4DateTimePickerLinkFeature(BS4DateTimePicker<?> dateTimePickerMin, BS4DateTimePicker dateTimePickerMax)
	{
		super("BS4DateTimePickerOnChangeFeature");
		this.dateTimePickerMin = dateTimePickerMin;
		this.dateTimePickerMax = dateTimePickerMax;
		dateTimePickerMax.getOptions()
		                 .setUseCurrent(false);
		setComponent(dateTimePickerMin);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		String minString = dateTimePickerMin.getJQueryID() + "on(\"change.datetimepicker\", function (e) {" + dateTimePickerMax
				                                                                                                      .getJQueryID() +
				                   "datetimepicker('minDate', e.date);" + "});";
		String maxString = dateTimePickerMax.getJQueryID() + "on(\"change.datetimepicker\", function (e) {" + dateTimePickerMin
				                                                                                                      .getJQueryID() +
				                   "datetimepicker('maxDate', e.date);" + "});";

		addQuery(minString);
		addQuery(maxString);
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
