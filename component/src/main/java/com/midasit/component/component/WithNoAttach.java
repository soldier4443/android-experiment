package com.midasit.component.component;

import com.midasit.component.R;
import com.midasit.component.core.UIComponent;

/**
 * Created by nyh0111 on 2018-04-03.
 */

public class WithNoAttach implements UIComponent {
    @Override
    public String name() {
        return "showTextOnButton";
    }
    
    @Override
    public int bindingViewGroupId() {
        return R.id.universal_container;
    }
    
    @Override
    public int resourceId() {
        return R.layout.layout_show_text_on_button_click;
    }
    
    @Override
    public boolean attachToRoot() {
        return false;
    }
}
