package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.FragmentProfileBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_profile
    }

    override fun initView() {
        super.initView()

    }


}