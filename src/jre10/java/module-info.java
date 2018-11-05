import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bs4datetimepicker.BS4DateTimePageConfigurator;
import com.jwebmp.plugins.bs4datetimepicker.implementations.BS4DateTimePickerExclusionsModule;

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

	provides IPageConfigurator with BS4DateTimePageConfigurator;

	provides IGuiceScanJarExclusions with BS4DateTimePickerExclusionsModule;
	provides IGuiceScanModuleExclusions with BS4DateTimePickerExclusionsModule;

	opens com.jwebmp.plugins.bs4datetimepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bs4datetimepicker.options to com.fasterxml.jackson.databind, com.jwebmp.core;
}
