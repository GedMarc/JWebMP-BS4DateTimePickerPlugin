package za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Class names of the given items
 * @param <J>
 */
public class BS4DateTimeInputIcons<J extends BS4DateTimeInputIcons<J>> extends JavaScriptPart<J>
{
	
	private static final long serialVersionUID = 1L;
	/**
	 * The time
	 */
	private String time;
	/**
	 * The date
	 */
	private String date;
	/**
	 * Up class
	 */
	private String up;
	/**
	 * Down class
	 */
	private String down;
	/**
	 * Previous class
	 */
	private String previous;
	/**
	 * Next Class
	 */
	private String next;
	/**
	 * Today Class
	 */
	private String today;
	/**
	 * Clear Class
	 */
	private String clear;
	/**
	 * Close Class
	 */
	private String close;

	/**
	 * Construct a new input options
	 */
	public BS4DateTimeInputIcons()
	{
		//The Date Time input Options
	}

	/**
	 * The icon class for time
	 * @return
	 */
	public String getTime()
	{
		return time;
	}

	/**
	 * Sets the icon class for time
	 *
	 * @param time
	 *
	 * @return
	 */
	public J setTime(String time)
	{
		this.time = time;
		return (J) this;
	}

	/**
	 * Sets the icon for date
	 * @return
	 */
	public String getDate()
	{
		return date;
	}

	/**
	 * Sets the icon for date
	 * @param date
	 * @return
	 */
	public J setDate(String date)
	{
		this.date = date;
		return (J) this;
	}

	/**
	 * Sets the icon for up
	 * @return
	 */
	public String getUp()
	{
		return up;
	}

	/**
	 * Sets the icon for up
	 * @param up
	 * @return
	 */
	public J setUp(String up)
	{
		this.up = up;
		return (J) this;
	}

	/**
	 * Sets the icon for down
	 * @return
	 */
	public String getDown()
	{
		return down;
	}

	/**
	 * Sets the icon for down
	 * @param down
	 * @return
	 */
	public J setDown(String down)
	{
		this.down = down;
		return (J) this;
	}

	/**
	 * Sets the icon for previous
	 * @return
	 */
	public String getPrevious()
	{
		return previous;
	}

	/**
	 * Sets the icon for previous
	 *
	 * @param previous
	 *
	 * @return
	 */
	public J setPrevious(String previous)
	{
		this.previous = previous;
		return (J) this;
	}

	/**
	 * Sets the icon for next
	 * @return
	 */
	public String getNext()
	{
		return next;
	}

	/**
	 * Sets the icon for next
	 * @param next
	 * @return
	 */
	public J setNext(String next)
	{
		this.next = next;
		return (J) this;
	}

	/**
	 * Sets the icon for today
	 * @return
	 */
	public String getToday()
	{
		return today;
	}

	/**
	 * Sets the icon for today
	 * @param today
	 * @return
	 */
	public J setToday(String today)
	{
		this.today = today;
		return (J) this;
	}

	/**
	 * Sets the icon for clear
	 * @return
	 */
	public String getClear()
	{
		return clear;
	}

	/**
	 * Sets the icon for clear
	 * @param clear
	 * @return
	 */
	public J setClear(String clear)
	{
		this.clear = clear;
		return (J) this;
	}

	/**
	 * Sets the icon for close
	 * @return
	 */
	public String getClose()
	{
		return close;
	}

	/**
	 * Sets the icon for close
	 * @param close
	 * @return
	 */
	public J setClose(String close)
	{
		this.close = close;
		return (J)this;
	}
}
