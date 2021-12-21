package com.devcorps.testgrid.slice;
import com.devcorps.testgrid.ResourceTable;
import com.devcorps.testgrid.component.DragLayout;
import com.devcorps.testgrid.component.Fragment;
import com.devcorps.testgrid.provider.PageSliderAdapter;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;

import java.util.ArrayList;


/**
 * MainAbility slice
 */
public class MainAbilitySlice extends AbilitySlice implements PageSlider.PageChangedListener {
     Button btn, btn1;
    private PageSlider mPageSlider;
    private PageSliderAdapter pageSliderAdapter;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        DragLayout layout = new DragLayout(this);
        layout.initGridView();
        btn = (Button) findComponentById(ResourceTable.Id_bottom_left_button);
        btn1 = (Button) findComponentById(ResourceTable.Id_bottom_right_button);

        mPageSlider = (PageSlider) findComponentById(ResourceTable.Id_page_slider);
        mPageSlider.setProvider(pageSliderAdapter);
        mPageSlider.addPageChangedListener(new MyPageChangedListener());

        initComponent();


    }

    private void initComponent() {
        fragmentList = new ArrayList<Fragment>();
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onPageSliding(int i, float v, int i1) {

    }

    @Override
    public void onPageSlideStateChanged(int i) {

    }

    @Override
    public void onPageChosen(int i) {

    }

    private class MyPageChangedListener implements PageSlider.PageChangedListener {
        @Override
        public void onPageSliding(int i, float v, int i1) {

        }

        @Override
        public void onPageSlideStateChanged(int i) {

        }

        @Override
        public void onPageChosen(int i) {

        }
    }
}
