package com.ciremaivalley.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.ciremaivalley.ui.views.orderedit.OrderEditor;

public class ReviewEvent extends ComponentEvent<OrderEditor> {

	public ReviewEvent(OrderEditor component) {
		super(component, false);
	}
}