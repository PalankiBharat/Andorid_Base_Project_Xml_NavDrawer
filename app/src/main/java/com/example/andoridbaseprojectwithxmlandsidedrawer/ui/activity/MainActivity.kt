package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.activity

import android.view.View
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.andoridbaseprojectwithxmlandsidedrawer.R
import com.example.andoridbaseprojectwithxmlandsidedrawer.databinding.ActivityMainBinding
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration:AppBarConfiguration

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        super.initView()

        // ======== Connecting Nav graph to Fragment
        val navHostFrag = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFrag.navController
        setSupportActionBar(binding.toolbar)

        setupDrawerLayout()


        // ======== Hiding and Un-Hiding toolbar and bottom nav according to Destination ========
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment
                -> {
                    binding.toolbar.visibility = View.GONE
                }
                else -> {
                    binding.toolbar.visibility = View.VISIBLE
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()

    }

    private fun setupDrawerLayout() {
        // Place all ids where you want the hamburger icon
         appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.myProfileFragment,
                R.id.shopFragment,
                R.id.menuFragment
            ), binding.drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


}