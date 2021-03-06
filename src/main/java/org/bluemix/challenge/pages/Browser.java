package org.bluemix.challenge.pages;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { … }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Browser extends VerticalLayout
{
	protected CssLayout header_bar;
	protected NativeButton btnHome;
	protected Label lblHome;
	protected HorizontalLayout main_area;
	protected CssLayout side_bar;
	protected NativeButton mnuCustomers;
	protected NativeButton mnuDetails;
	protected NativeButton mnuSex;
	protected NativeButton mnuOther;
	protected NativeButton mnuLogout;
	protected Panel scroll_panel;

	public Browser()
	{
		Design.read(this);
	}
}
