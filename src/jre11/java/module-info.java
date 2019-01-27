module com.jwebmp.plugins.bs4datetimepicker {
	exports com.jwebmp.plugins.bs4datetimepicker;
	exports com.jwebmp.plugins.bs4datetimepicker.events;
	exports com.jwebmp.plugins.bs4datetimepicker.interfaces;
	exports com.jwebmp.plugins.bs4datetimepicker.options;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap4;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.bs4datetimepicker.BS4DateTimePageConfigurator;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.bs4datetimepicker.implementations.BS4DateTimePickerExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.bs4datetimepicker.implementations.BS4DateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.bs4datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.options to com.fasterxml.jackson.databind, com.jwebmp.core;
}
