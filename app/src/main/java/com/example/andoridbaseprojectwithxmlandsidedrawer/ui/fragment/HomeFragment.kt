package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.FragmentHomeBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {
        super.initView()
    }


}