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
package com.jwebmp.plugins.bs4.datetimepicker;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.core.base.interfaces.IIcon;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bs4.datetimepicker.events.BS4DateTimePickerLinkFeature;
import com.jwebmp.plugins.bs4.datetimepicker.interfaces.IBS4DateTimePicker;
import com.jwebmp.plugins.bs4.datetimepicker.options.BS4DateTimePickerOptions;

import jakarta.validation.constraints.NotNull;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "BS 4 Date Time Picker",
		description = "The Tempus Dominus Bootstrap Date Time Picker",
		url = "https://github.com/GedMarc/JWebMP-BS4DateTimePickerPlugin")
public class BS4DateTimePicker<J extends BS4DateTimePicker<J>>
		extends BSFormInputGroup<J, InputTextType<?>>
		implements IBS4DateTimePicker<J>
{
	private BS44DateTimePickerFeature feature;

	private boolean hideButton;

	private IIcon<?,?> calendarIcon;

	/**
	 * Constructs a new instance
	 */
	public BS4DateTimePicker()
	{
		setInput(new InputTextType<>());
		feature = new BS44DateTimePickerFeature(this);
		addFeature(feature);
		addClass("date");
		addAttribute("data-target-input", "nearest");
		getInput().addClass("datetimepicker-input");
	}

	@NotNull
	@Override
	public InputTextType<?> getInput()
	{
		return super.getInput();
	}

	public static BS4DateTimePickerLinkFeature linkPickers(BS4DateTimePicker minPicker, BS4DateTimePicker maxPicker)
	{
		BS4DateTimePickerLinkFeature linkFeature = new BS4DateTimePickerLinkFeature(minPicker, maxPicker);
		minPicker.addFeature(linkFeature);
		return linkFeature;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void preConfigure()
	{
		if (!isConfigured())
		{
			Div inputGroupText = new Div();
			inputGroupText.addClass("input-group-text");
			if (calendarIcon != null)
			{
				inputGroupText.add(calendarIcon.asHierarchyBase()
				                               .setTiny(true)
				                               .toString(0));
			}

			getInput().addAttribute(ButtonAttributes.Data_Target.toString(), getID(true));
			if (!hideButton)
			{
				append(inputGroupText, false);
			}

			getAppendDiv().addAttribute(ButtonAttributes.Data_Target.toString(), getID(true));
			getAppendDiv().addAttribute("data-toggle", "datetimepicker");
		}
		super.preConfigure();
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
	public @NotNull
	J setID(String id)
	{
		return super.setID(id);
	}

	/**
	 * Sets to display as Date only (sets format to L)
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDateOnly()
	{
		getOptions().setFormat("L");
		return (J) this;
	}

	@Override
	public BS4DateTimePickerOptions<?> getOptions()
	{
		return feature.getOptions();
	}

	/**
	 * Sets to display as time only (sets format to LT)
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setTimeOnly()
	{
		getOptions().setFormat("LT");
		return (J) this;
	}

	/**
	 * Sets the no icon
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setNoIcon()
	{
		setClickOnInput();
		hideButton = true;
		return (J) this;
	}

	/**
	 * Sets if must trigger on the input click
	 *
	 * @return Always this
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setClickOnInput()
	{
		getInput().addAttribute("data-toggle", "datetimepicker");
		getInput().addAttribute(ButtonAttributes.Data_Target.toString(), getInput().getID(true));
		return (J) this;
	}

	public IIcon<?,?> getCalendarIcon()
	{
		return calendarIcon;
	}

	/**
	 * Sets the calendar icon or null
	 *
	 * @param calendarIcon
	 * 		The icon - nullbale
	 *
	 * @return The calendar icon
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCalendarIcon(IIcon<?,?> calendarIcon)
	{
		this.calendarIcon = calendarIcon;
		return (J) this;
	}
}
