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

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.dropdown.menu.BSDropDownMenuChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
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
public class BS4DateTimePickerInputGroup<J extends BS4DateTimePickerInputGroup<J>> extends BSFormInputGroup<J>
		implements BSDropDownMenuChildren
{

	private static final long serialVersionUID = 1L;
	/**
	 * The associated feature
	 */
	private BS44DateTimePickerFeature feature;

	private final Span calendarSelectSpan = new Span();
	private FontAwesomeIcons calendarIcon = FontAwesomeIcons.calendar;

	private BS4DateTimePicker input;

	/**
	 * Constructs a new instance
	 */
	public BS4DateTimePickerInputGroup()
	{
		this("variable.name");
	}

	/**
	 * Constructs a new instance
	 *
	 * @param variableName
	 */
	public BS4DateTimePickerInputGroup(String variableName)
	{
		super(new BS4DateTimePicker(variableName));
		this.input = getInput();
		addFeature(feature = new BS44DateTimePickerFeature(this));
		input.getFeatures()
				.clear();

		getInput().bind(variableName);
		addAttribute("data-target-input", "nearest");
		addClass("date");
	}

	@Nullable
	@Override
	public BS4DateTimePicker<?> getInput()
	{
		return (BS4DateTimePicker) super.getInput();
	}

	public FontAwesomeIcons getCalendarIcon()
	{
		return calendarIcon;
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
			getInput().addAttribute("data-target", calendarSelectSpan.getID(true));
			getCalendarSelectSpan().addAttribute("data-toggle", getInput().getID());

			getCalendarSelectSpan().add((ComponentHierarchyBase) new FontAwesome(getCalendarIcon()).setTag("span"));
			getInputGroupAddonsRight().add(getCalendarSelectSpan());
		}
		super.preConfigure();
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
	 * Returns the holder of the icon
	 *
	 * @return
	 */
	public Span getCalendarSelectSpan()
	{
		return calendarSelectSpan;
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

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
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
