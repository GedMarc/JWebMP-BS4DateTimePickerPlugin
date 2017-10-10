package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

public class BS4DateTimeButtonsOptions extends JavaScriptPart<BS4DateTimeButtonsOptions>
{
	private Boolean showToday;
	private Boolean showClear;
	private Boolean showClose;
	
	public BS4DateTimeButtonsOptions()
	{
	}
	
	public Boolean getShowToday()
	{
		return showToday;
	}
	
	public void setShowToday(Boolean showToday)
	{
		this.showToday = showToday;
	}
	
	public Boolean getShowClear()
	{
		return showClear;
	}
	
	public void setShowClear(Boolean showClear)
	{
		this.showClear = showClear;
	}
	
	public Boolean getShowClose()
	{
		return showClose;
	}
	
	public void setShowClose(Boolean showClose)
	{
		this.showClose = showClose;
	}
}
