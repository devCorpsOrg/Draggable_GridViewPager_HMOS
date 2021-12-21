package com.devcorps.testgrid.model;


import ohos.agp.colors.RgbColor;

/**
 * Grid item model
 */
public class GridItemInfo{
    public  String mItemText;
    public  int mIconId;
    public String content;
    public  String mTag;

    public GridItemInfo(String itemText, int iconId, String tag) {
        mItemText = itemText;
        mIconId = iconId;
        mTag = tag;
    }


    public String getContent() {
        return content;
    }

    public String getItemText() {
        return mItemText;
    }

    public int getIconId() {
        return mIconId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return mTag;
    }


}
