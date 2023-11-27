package vega.odyssey.utilidades

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomsheet.BottomSheetDialog

class ThirdFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view3 = inflater.inflate(R.layout.fragment_third,
            container, false)
        val button4 = view3.findViewById<Button>(R.id.button4)

        val name = view3.findViewById<EditText>(R.id.name)

        button4.setOnClickListener {

            if(name.text.isNotEmpty()){
                val navController3: NavController = Navigation.findNavController(view3)
                navController3.navigate(R.id.action_thirdFragment_to_firstFragment)
            }
            else{
                val bottomSheetDialog = BottomSheetDialog(view3.context)
                val parentView: View = layoutInflater.inflate(R.layout.bsd_validation_error, null)
                bottomSheetDialog.setContentView(parentView)
                bottomSheetDialog.show()
            }
        }
        // Inflate the layout for this fragment
        return view3
    }
}