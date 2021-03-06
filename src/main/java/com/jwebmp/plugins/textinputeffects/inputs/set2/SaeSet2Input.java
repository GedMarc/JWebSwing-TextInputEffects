package com.jwebmp.plugins.textinputeffects.inputs.set2;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Creates a haruki input style
 */
@ComponentInformation(name = "Sae Input Effect",
		description = "A very nice effect for inputs",
		url = "https://tympanus.net/Development/TextInputEffects/index2.html")
public class SaeSet2Input
		extends Set2InputEffect<SaeSet2Input>
{

	private String icon;

	/**
	 * Creates a new haruki styled input
	 *
	 * @param input
	 * @param label
	 * @param content
	 */
	public SaeSet2Input(Input input, Label label, Span content)
	{
		super("sae", input, label, content);
	}

	/**
	 * Gets the icon in the box
	 *
	 * @return
	 */
	public String getIcon()
	{
		return icon;
	}

	/**
	 * Sets the icon in the box
	 *
	 * @param icon
	 *
	 * @return
	 */
	public SaeSet2Input setIcon(String icon)
	{
		this.icon = icon;
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void init()
	{
		if (!isInitialized() && getLabel() != null)
		{
			Italic<?> i = new Italic();
			i.addClass(icon);
			i.addClass("icon icon--sae");
			getLabel().add(i);
		}
		super.init();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
