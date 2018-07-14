/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bs4datetimepicker.interfaces;

import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bs4datetimepicker.BS4DateTimePicker;
import com.jwebmp.plugins.bs4datetimepicker.options.BS4DateTimePickerOptions;

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
