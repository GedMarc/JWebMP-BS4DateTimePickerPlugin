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
package za.co.mmagon.jwebswing.plugins.bs4datetimepicker;

import com.fasterxml.jackson.annotation.JsonFormat;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.bs4datetimepicker.options.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * All the options
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * <p>
 * <p>
 * @since Mar 4, 2015
 */
public class BS4DateTimePickerOptions<J extends BS4DateTimePickerOptions<J>> extends JavaScriptPart<J>
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Takes string, Date, moment, null parameter and sets the components model current moment to it. Passing a null value unsets the components model current moment. Parsing of the newDate parameter is made using moment library with the options.format and options.useStrict components configuration.
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	private LocalDate date;
	/**
	 * akes a moment.js format string and sets the components options.format. This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function. The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
	 * <p>
	 * Note: this is also used to determine if the time picker sub component will display the hours in 12 or 24 format. (if a or h exists in the passed string then a 12 hour mode is set)
	 */
	private String format;
	/**
	 * Default: 'MMMM YYYY'
	 * <p>
	 * Changes the heading of the date picker when in "days" view.
	 */
	private String dayViewHeaderFormat;
	/**
	 * Takes an array of valid input moment format options.
	 */
	private List<String> additionalFormats;
	/**
	 * Takes a number. This be the amount the up/down arrows move the minute value with a time picker.
	 */
	private Integer stepping;
	/**
	 * Takes a minDate string, Date, moment, boolean:false parameter and disallows the user to select a moment that is before that moment. If a boolean:false value is passed the options.minDate parameter is cleared and there is no restriction to the minimum moment the user can select.
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	private LocalDate minDate;
	/**
	 * Takes a [maxDate] string, Date, moment, boolean:false parameter and disallows the user to select a moment that is after that moment. If a boolean:false value is passed options.maxDate is cleared and there is no restriction to the maximum moment the user can select.
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	private LocalDate maxDate;
	/**
	 * Takes a boolean or string. If a boolean true is passed and the components model moment is not set (either through setDate or through a valid value on the input element the component is attached to) then the first time the user opens the datetimepicker widget the value is initialized to the current moment of the action. If a false boolean is passed then no initialization happens on the input element. You can select the granularity on the initialized moment by passing one of the following strings ('year', 'month', 'day', 'hour', 'minute') in the variable.
	 */
	private Boolean useCurrent;
	/**
	 * Takes a boolean. If set to false the picker will display similar to sideBySide except vertical.
	 */
	private Boolean collapse;
	/**
	 * Default: false
	 * Sets the picker default date/time. Overrides useCurrent
	 * <p>
	 * Takes a string, Date, moment, boolean:false. Will set the picker's initial date.
	 * If a boolean:false value is passed the options.defaultDate parameter is cleared
	 */
	private LocalDate defaultDate;
	/**
	 * Takes an [ string or Date or moment ] of values and disallows the user to select those days. Setting this takes precedence over options.minDate, options.maxDate configuration. Also calling this function removes the configuration of options.enabledDates if such exist.
	 */
	private List<LocalDate> disabledDates;
	/**
	 * Takes an [ string or Date or moment ] of values and allows the user to select only from those days. Setting this takes precedence over options.minDate, options.maxDate configuration. Also calling this function removes the configuration of options.disabledDates if such exist.
	 */
	private List<LocalDate> enabledDates;
	/**
	 * Default: {
	 * time: 'glyphicon glyphicon-time',
	 * date: 'glyphicon glyphicon-calendar',
	 * up: 'glyphicon glyphicon-chevron-up',
	 * down: 'glyphicon glyphicon-chevron-down',
	 * previous: 'glyphicon glyphicon-chevron-left',
	 * next: 'glyphicon glyphicon-chevron-right',
	 * today: 'glyphicon glyphicon-screenshot',
	 * clear: 'glyphicon glyphicon-trash',
	 * close: 'glyphicon glyphicon-remove'
	 * }
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default icons for the pickers functions.
	 */
	private BS4DateTimeInputIcons icons;
	/**
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default toolbar buttons for the pickers functions.
	 */
	private BS4DateTimeButtonsOptions buttons;
	/**
	 * Shows the week of the year to the left of first day of the week
	 */
	private Boolean calendarWeeks;
	
	/**
	 * Defines if moment should use strict date parsing when considering a date to be valid.
	 */
	private Boolean useStrict;
	/**
	 * Takes a boolean. If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing.
	 */
	private Boolean sideBySide;
	/**
	 * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array. This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
	 */
	private List<Integer> daysOfWeekDisabled;
	/**
	 * Default: 'days'
	 * Accepts: 'decades','years','months','days'
	 * <p>
	 * The default view to display when the picker is shown.
	 * <p>
	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY.
	 * viewMode
	 * <p>
	 * Returns a string of the options.viewMode.
	 * viewMode, [newViewMode]
	 * <p>
	 * Takes a string. Valid values are 'days', 'months', 'years' and 'decades'
	 */
	private BS4DateTimeViewModes viewMode;
	/**
	 * toolbarPlacement
	 * <p>
	 * Default: 'default'
	 * Accepts: 'default', 'top', 'bottom'
	 * <p>
	 * Changes the placement of the icon toolbar.
	 * <p>
	 * toolbarPlacement
	 * toolbarplacement
	 * <p>
	 * Returns a string variable with the currently set options.toolbarplacement option.
	 * toolbarplacement, [string]
	 * <p>
	 * Takes a string value. Valid values are 'default', 'top' and 'bottom'.
	 * <p>
	 * Changes the placement of the toolbar where the today, clear, component switch icon are located.
	 */
	private BS4DateTimeToolbarPlacements toolbarPlacement;
	/**
	 * Takes an object parameter that can contain two keys vertical and horizontal each having a value of 'auto', 'top', 'bottom' for vertical and 'auto', 'left', 'right' for horizontal which defines where the dropdown with the widget will appear relative to the input element the component is attached to.
	 * <p>
	 * 'auto' is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user. Usually you should not override those options unless you have a special need in your layout.
	 */
	private BS4DateTimeWidgetPositioningOptions widgetPositioning;
	
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to stay open after selecting a date.
	 */
	private Boolean keepOpen;
	/**
	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
	 */
	private Boolean inline;
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to not revert or overwrite invalid dates.
	 */
	private Boolean keepInvalid;
	/**
	 * Default: false
	 * <p>
	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
	 */
	private Boolean ignoreReadonly;
	/**
	 * Allows the setting of multiple dates.
	 * allowMultidate
	 * <p>
	 * Returns an boolean of options.allowMultidate
	 * allowMultidate, [allowMultidate]
	 * <p>
	 * Takes an boolean.
	 * Throws
	 * <p>
	 * TypeError - if allowMultidate parameter is not an boolean
	 */
	private Boolean allowMultidate;
	/**
	 * multidateSeparator
	 * <p>
	 * multidateSeparator: ','
	 * <p>
	 * Used with allowMultidate. E.g. 1/1/2017,1/2/2017
	 * multidateSeparator
	 * <p>
	 * Returns an string of options.multidateSeparator
	 * multidateSeparator, [multidateSeparator]
	 * <p>
	 * Takes an string of a valid timezone.
	 */
	private Character multidateSeparator;
	
	
	/**
	 * The options for the component
	 */
	public BS4DateTimePickerOptions()
	{
		//Nothing Needed
	}
	
	/**
	 * Takes string, Date, moment, null parameter and sets the components model current moment to it. Passing a null value unsets the components model current moment. Parsing of the newDate parameter is made using moment library with the options.format and options.useStrict components configuration.
	 *
	 * @return
	 */
	public LocalDate getDate()
	{
		return date;
	}
	
	/**
	 * Takes string, Date, moment, null parameter and sets the components model current moment to it. Passing a null value unsets the components model current moment. Parsing of the newDate parameter is made using moment library with the options.format and options.useStrict components configuration.
	 *
	 * @param date
	 *
	 * @return
	 */
	public J setDate(LocalDate date)
	{
		this.date = date;
		return (J) this;
	}
	
	/**
	 * Takes a moment.js format string and sets the components options.format. This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function. The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
	 * <p>
	 * Note: this is also used to determine if the time picker sub component will display the hours in 12 or 24 format. (if a or h exists in the passed string then a 12 hour mode is set)
	 *
	 * @return
	 */
	public String getFormat()
	{
		return format;
	}
	
	/**
	 * Takes a moment.js format string and sets the components options.format. This is used for displaying and also for parsing input strings either from the input element the component is attached to or the date() function. The parameter can also be a boolean:false in which case the format is set to the locale's L LT.
	 * <p>
	 * Note: this is also used to determine if the time picker sub component will display the hours in 12 or 24 format. (if a or h exists in the passed string then a 12 hour mode is set)
	 *
	 * @param format
	 *
	 * @return
	 */
	public J setFormat(String format)
	{
		this.format = format;
		return (J) this;
	}
	
	/**
	 * Default: 'MMMM YYYY'
	 * <p>
	 * Changes the heading of the date picker when in "days" view.
	 *
	 * @return
	 */
	public String getDayViewHeaderFormat()
	{
		return dayViewHeaderFormat;
	}
	
	/**
	 * Default: 'MMMM YYYY'
	 * <p>
	 * Changes the heading of the date picker when in "days" view.
	 *
	 * @param dayViewHeaderFormat
	 *
	 * @return
	 */
	public J setDayViewHeaderFormat(String dayViewHeaderFormat)
	{
		this.dayViewHeaderFormat = dayViewHeaderFormat;
		return (J) this;
	}
	
	/**
	 * Takes an array of valid input moment format options.
	 *
	 * @return
	 */
	public List<String> getAdditionalFormats()
	{
		if (additionalFormats == null)
		{
			additionalFormats = new ArrayList<>();
		}
		return additionalFormats;
	}
	
	/**
	 * Takes an array of valid input moment format options.
	 *
	 * @param additionalFormats
	 *
	 * @return
	 */
	public J setAdditionalFormats(List<String> additionalFormats)
	{
		this.additionalFormats = additionalFormats;
		return (J) this;
	}
	
	/**
	 * Takes a number. This be the amount the up/down arrows move the minute value with a time picker.
	 *
	 * @return
	 */
	public Integer getStepping()
	{
		return stepping;
	}
	
	/**
	 * Takes a number. This be the amount the up/down arrows move the minute value with a time picker.
	 *
	 * @param stepping
	 *
	 * @return
	 */
	public J setStepping(Integer stepping)
	{
		this.stepping = stepping;
		return (J) this;
	}
	
	/**
	 * Takes a minDate string, Date, moment, boolean:false parameter and disallows the user to select a moment that is before that moment. If a boolean:false value is passed the options.minDate parameter is cleared and there is no restriction to the minimum moment the user can select.
	 *
	 * @return
	 */
	public LocalDate getMinDate()
	{
		return minDate;
	}
	
	/**
	 * Takes a minDate string, Date, moment, boolean:false parameter and disallows the user to select a moment that is before that moment. If a boolean:false value is passed the options.minDate parameter is cleared and there is no restriction to the minimum moment the user can select.
	 *
	 * @param minDate
	 *
	 * @return
	 */
	public J setMinDate(LocalDate minDate)
	{
		this.minDate = minDate;
		return (J) this;
	}
	
	/**
	 * Takes a [maxDate] string, Date, moment, boolean:false parameter and disallows the user to select a moment that is after that moment. If a boolean:false value is passed options.maxDate is cleared and there is no restriction to the maximum moment the user can select.
	 *
	 * @return
	 */
	public LocalDate getMaxDate()
	{
		return maxDate;
	}
	
	/**
	 * Takes a [maxDate] string, Date, moment, boolean:false parameter and disallows the user to select a moment that is after that moment. If a boolean:false value is passed options.maxDate is cleared and there is no restriction to the maximum moment the user can select.
	 *
	 * @param maxDate
	 *
	 * @return
	 */
	public J setMaxDate(LocalDate maxDate)
	{
		this.maxDate = maxDate;
		return (J) this;
	}
	
	/**
	 * Takes a boolean or string. If a boolean true is passed and the components model moment is not set (either through setDate or through a valid value on the input element the component is attached to) then the first time the user opens the datetimepicker widget the value is initialized to the current moment of the action. If a false boolean is passed then no initialization happens on the input element. You can select the granularity on the initialized moment by passing one of the following strings ('year', 'month', 'day', 'hour', 'minute') in the variable.
	 *
	 * @return
	 */
	public Boolean getUseCurrent()
	{
		return useCurrent;
	}
	
	/**
	 * Takes a boolean or string. If a boolean true is passed and the components model moment is not set (either through setDate or through a valid value on the input element the component is attached to) then the first time the user opens the datetimepicker widget the value is initialized to the current moment of the action. If a false boolean is passed then no initialization happens on the input element. You can select the granularity on the initialized moment by passing one of the following strings ('year', 'month', 'day', 'hour', 'minute') in the variable.
	 *
	 * @param useCurrent
	 *
	 * @return
	 */
	public J setUseCurrent(Boolean useCurrent)
	{
		this.useCurrent = useCurrent;
		return (J) this;
	}
	
	/**
	 * Takes a boolean. If set to false the picker will display similar to sideBySide except vertical.
	 *
	 * @return
	 */
	public Boolean getCollapse()
	{
		return collapse;
	}
	
	/**
	 * Takes a boolean. If set to false the picker will display similar to sideBySide except vertical.
	 *
	 * @param collapse
	 *
	 * @return
	 */
	public J setCollapse(Boolean collapse)
	{
		this.collapse = collapse;
		return (J) this;
	}
	
	/**
	 * Default: false
	 * Sets the picker default date/time. Overrides useCurrent
	 * <p>
	 * Takes a string, Date, moment, boolean:false. Will set the picker's initial date.
	 * If a boolean:false value is passed the options.defaultDate parameter is cleared
	 *
	 * @return
	 */
	public LocalDate getDefaultDate()
	{
		return defaultDate;
	}
	
	/**
	 * Default: false
	 * Sets the picker default date/time. Overrides useCurrent
	 * <p>
	 * Takes a string, Date, moment, boolean:false. Will set the picker's initial date.
	 * If a boolean:false value is passed the options.defaultDate parameter is cleared
	 *
	 * @param defaultDate
	 *
	 * @return
	 */
	public J setDefaultDate(LocalDate defaultDate)
	{
		this.defaultDate = defaultDate;
		return (J) this;
	}
	
	/**
	 * Takes an [ string or Date or moment ] of values and disallows the user to select those days. Setting this takes precedence over options.minDate, options.maxDate configuration. Also calling this function removes the configuration of options.enabledDates if such exist.
	 *
	 * @return
	 */
	@NotNull
	public List<LocalDate> getDisabledDates()
	{
		if (disabledDates == null)
		{
			disabledDates = new ArrayList<>();
		}
		return disabledDates;
	}
	
	/**
	 * Takes an [ string or Date or moment ] of values and disallows the user to select those days. Setting this takes precedence over options.minDate, options.maxDate configuration. Also calling this function removes the configuration of options.enabledDates if such exist.
	 *
	 * @param disabledDates
	 */
	public void setDisabledDates(List<LocalDate> disabledDates)
	{
		this.disabledDates = disabledDates;
	}
	
	/**
	 * Takes an [ string or Date or moment ] of values and allows the user to select only from those days. Setting this takes precedence over options.minDate, options.maxDate configuration. Also calling this function removes the configuration of options.disabledDates if such exist.
	 *
	 * @return
	 */
	public List<LocalDate> getEnabledDates()
	{
		if (enabledDates == null)
		{
			enabledDates = new ArrayList<>();
		}
		return enabledDates;
	}
	
	/**
	 * Default: {
	 * time: 'glyphicon glyphicon-time',
	 * date: 'glyphicon glyphicon-calendar',
	 * up: 'glyphicon glyphicon-chevron-up',
	 * down: 'glyphicon glyphicon-chevron-down',
	 * previous: 'glyphicon glyphicon-chevron-left',
	 * next: 'glyphicon glyphicon-chevron-right',
	 * today: 'glyphicon glyphicon-screenshot',
	 * clear: 'glyphicon glyphicon-trash',
	 * close: 'glyphicon glyphicon-remove'
	 * }
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default icons for the pickers functions.
	 *
	 * @param enabledDates
	 */
	public void setEnabledDates(List<LocalDate> enabledDates)
	{
		this.enabledDates = enabledDates;
	}
	
	/**
	 * Default: {
	 * time: 'glyphicon glyphicon-time',
	 * date: 'glyphicon glyphicon-calendar',
	 * up: 'glyphicon glyphicon-chevron-up',
	 * down: 'glyphicon glyphicon-chevron-down',
	 * previous: 'glyphicon glyphicon-chevron-left',
	 * next: 'glyphicon glyphicon-chevron-right',
	 * today: 'glyphicon glyphicon-screenshot',
	 * clear: 'glyphicon glyphicon-trash',
	 * close: 'glyphicon glyphicon-remove'
	 * }
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default icons for the pickers functions.
	 *
	 * @return
	 */
	public BS4DateTimeInputIcons getIcons()
	{
		if (icons == null)
		{
			icons = new BS4DateTimeInputIcons();
		}
		return icons;
	}
	
	/**
	 * Default: {
	 * time: 'glyphicon glyphicon-time',
	 * date: 'glyphicon glyphicon-calendar',
	 * up: 'glyphicon glyphicon-chevron-up',
	 * down: 'glyphicon glyphicon-chevron-down',
	 * previous: 'glyphicon glyphicon-chevron-left',
	 * next: 'glyphicon glyphicon-chevron-right',
	 * today: 'glyphicon glyphicon-screenshot',
	 * clear: 'glyphicon glyphicon-trash',
	 * close: 'glyphicon glyphicon-remove'
	 * }
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default icons for the pickers functions.
	 *
	 * @param icons
	 *
	 * @return
	 */
	public J setIcons(BS4DateTimeInputIcons icons)
	{
		this.icons = icons;
		return (J) this;
	}
	
	/**
	 * Defines if moment should use strict date parsing when considering a date to be valid.
	 *
	 * @return
	 */
	public Boolean getUseStrict()
	{
		return useStrict;
	}
	
	/**
	 * Defines if moment should use strict date parsing when considering a date to be valid.
	 *
	 * @param useStrict
	 *
	 * @return
	 */
	public J setUseStrict(Boolean useStrict)
	{
		this.useStrict = useStrict;
		return (J) this;
	}
	
	/**
	 * Takes a boolean. If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing.
	 *
	 * @return
	 */
	public Boolean getSideBySide()
	{
		return sideBySide;
	}
	
	/**
	 * Takes a boolean. If sideBySide is true and the time picker is used, both components will display side by side instead of collapsing.
	 *
	 * @param sideBySide
	 *
	 * @return
	 */
	public J setSideBySide(Boolean sideBySide)
	{
		this.sideBySide = sideBySide;
		return (J) this;
	}
	
	/**
	 * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array. This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
	 *
	 * @return
	 */
	@NotNull
	public List<Integer> getDaysOfWeekDisabled()
	{
		if (daysOfWeekDisabled == null)
		{
			daysOfWeekDisabled = new ArrayList<>();
		}
		return daysOfWeekDisabled;
	}
	
	/**
	 * Takes an [ Number:0 to 6 ] and disallow the user to select weekdays that exist in this array. This has lower priority over the options.minDate, options.maxDate, options.disabledDates and options.enabledDates configuration settings.
	 *
	 * @param daysOfWeekDisabled
	 *
	 * @return
	 */
	public J setDaysOfWeekDisabled(List<Integer> daysOfWeekDisabled)
	{
		this.daysOfWeekDisabled = daysOfWeekDisabled;
		return (J) this;
	}
	
	/**
	 * Shows the week of the year to the left of first day of the week
	 *
	 * @return
	 */
	public Boolean getCalendarWeeks()
	{
		return calendarWeeks;
	}
	
	/**
	 * Shows the week of the year to the left of first day of the week
	 *
	 * @param calendarWeeks
	 *
	 * @return
	 */
	public J setCalendarWeeks(Boolean calendarWeeks)
	{
		this.calendarWeeks = calendarWeeks;
		return (J) this;
	}
	
	/**
	 * Default: 'days'
	 * Accepts: 'decades','years','months','days'
	 * <p>
	 * The default view to display when the picker is shown.
	 * <p>
	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY.
	 * viewMode
	 * <p>
	 * Returns a string of the options.viewMode.
	 * viewMode, [newViewMode]
	 * <p>
	 * Takes a string. Valid values are 'days', 'months', 'years' and 'decades'
	 *
	 * @return
	 */
	public BS4DateTimeViewModes getViewMode()
	{
		return viewMode;
	}
	
	/**
	 * Default: 'days'
	 * Accepts: 'decades','years','months','days'
	 * <p>
	 * The default view to display when the picker is shown.
	 * <p>
	 * Note: To limit the picker to selecting, for instance the year and month, use format: MM/YYYY.
	 * viewMode
	 * <p>
	 * Returns a string of the options.viewMode.
	 * viewMode, [newViewMode]
	 * <p>
	 * Takes a string. Valid values are 'days', 'months', 'years' and 'decades'
	 *
	 * @param viewMode
	 *
	 * @return
	 */
	public J setViewMode(BS4DateTimeViewModes viewMode)
	{
		this.viewMode = viewMode;
		return (J) this;
	}
	
	/**
	 * toolbarPlacement
	 * <p>
	 * Default: 'default'
	 * Accepts: 'default', 'top', 'bottom'
	 * <p>
	 * Changes the placement of the icon toolbar.
	 * <p>
	 * toolbarPlacement
	 * toolbarplacement
	 * <p>
	 * Returns a string variable with the currently set options.toolbarplacement option.
	 * toolbarplacement, [string]
	 * <p>
	 * Takes a string value. Valid values are 'default', 'top' and 'bottom'.
	 * <p>
	 * Changes the placement of the toolbar where the today, clear, component switch icon are located.
	 *
	 * @return
	 */
	public BS4DateTimeToolbarPlacements getToolbarPlacement()
	{
		return toolbarPlacement;
	}
	
	/**
	 * toolbarPlacement
	 * <p>
	 * Default: 'default'
	 * Accepts: 'default', 'top', 'bottom'
	 * <p>
	 * Changes the placement of the icon toolbar.
	 * <p>
	 * toolbarPlacement
	 * toolbarplacement
	 * <p>
	 * Returns a string variable with the currently set options.toolbarplacement option.
	 * toolbarplacement, [string]
	 * <p>
	 * Takes a string value. Valid values are 'default', 'top' and 'bottom'.
	 * <p>
	 * Changes the placement of the toolbar where the today, clear, component switch icon are located.
	 *
	 * @param toolbarPlacement
	 *
	 * @return
	 */
	public J setToolbarPlacement(BS4DateTimeToolbarPlacements toolbarPlacement)
	{
		this.toolbarPlacement = toolbarPlacement;
		return (J) this;
	}
	
	/**
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default toolbar buttons for the pickers functions.
	 *
	 * @return
	 */
	public BS4DateTimeButtonsOptions getButtons()
	{
		return buttons;
	}
	
	/**
	 * Accepts: object with all or some of the parameters above
	 * <p>
	 * Change the default toolbar buttons for the pickers functions.
	 *
	 * @param buttons
	 *
	 * @return
	 */
	public J setButtons(BS4DateTimeButtonsOptions buttons)
	{
		this.buttons = buttons;
		return (J) this;
	}
	
	/**
	 * Takes an object parameter that can contain two keys vertical and horizontal each having a value of 'auto', 'top', 'bottom' for vertical and 'auto', 'left', 'right' for horizontal which defines where the dropdown with the widget will appear relative to the input element the component is attached to.
	 * <p>
	 * 'auto' is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user. Usually you should not override those options unless you have a special need in your layout.
	 *
	 * @return
	 */
	public BS4DateTimeWidgetPositioningOptions getWidgetPositioning()
	{
		return widgetPositioning;
	}
	
	/**
	 * Takes an object parameter that can contain two keys vertical and horizontal each having a value of 'auto', 'top', 'bottom' for vertical and 'auto', 'left', 'right' for horizontal which defines where the dropdown with the widget will appear relative to the input element the component is attached to.
	 * <p>
	 * 'auto' is the default value for both horizontal and vertical keys and it tries to automatically place the dropdown in a position that is visible to the user. Usually you should not override those options unless you have a special need in your layout.
	 *
	 * @param widgetPositioning
	 *
	 * @return
	 */
	public J setWidgetPositioning(BS4DateTimeWidgetPositioningOptions widgetPositioning)
	{
		this.widgetPositioning = widgetPositioning;
		return (J) this;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to stay open after selecting a date.
	 *
	 * @return
	 */
	public Boolean getKeepOpen()
	{
		return keepOpen;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to stay open after selecting a date.
	 *
	 * @param keepOpen
	 *
	 * @return
	 */
	public J setKeepOpen(Boolean keepOpen)
	{
		this.keepOpen = keepOpen;
		return (J) this;
	}
	
	/**
	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
	 *
	 * @return
	 */
	public Boolean getInline()
	{
		return inline;
	}
	
	/**
	 * Will display the picker inline without the need of a input field. This will also hide borders and shadows.
	 *
	 * @param inline
	 *
	 * @return
	 */
	public J setInline(Boolean inline)
	{
		this.inline = inline;
		return (J) this;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to not revert or overwrite invalid dates.
	 *
	 * @return
	 */
	public Boolean getKeepInvalid()
	{
		return keepInvalid;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Will cause the date picker to not revert or overwrite invalid dates.
	 *
	 * @param keepInvalid
	 *
	 * @return
	 */
	public J setKeepInvalid(Boolean keepInvalid)
	{
		this.keepInvalid = keepInvalid;
		return (J) this;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
	 *
	 * @return
	 */
	public Boolean getIgnoreReadonly()
	{
		return ignoreReadonly;
	}
	
	/**
	 * Default: false
	 * <p>
	 * Allow date picker show event to fire even when the associated input element has the readonly="readonly" property.
	 *
	 * @param ignoreReadonly
	 *
	 * @return
	 */
	public J setIgnoreReadonly(Boolean ignoreReadonly)
	{
		this.ignoreReadonly = ignoreReadonly;
		return (J) this;
	}
	
	/**
	 * Allows the setting of multiple dates.
	 * allowMultidate
	 * <p>
	 * Returns an boolean of options.allowMultidate
	 * allowMultidate, [allowMultidate]
	 * <p>
	 * Takes an boolean.
	 * Throws
	 * <p>
	 * TypeError - if allowMultidate parameter is not an boolean
	 *
	 * @return
	 */
	public Boolean getAllowMultidate()
	{
		return allowMultidate;
	}
	
	/**
	 * Allows the setting of multiple dates.
	 * allowMultidate
	 * <p>
	 * Returns an boolean of options.allowMultidate
	 * allowMultidate, [allowMultidate]
	 * <p>
	 * Takes an boolean.
	 * Throws
	 * <p>
	 * TypeError - if allowMultidate parameter is not an boolean
	 *
	 * @param allowMultidate
	 *
	 * @return
	 */
	public J setAllowMultidate(Boolean allowMultidate)
	{
		this.allowMultidate = allowMultidate;
		return (J) this;
	}
	
	/**
	 * multidateSeparator
	 * <p>
	 * multidateSeparator: ','
	 * <p>
	 * Used with allowMultidate. E.g. 1/1/2017,1/2/2017
	 * multidateSeparator
	 * <p>
	 * Returns an string of options.multidateSeparator
	 * multidateSeparator, [multidateSeparator]
	 * <p>
	 * Takes an string of a valid timezone.
	 *
	 * @return
	 */
	public Character getMultidateSeparator()
	{
		return multidateSeparator;
	}
	
	/**
	 * multidateSeparator
	 * <p>
	 * multidateSeparator: ','
	 * <p>
	 * Used with allowMultidate. E.g. 1/1/2017,1/2/2017
	 * multidateSeparator
	 * <p>
	 * Returns an string of options.multidateSeparator
	 * multidateSeparator, [multidateSeparator]
	 * <p>
	 * Takes an string of a valid timezone.
	 *
	 * @param multidateSeparator
	 *
	 * @return
	 */
	public J setMultidateSeparator(Character multidateSeparator)
	{
		this.multidateSeparator = multidateSeparator;
		return (J) this;
	}
}
