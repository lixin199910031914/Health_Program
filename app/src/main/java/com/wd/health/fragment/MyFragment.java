package com.wd.health.fragment;

import com.wd.health.R;
import com.wd.health.base.BaseFragment;
import com.wd.health.base.BasePresenter;

public class MyFragment extends BaseFragment {
    @Override
    protected BasePresenter providePresenter() {
        return null;
    }

    @Override
    protected int provideLayoutId() {
        return R.layout.my_fragment;
    }
}
