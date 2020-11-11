package com.jwebmp.plugins.bs4.datetimepicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BS4DateTimePickerExclusionsModule
		implements IGuiceScanModuleExclusions<BS4DateTimePickerExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bs4datetimepicker");
		return strings;
	}
}
