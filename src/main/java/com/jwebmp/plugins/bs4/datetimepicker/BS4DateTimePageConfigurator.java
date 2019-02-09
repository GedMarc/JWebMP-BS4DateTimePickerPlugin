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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 22 Feb 2017
 */
@PluginInformation(pluginName = "BS 4 Date Time Picker",
		pluginUniqueName = "bootstrap4-datepicker",
		pluginDescription = "Bootstrap 4 datetime picker directive styled by Twitter Bootstrap",
		pluginVersion = "BS 4b1",
		pluginDependancyUniqueIDs = "jquery,bootstrap,moment,glyphicons",
		pluginCategories = "bootstrap,web ui,ui,framework,date picker",
		pluginSubtitle = "A Bootstrap 4 Date Time Picker with intuitive data transfer and customized calendar templates.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-BSD4ateTimePickerPlugin",
		pluginSourceUrl = "https://tempusdominus.github.io/bootstrap-4/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BS4DateTimePickerPlugin/wiki",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BS4DateTimePickerPlugin.jar/download",
		pluginIconUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_icon.png",
		pluginIconImageUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_logo.jpg",
		pluginLastUpdatedDate = "2017/10/01")
public class BS4DateTimePageConfigurator
		implements IPageConfigurator<BS4DateTimePageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/**
	 * Constructs a new instance of the BS4DateTimePicker
	 */
	public BS4DateTimePageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return BS4DateTimePageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		BS4DateTimePageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BS4DateTimePickerReferencePool.TempusDominusReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BS4DateTimePickerReferencePool.TempusDominusReference.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return BS4DateTimePageConfigurator.enabled;
	}
}
