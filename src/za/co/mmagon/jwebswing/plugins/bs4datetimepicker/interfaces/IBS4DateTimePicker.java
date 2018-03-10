package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.BS4DateTimePicker;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.BS4DateTimePickerOptions;

import javax.validation.constraints.NotNull;

public interface IBS4DateTimePicker<J extends BS4DateTimePicker<J>>
		extends ICssStructure<J>
{
	/**
	 * Sets to display as Date only (sets format to L)
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setDateOnly();

	BS4DateTimePickerOptions<?> getOptions();

	/**
	 * Sets to display as time only (sets format to LT)
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setTimeOnly();

	/**
	 * Sets the no icon
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setNoIcon();

	@NotNull
	@SuppressWarnings("unchecked")
	J setClickOnInput();
}
