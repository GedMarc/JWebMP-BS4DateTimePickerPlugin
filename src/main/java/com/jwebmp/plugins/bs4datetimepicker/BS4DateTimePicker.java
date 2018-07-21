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
package com.jwebmp.plugins.bs4datetimepicker;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bs4datetimepicker.events.BS4DateTimePickerLinkFeature;
import com.jwebmp.plugins.bs4datetimepicker.interfaces.IBS4DateTimePicker;
import com.jwebmp.plugins.bs4datetimepicker.options.BS4DateTimePickerOptions;
import com.jwebmp.plugins.fontawesome.FontAwesomeIcons;

import javax.validation.constraints.NotNull;

/**
 * An implementation of
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "BS 4 Date Time Picker",
		description = "The Tempus Dominus Bootstrap Date Time Picker",
		url = "https://github.com/GedMarc/JWebSwing-BS4DateTimePickerPlugin")
public class BS4DateTimePicker<J extends BS4DateTimePicker<J>>
		extends BSFormInputGroup<J, InputTextType<?>>
		implements IBS4DateTimePicker<J>
{

	private static final long serialVersionUID = 1L;
	private BS44DateTimePickerFeature feature;

	private boolean hideButton;

	private FontAwesomeIcons calendarIcon = FontAwesomeIcons.calendar;

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
			inputGroupText.add(new Italic<>().addClass(calendarIcon.toString()));

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
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public @NotNull J setID(String id)
	{
		return super.setID(id);
	}

	@NotNull
	@Override
	public InputTextType<?> getInput()
	{
		return super.getInput();
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

	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setClickOnInput()
	{
		getInput().addAttribute("data-toggle", "datetimepicker");
		getInput().addAttribute(ButtonAttributes.Data_Target.toString(), getInput().getID(true));
		return (J) this;
	}
}
