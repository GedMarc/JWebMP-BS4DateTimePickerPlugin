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
package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import com.google.common.base.Strings;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import za.co.mmagon.jwebswing.plugins.fontawesome.FontAwesome;
import za.co.mmagon.jwebswing.plugins.fontawesome.FontAwesomeIcons;

import javax.annotation.Nullable;
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
		extends BSFormInputGroup<J>
{

	private static final long serialVersionUID = 1L;
	private final Span<?, ?, ?> calendarSelectSpan = new Span<>();
	/**
	 * The associated feature
	 */
	private BS44DateTimePickerFeature feature;
	private FontAwesomeIcons calendarIcon = FontAwesomeIcons.calendar;
	private BS4DateTimePickerInput<?> input;

	private String inputGroupID;

	/**
	 * Constructs a new instance
	 */
	public BS4DateTimePicker()
	{
		this("variable.name");
	}

	/**
	 * Constructs a new instance
	 *
	 * @param variableName
	 */
	public BS4DateTimePicker(String variableName)
	{
		super(new BS4DateTimePickerInput(variableName));

		input = getInput();
		feature = new BS44DateTimePickerFeature(this);
		addFeature(feature);
		input.getFeatures()
		     .clear();
		getInput().bind(variableName);
		addAttribute("data-target-input", "nearest");

		addClass("date");
	}

	@NotNull
	@Override
	public BS4DateTimePickerInput<?> getInput()
	{
		return (BS4DateTimePickerInput) super.getInput();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Returns the options if any is required
	 *
	 * @return
	 */
	@Override
	public DivSimple<J> bind(String variableName)
	{
		addAttribute(AngularAttributes.ngModel, variableName);
		return this;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			if (!Strings.isNullOrEmpty(getInputGroupID()))
			{
				getInput().addAttribute("data-target", getInputGroupID());
			}

			getCalendarSelectSpan().addAttribute("data-toggle", "datetimepicker");

			getCalendarSelectSpan().add((ComponentHierarchyBase) new FontAwesome(getCalendarIcon()).setTag("span"));

			getInputGroupAddonsRight().add(getCalendarSelectSpan());
		}
		super.preConfigure();
	}

	/**
	 * Returns the input group id
	 *
	 * @return
	 */
	@Nullable
	public String getInputGroupID()
	{
		return inputGroupID;
	}

	/**
	 * Returns the holder of the icon
	 *
	 * @return
	 */
	public Span getCalendarSelectSpan()
	{
		return calendarSelectSpan;
	}

	public FontAwesomeIcons getCalendarIcon()
	{
		return calendarIcon;
	}

	/**
	 * Sets the icon used
	 *
	 * @param calendarIcon
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCalendarIcon(FontAwesomeIcons calendarIcon)
	{
		this.calendarIcon = calendarIcon;
		return (J) this;
	}

	/**
	 * Sets the input group ID
	 *
	 * @param inputGroupID
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInputGroupID(String inputGroupID)
	{
		this.inputGroupID = inputGroupID;
		return (J) this;
	}

	/**
	 * Returns the feature if any is required
	 *
	 * @return
	 */
	public final BS44DateTimePickerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new BS44DateTimePickerFeature(this);
		}
		return feature;
	}

	/**
	 * Sets this picker as required
	 *
	 * @param required
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRequired(boolean required)
	{
		addAttribute(AngularAttributes.ngRequired, Boolean.toString(required));
		if (required)
		{
			addAttribute("required", "");
		}
		else
		{
			removeAttribute("required");
		}
		return (J) this;
	}

	/**
	 * Returns the options if any is required
	 *
	 * @return
	 */
	@Override
	public BS4DateTimePickerOptions getOptions()
	{
		return feature.getOptions();
	}
}
