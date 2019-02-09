module com.jwebmp.plugins.bs4datetimepicker {
	exports com.jwebmp.plugins.bs4datetimepicker;
	exports com.jwebmp.plugins.bs4.datetimepicker.events;
	exports com.jwebmp.plugins.bs4.datetimepicker.interfaces;
	exports com.jwebmp.plugins.bs4.datetimepicker.options;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BS4DateTimePageConfigurator;

	provides IGuiceScanJarExclusions with BS4DateTimePickerExclusionsModule;
	provides IGuiceScanModuleExclusions with BS4DateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.bs4datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4.datetimepicker.options to com.fasterxml.jackson.databind, com.jwebmp.core;
}
