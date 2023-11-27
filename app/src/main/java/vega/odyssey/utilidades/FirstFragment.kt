package vega.odyssey.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first,
            container, false)
        val button = view.findViewById<Button>(R.id.button1)
        val receivedData = ""
        val button5 = view.findViewById<Button>(R.id.button5)

        if(receivedData.isNotEmpty()) {

        }

        button.setOnClickListener{
            val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }

        button5.setOnClickListener{
            val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_firstFragment_to_fourthFragment)
        }
        return view
    }


}