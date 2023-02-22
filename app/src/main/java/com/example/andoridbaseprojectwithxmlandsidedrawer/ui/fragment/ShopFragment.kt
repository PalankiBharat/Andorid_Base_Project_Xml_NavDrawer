package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.FragmentShopBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShopFragment : BaseFragment<FragmentShopBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_shop
    }

    override fun initView() {
        super.initView()

    }


}