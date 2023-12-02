package vega.odyssey.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FourthFragment : Fragment() {

    private var countries : List<Country> = emptyList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab_new)

        fab.setOnClickListener{
            val bottomSheetDialog = BottomSheetDialog(.context)
            val parentView: View = layoutInflater.inflate(R.layout.bsd_validation_error, null)
            bottomSheetDialog.setContentView(parentView)
            bottomSheetDialog.show()
        }



        var recyclerView = view.findViewById<RecyclerView>(R.id.countriesRecycler)
        initData()

        //lista anchura completa
        val layoutManager = LinearLayoutManager(container?.context)

        //cuadricula 2x2


        val adapter = CountryAdapter(countries)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
        return view

    }

    public fun initData(){
        countries = listOf(
            Country(1, "Mexico", "Ciudad de México", "https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "América"),
            Country(2, "Denmark", "Copenhage","https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "Europe"),
            Country(3, "Finland", "Helsinki", "https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "https://cdn.britannica.com/93/4093-004-A9F95AC3/Flag-Seychelles.jpg", "Europe")
        )
    }


}