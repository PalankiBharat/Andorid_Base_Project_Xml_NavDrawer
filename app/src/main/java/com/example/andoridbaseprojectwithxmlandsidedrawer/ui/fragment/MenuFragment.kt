package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.FragmentMenuBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MenuFragment : BaseFragment<FragmentMenuBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_menu
    }

    override fun initView() {
        super.initView()

    }


}