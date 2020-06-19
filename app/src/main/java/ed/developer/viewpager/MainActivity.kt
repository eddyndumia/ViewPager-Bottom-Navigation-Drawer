package ed.developer.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    private lateinit var myViewPager: ViewPager
    private lateinit var iconHome: ImageButton
    private lateinit var iconSearch: ImageButton
    private lateinit var iconAdd: ImageButton
    private lateinit var iconNotifications: ImageButton
    private lateinit var iconProfile: ImageButton
    private lateinit var pagerAdapter: PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewPager = findViewById(R.id.myViewPager)
        iconHome = findViewById(R.id.iconHome)
        iconSearch = findViewById(R.id.iconSearch)
        iconAdd = findViewById(R.id.iconAdd)
        iconNotifications = findViewById(R.id.iconNotifications)
        iconProfile = findViewById(R.id.iconProfile)

        pagerAdapter = ed.developer.viewpager.adapter.PagerAdapter(supportFragmentManager)
        myViewPager.adapter = pagerAdapter
        myViewPager.offscreenPageLimit = 5

        //set the current page to home
        myViewPager.currentItem = 0
        iconHome.setImageResource(R.drawable.ic_home_pink)

        iconHome.setOnClickListener {
            myViewPager.currentItem = 0
        }
        iconSearch.setOnClickListener(){
            myViewPager.currentItem = 1
        }
        iconAdd.setOnClickListener(){
            myViewPager.currentItem = 2
        }
        iconNotifications.setOnClickListener {
            myViewPager.currentItem = 3
        }
        iconProfile.setOnClickListener {
            myViewPager.currentItem = 4
        }
        //setup OnPage change listeners
        myViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                onTabChange(position)
            }

            private fun onTabChange(position: Int) {
                if (position == 0) {
                    iconHome.setImageResource(R.drawable.ic_home_pink)
                    iconSearch.setImageResource(R.drawable.ic_search_black)
                    iconAdd.setImageResource(R.drawable.ic_add_black)
                    iconNotifications.setImageResource(R.drawable.ic_notifications_black)
                    iconProfile.setImageResource(R.drawable.ic_person_outline_black)
                }
                if (position == 1) {
                    iconHome.setImageResource(R.drawable.ic_home_black)
                    iconSearch.setImageResource(R.drawable.ic_search_pink)
                    iconAdd.setImageResource(R.drawable.ic_add_black)
                    iconNotifications.setImageResource(R.drawable.ic_notifications_black)
                    iconProfile.setImageResource(R.drawable.ic_person_outline_black)
                }
                if (position == 2) {
                    iconHome.setImageResource(R.drawable.ic_home_black)
                    iconSearch.setImageResource(R.drawable.ic_search_black)
                    iconAdd.setImageResource(R.drawable.ic_add_pink)
                    iconNotifications.setImageResource(R.drawable.ic_notifications_black)
                    iconProfile.setImageResource(R.drawable.ic_person_outline_black)
                }
                if (position == 3) {
                    iconHome.setImageResource(R.drawable.ic_home_black)
                    iconSearch.setImageResource(R.drawable.ic_search_black)
                    iconAdd.setImageResource(R.drawable.ic_add_black)
                    iconNotifications.setImageResource(R.drawable.ic_notifications_pink)
                    iconProfile.setImageResource(R.drawable.ic_person_outline_black)
                }
                if (position == 4) {
                    iconHome.setImageResource(R.drawable.ic_home_black)
                    iconSearch.setImageResource(R.drawable.ic_search_black)
                    iconAdd.setImageResource(R.drawable.ic_add_black)
                    iconNotifications.setImageResource(R.drawable.ic_notifications_black)
                    iconProfile.setImageResource(R.drawable.ic_person_outline_pink)
                }

            }
        })
    }
}
