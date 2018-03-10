package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

/**
 * The bootstrap 4 options for the date time button
 */
public class BS4DateTimeButtonsOptions<J extends BS4DateTimeButtonsOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Should show the today button
	 */
	private Boolean showToday;
	/**
	 * Should show the clear button
	 */
	private Boolean showClear;
	/**
	 * Should show the close button
	 */
	private Boolean showClose;

	/**
	 * Constructs a new options object
	 */
	public BS4DateTimeButtonsOptions()
	{
		//Nothing needed
	}

	/**
	 * If the show today button is there
	 *
	 * @return
	 */
	public Boolean getShowToday()
	{
		return showToday;
	}

	/**
	 * sets if the button should be showed
	 *
	 * @param showToday
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowToday(Boolean showToday)
	{
		this.showToday = showToday;
		return (J) this;
	}

	/**
	 * If the clear button should be shown
	 *
	 * @return
	 */
	public Boolean getShowClear()
	{
		return showClear;
	}

	/**
	 * If the clear button should be shown
	 *
	 * @param showClear
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowClear(Boolean showClear)
	{
		this.showClear = showClear;
		return (J) this;
	}

	/**
	 * If the close button should be shown
	 *
	 * @return
	 */
	public Boolean getShowClose()
	{
		return showClose;
	}

	/**
	 * If the close button should be shown
	 *
	 * @param showClose
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShowClose(Boolean showClose)
	{
		this.showClose = showClose;
		return (J) this;
	}
}
