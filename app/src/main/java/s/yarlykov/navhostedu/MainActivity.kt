package s.yarlykov.navhostedu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonA.setOnClickListener {
            logIt("${this::class.java.simpleName}: Fragment BackStack entries = ${supportFragmentManager.backStackEntryCount}")
        }

        val someFragment = Fragment4()

        /**
         * В контейнер поверх фрагмента NavHostFragment кладем ещё один фрагмент. Транзакцию
         * добавляет в FragmentBackStack менеджера supportFragmentManager.
         */
        supportFragmentManager
            .beginTransaction()
            .add(R.id.mainContainer, someFragment, "TAG")
            .addToBackStack(null)
            .commit()
    }
}