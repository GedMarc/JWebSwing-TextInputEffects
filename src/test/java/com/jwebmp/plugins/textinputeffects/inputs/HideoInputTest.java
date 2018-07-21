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

package com.jwebmp.plugins.textinputeffects.inputs;

import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.plugins.textinputeffects.inputs.set1.HideoInput;
import org.junit.jupiter.api.Test;

class HideoInputTest
{
	@Test
	public void testHideo()
	{
		HideoInput hi = new HideoInput(new InputTextType(), new Label(), new Span("content"), "fa fa-awesome");
		System.out.println(hi.toString(0));
		System.out.println(hi.getIcon());
	}
}
