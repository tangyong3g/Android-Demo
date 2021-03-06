package com.graphics.enginedemo;

import java.util.ArrayList;

import com.sny.tangyong.common.view.BaseListActivity;
import com.sny.tangyong.common.view.ItemComponentInfo;

import android.os.Bundle;

public class MainActivity extends BaseListActivity {

    public MainActivity() {
        initListItems();
    }

    public void initListItems() {

        mItemsInfo = new ArrayList<ItemComponentInfo>();

        ItemComponentInfo info;

//        info = new ItemComponentInfo("Test", GoLauncher3DTestActivity.class);
//        mItemsInfo.add(info);

        info = new ItemComponentInfo("GraphicsEngine", Main.class);
        mItemsInfo.add(info);

        info = new ItemComponentInfo("InterpolaterTest", InterpolaterTestActivity.class);
        mItemsInfo.add(info);


        initDisplayList();
    }


    private void initDisplayList() {
        if (mItemsInfo != null && mItemsInfo.size() > 0) {
            mUnits = new String[mItemsInfo.size()];

            for (int i = 0; i < mItemsInfo.size(); i++) {
                mUnits[i] = mItemsInfo.get(i).mDisplayName;
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getActionBar();
    }

}
