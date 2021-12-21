package com.devcorps.testgrid.component;

import ohos.aafwk.ability.AbilitySlice;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;

public abstract class Fragment {

    private String TAG = getClass().getSimpleName();
    private AbilitySlice abilitySlice;

    public Fragment(AbilitySlice abilitySlice) {
        this.abilitySlice = abilitySlice;
    }

    public abstract Component createUIContent(ComponentContainer componentContainer);

    public AbilitySlice getAbilitySlice() {
        return abilitySlice;
    }

    public String getTitle() {
        return TAG;
    }


}
