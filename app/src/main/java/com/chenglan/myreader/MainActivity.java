package com.chenglan.myreader;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.view.View;
import android.view.ViewGroup;

import com.chenglan.myreader.base.BaseActivity;
import com.chenglan.myreader.databinding.ActivityMainBinding;
import com.chenglan.myreader.databinding.NavHeaderMainBinding;
import com.chenglan.myreader.utils.CommonResorceUtils;
import com.chenglan.myreader.utils.statusbar.StatusBarUtil;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private ActivityMainBinding mBinding;
    private NavHeaderMainBinding mHeaderBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initStatusView();
        //设置沉浸式状态栏
        StatusBarUtil.setColorNoTranslucentForDrawerLayout(this, mBinding.drawerLayout, CommonResorceUtils
                .getColor(R.color.colorTheme));

        //隐藏悬浮按钮
        mBinding.include.fab.setVisibility(View.GONE);

        initRxBus();
        initContenFragment();
        initDrawerLayout();
        initListener();
    }

    private void initListener() {
        mBinding.include.llTitleMenu.setOnClickListener(this);
        mBinding.include.ivTitleGank.setOnClickListener(this);
        mBinding.include.ivTitleOne.setOnClickListener(this);
        mBinding.include.ivTitleDou.setOnClickListener(this);
        mBinding.include.fab.setOnClickListener(this);

    }

    /**
     * 设置侧滑菜单
     */
    private void initDrawerLayout() {
        mBinding.navView.inflateHeaderView(R.layout.nav_header_main);
        View headerView = mBinding.navView.getHeaderView(0);
        mHeaderBinding = DataBindingUtil.bind(headerView);
        mHeaderBinding.setListener(this);
//        mHeaderBinding.dayNightSwitch.setChecked(SPUtils.getNightMode());


    }

    private void initContenFragment() {

    }

    private void initRxBus() {

    }


    /**
     * 设置状态栏
     */
    private void initStatusView() {
        ViewGroup.LayoutParams layoutParams = mBinding.include.viewStatus.getLayoutParams();
        layoutParams.height = StatusBarUtil.getStatusBarHeight(this);
        mBinding.include.viewStatus.setLayoutParams(layoutParams);
    }

    @Override
    public void onClick(View v) {
         switch(v.getId()) {
             case R.id.ll_title_menu://开启菜单
                 mBinding.drawerLayout.openDrawer(GravityCompat.START);
                 break;
             case R.id.fab:

                 break;
         }
    }
}
