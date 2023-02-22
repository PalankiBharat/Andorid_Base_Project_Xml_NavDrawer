package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.FragmentSplashBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_splash
    }

    override fun initView() {
        super.initView()
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            delay(2000)
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
        }
    }


}