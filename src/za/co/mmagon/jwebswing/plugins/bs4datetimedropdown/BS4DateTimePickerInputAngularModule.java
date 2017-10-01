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
package za.co.mmagon.jwebswing.plugins.bs4datetimedropdown;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.BS4DateTimePickerReferencePool;

/**
 * @author GedMarc
 * @since 27 Jan 2017
 */
public class BS4DateTimePickerInputAngularModule extends AngularModuleBase
{
	
	private static final long serialVersionUID = 1L;
	
	public BS4DateTimePickerInputAngularModule(ComponentHierarchyBase page)
	{
		super("ui.dateTimeInput");
		page.getJavascriptReferences().add(BS4DateTimePickerReferencePool.BootstrapDateTimeInputReference.getJavaScriptReference());
	}
	
	@Override
	public String renderFunction()
	{
		return "";
	}
}
