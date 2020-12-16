package com.jwebmp.plugins.bs4.datetimepicker.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class BS4DateTimePickerInclusionModule implements IGuiceScanModuleInclusions<BS4DateTimePickerInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.bs4.datetimepicker");
		return set;
	}
}
