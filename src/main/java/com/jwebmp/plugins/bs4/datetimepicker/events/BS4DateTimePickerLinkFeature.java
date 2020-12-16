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

package com.jwebmp.plugins.bs4.datetimepicker.events;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.bs4.datetimepicker.BS4DateTimePicker;

/**
 * A client side feature for the date time picker
 */
public class BS4DateTimePickerLinkFeature
		extends Feature<GlobalFeatures, JavaScriptPart<?>,BS4DateTimePickerLinkFeature>
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
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		String minString = dateTimePickerMin.getJQueryID() +
		                   "on(\"change.datetimepicker\", function (e) {" +
		                   dateTimePickerMax.getJQueryID() +
		                   "datetimepicker('minDate', e.date);" +
		                   "});";
		String maxString = dateTimePickerMax.getJQueryID() +
		                   "on(\"change.datetimepicker\", function (e) {" +
		                   dateTimePickerMin.getJQueryID() +
		                   "datetimepicker('maxDate', e.date);" +
		                   "});";

		addQuery(minString);
		addQuery(maxString);
	}
}
