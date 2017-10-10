package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Class names of the given items
 * @param <J>
 */
public class BS4DateTimeInputIcons<J extends BS4DateTimeInputIcons<J>> extends JavaScriptPart<J>
{
	
	private static final long serialVersionUID = 1L;
	private String time;
	private String date;
	private String up;
	private String down;
	private String previous;
	private String next;
	private String today;
	private String clear;
	private String close;
	
	public BS4DateTimeInputIcons()
	{
	}
	
	public String getTime()
	{
		return time;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getUp()
	{
		return up;
	}
	
	public void setUp(String up)
	{
		this.up = up;
	}
	
	public String getDown()
	{
		return down;
	}
	
	public void setDown(String down)
	{
		this.down = down;
	}
	
	public String getPrevious()
	{
		return previous;
	}
	
	public void setPrevious(String previous)
	{
		this.previous = previous;
	}
	
	public String getNext()
	{
		return next;
	}
	
	public void setNext(String next)
	{
		this.next = next;
	}
	
	public String getToday()
	{
		return today;
	}
	
	public void setToday(String today)
	{
		this.today = today;
	}
	
	public String getClear()
	{
		return clear;
	}
	
	public void setClear(String clear)
	{
		this.clear = clear;
	}
	
	public String getClose()
	{
		return close;
	}
	
	public void setClose(String close)
	{
		this.close = close;
	}
}
