/*
 * Copyright (C) 2017 GedMarc
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

package com.jwebmp.plugins.toastr;

import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class ToastrOptionsTest
{

	public ToastrOptionsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		ToastrOptions to = new ToastrOptions();
		System.out.println(to.toString());
	}

	@Test
	public void testSomeMethod2()
	{
		//ToastrFeature to = new ToastrFeature(ToastrType.Info, "message", null);
		ToastrFeature to = new ToastrFeature("Message");
		to.getOptions()
		  .setDebug(true);
		to.getOptions()
		  .setShowMethod(JQEasingEffects.fadeIn);
		System.out.println(to.renderJavascript());

		Assertions.assertEquals(
				"toastr.options = {\n" +
				"  \"closeButton\" : false,\n" +
				"  \"debug\" : true,\n" +
				"  \"newestOnTop\" : true,\n" +
				"  \"progressBar\" : false,\n" +
				"  \"positionClass\" : \"toast-top-right\",\n" +
				"  \"preventDuplicates\" : false,\n" +
				"  \"showDuration\" : \"300\",\n" +
				"  \"hideDuration\" : \"1000\",\n" +
				"  \"timeOut\" : \"5000\",\n" +
				"  \"extendedTimeOut\" : \"1000\",\n" +
				"  \"showEasing\" : \"swing\",\n" +
				"  \"hideEasing\" : \"linear\",\n" +
				"  \"showMethod\" : \"fadeIn\",\n" +
				"  \"hideMethod\" : \"fadeOut\",\n" +
				"  \"escapeHtml\" : false\n" +
				"};toastr['info']('Message');",
				to.renderJavascript()
				  .toString());
	}

	@Test
	public void testTitleMessage()
	{
		//ToastrFeature to = new ToastrFeature(ToastrType.Info, "message", null);
		ToastrFeature to = new ToastrFeature(ToastrType.Error, "Title Test", "Message");
		to.getOptions()
		  .setDebug(true);
		to.getOptions()
		  .setShowMethod(JQEasingEffects.easeOutSine);
		System.out.println(to.renderJavascript());

		Assertions.assertEquals(
				"toastr.options = {\n" +
				"  \"closeButton\" : false,\n" +
				"  \"debug\" : true,\n" +
				"  \"newestOnTop\" : true,\n" +
				"  \"progressBar\" : false,\n" +
				"  \"positionClass\" : \"toast-top-right\",\n" +
				"  \"preventDuplicates\" : false,\n" +
				"  \"showDuration\" : \"300\",\n" +
				"  \"hideDuration\" : \"1000\",\n" +
				"  \"timeOut\" : \"5000\",\n" +
				"  \"extendedTimeOut\" : \"1000\",\n" +
				"  \"showEasing\" : \"swing\",\n" +
				"  \"hideEasing\" : \"linear\",\n" +
				"  \"showMethod\" : \"easeOutSine\",\n" +
				"  \"hideMethod\" : \"fadeOut\",\n" +
				"  \"escapeHtml\" : false\n" +
				"};toastr['error']('Message','Title Test');",
				to.renderJavascript()
				  .toString());
	}

	@Test
	public void testSomeMethod3()
	{
		ToastrFeature to = new ToastrFeature();
		System.out.println(to.renderJavascript());

		Assertions.assertEquals(
				"toastr.options = {\n" +
				"  \"closeButton\" : false,\n" +
				"  \"debug\" : false,\n" +
				"  \"newestOnTop\" : true,\n" +
				"  \"progressBar\" : false,\n" +
				"  \"positionClass\" : \"toast-top-right\",\n" +
				"  \"preventDuplicates\" : false,\n" +
				"  \"showDuration\" : \"300\",\n" +
				"  \"hideDuration\" : \"1000\",\n" +
				"  \"timeOut\" : \"5000\",\n" +
				"  \"extendedTimeOut\" : \"1000\",\n" +
				"  \"showEasing\" : \"swing\",\n" +
				"  \"hideEasing\" : \"linear\",\n" +
				"  \"showMethod\" : \"fadeIn\",\n" +
				"  \"hideMethod\" : \"fadeOut\",\n" +
				"  \"escapeHtml\" : false\n" +
				"};toastr['info']('');",
				to.renderJavascript()
				  .toString());
	}
}
