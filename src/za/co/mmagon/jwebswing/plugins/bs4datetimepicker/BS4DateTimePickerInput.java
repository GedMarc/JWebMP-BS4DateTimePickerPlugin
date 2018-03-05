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

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.html.inputs.InputTextType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

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
public class BS4DateTimePickerInput<J extends BS4DateTimePickerInput<J>>
		extends InputTextType<J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The associated feature
	 */
	private BS44DateTimePickerFeature feature;

	public BS4DateTimePickerInput()
	{
		this("no.variable");
	}

	/**
	 * Constructs a new instance
	 *
	 * @param variableName
	 */
	public BS4DateTimePickerInput(String variableName)
	{
		bind(variableName);
		addClass("datetimepicker-input");
		addFeature(getFeature());
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
		return (J) this;
	}

	@Override
	public BS4DateTimePickerOptions getOptions()
	{
		return getFeature().getOptions();
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

}
