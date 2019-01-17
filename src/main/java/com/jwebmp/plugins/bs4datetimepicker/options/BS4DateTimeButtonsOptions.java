/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.bs4datetimepicker.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

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
