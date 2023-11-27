package vega.odyssey.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val view2 = inflater.inflate(R.layout.fragment_second,
            container, false)
        val button2 = view2.findViewById<Button>(R.id.button2)
        val button3 = view2.findViewById<Button>(R.id.button3)

        button2.setOnClickListener{
            val navController2 : NavController = Navigation.findNavController(view2)
            navController2.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        button3.setOnClickListener{
            val navController2 : NavController = Navigation.findNavController(view2)
            navController2.navigate(R.id.action_secondFragment_to_firstFragment)
        }
        // Inflate the layout for this fragment
        return view2
    }
}