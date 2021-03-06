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

package com.jwebmp.plugins.bs4.datetimepicker.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bs4.datetimepicker.BS4DateTimePicker;
import com.jwebmp.plugins.bs4.datetimepicker.options.BS4DateTimePickerOptions;

import jakarta.validation.constraints.NotNull;

public interface IBS4DateTimePicker<J extends BS4DateTimePicker<J>>
		extends ICssStructure<J>
{
	/**
	 * Sets to display as Date only (sets format to L)
	 *
	 * @return
	 */
	@NotNull
	
	J setDateOnly();
	BS4DateTimePickerOptions<?> getOptions();

	/**
	 * Sets to display as time only (sets format to LT)
	 *
	 * @return
	 */
	@NotNull
	
	J setTimeOnly();

	/**
	 * Sets the no icon
	 *
	 * @return
	 */
	@NotNull
	
	J setNoIcon();

	@NotNull
	
	J setClickOnInput();
}
