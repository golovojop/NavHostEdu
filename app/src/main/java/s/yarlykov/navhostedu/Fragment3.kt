package s.yarlykov.navhostedu

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_3.*

class Fragment3 : Fragment(R.layout.fragment_3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView3.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            logIt("${this::class.java.simpleName}: Fragment Stack Entries = ${fragmentManager.backStackEntryCount}")
            logIt("${this::class.java.simpleName}: NavBackStack Entries = ${findNavController().backStack.size}")
            findNavController().navigate(R.id.nav_fragment_1)
        }
    }
}