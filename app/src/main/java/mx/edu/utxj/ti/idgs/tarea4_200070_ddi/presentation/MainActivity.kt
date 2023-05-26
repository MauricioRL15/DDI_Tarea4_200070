/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package mx.edu.utxj.ti.idgs.tarea4_200070_ddi.presentation

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import mx.edu.utxj.ti.idgs.tarea4_200070_ddi.R


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: ScreenPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        pagerAdapter = ScreenPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
        //viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        //viewPager.rotation = 270.0f
    }

    inner class ScreenPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getCount(): Int {
            return 3
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> Vista1_Fragment()
                1 -> Vista2_Fragment()
                2 -> Vista3_Fragment()
                else -> Vista1_Fragment()
            }
        }
    }
}