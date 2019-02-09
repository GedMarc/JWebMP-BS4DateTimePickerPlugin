package com.jwebmp.plugins.bs4.datetimepicker.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BS4DateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<BS4DateTimePickerExclusionsModule>,
				           IGuiceScanJarExclusions<BS4DateTimePickerExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap4-date-time-picker-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bs4datetimepicker");
		return strings;
	}
}
