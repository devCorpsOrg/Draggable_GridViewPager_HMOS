package com.devcorps.testgrid.provider;
import com.devcorps.testgrid.ResourceTable;
import com.devcorps.testgrid.utils.AppUtils;
import ohos.agp.components.*;
import ohos.app.Context;
import java.util.ArrayList;
import java.util.List;

public class PageSliderAdapter extends PageSliderProvider {
    private final List<Component> componentList = new ArrayList<>();
    private static final int GRID_LAYOUT_BORDER_MARGIN = 24;
    private static final int GRID_ITEM_RIGHT_MARGIN = 8;


    public PageSliderAdapter(Context context, List<Component> componentList ) {
        super();
    }

    @Override
    public int getCount() {
        return componentList.size();
    }


    @Override
    public Object createPageInContainer(ComponentContainer componentContainer, int i) {
        return null;
    }

    @Override
    public void destroyPageFromContainer(ComponentContainer componentContainer, int i, Object o) {
        componentContainer.removeComponent((Component) o);
    }

    @Override
    public boolean isPageMatchToObject(Component component, Object o) {
        return false;
    }

    public List<Component> getComponentList() {
        return componentList;
    }
    private int getItemWidthByScreen(Context context) {
        int screenWidth = AppUtils.getScreenInfo(context).getPointXToInt();

        return (screenWidth
                - AttrHelper.vp2px(GRID_LAYOUT_BORDER_MARGIN, context) * 2
                - AttrHelper.vp2px(GRID_ITEM_RIGHT_MARGIN, context) * 3)
                / AppUtils.getIntResource(context, ResourceTable.Integer_column_count);
    }

}
