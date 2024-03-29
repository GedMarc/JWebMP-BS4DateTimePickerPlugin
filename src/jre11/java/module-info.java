import com.jwebmp.plugins.bs4.datetimepicker.implementations.BS4DateTimePickerInclusionModule;

module com.jwebmp.plugins.bs4.datetimepicker {
	exports com.jwebmp.plugins.bs4.datetimepicker;
	exports com.jwebmp.plugins.bs4.datetimepicker.events;
	exports com.jwebmp.plugins.bs4.datetimepicker.interfaces;
	exports com.jwebmp.plugins.bs4.datetimepicker.options;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4.datetimepicker.BS4DateTimePageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4.datetimepicker.implementations.BS4DateTimePickerExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with BS4DateTimePickerInclusionModule;
	
	opens com.jwebmp.plugins.bs4.datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.options to com.fasterxml.jackson.databind, com.jwebmp.core;
}
