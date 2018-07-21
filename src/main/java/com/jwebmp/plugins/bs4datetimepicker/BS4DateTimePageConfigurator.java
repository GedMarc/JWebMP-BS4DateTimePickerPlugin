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

import com.jwebmp.core.Page;
import com.jwebmp.core.PageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

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
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BSD4ateTimePickerPlugin",
		pluginSourceUrl = "https://tempusdominus.github.io/bootstrap-4/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BS4DateTimePickerPlugin/wiki",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BS4DateTimePickerPlugin.jar/download",
		pluginIconUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_icon.png",
		pluginIconImageUrl = "bower_components/angular-bootstrap-datetimepicker/date_time_picker_logo.jpg",
		pluginLastUpdatedDate = "2017/10/01")
public class BS4DateTimePageConfigurator
		extends PageConfigurator
{

	public static final String BSDateTimeEnabled = "bs-datetime-enabled";
	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new instance of the BS4DateTimePicker
	 */
	public BS4DateTimePageConfigurator()
	{
		//Nothing Needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(BS4DateTimePickerReferencePool.TempusDominusReference.getJavaScriptReference());
			page.getBody()
			    .addCssReference(BS4DateTimePickerReferencePool.TempusDominusReference.getCssReference());
		}
		return page;
	}
}
