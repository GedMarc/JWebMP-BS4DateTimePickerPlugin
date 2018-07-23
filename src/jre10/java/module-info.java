import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bs4datetimepicker.BS4DateTimePageConfigurator;

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
	requires com.jwebmp.plugins.fontawesome;

	provides IPageConfigurator with BS4DateTimePageConfigurator;

}
