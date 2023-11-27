package vega.odyssey.utilidades

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CountryAdapter(private var countries: List<Country>): RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val compresor = LayoutInflater.from(parent.context)
        return CountryViewHolder(compresor.inflate(R.layout.item_country, parent, false))
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.render(countries[position])
        //aqui va la logica. ej onclicklistener
    }

    override fun getItemCount(): Int {
        return countries.size
    }
    class CountryViewHolder(view: View): RecyclerView.ViewHolder(view){
        val name: TextView = itemView.findViewById(R.id.country_name)
        val capital: TextView = itemView.findViewById(R.id.country_capital)
        val continent: TextView = itemView.findViewById(R.id.country_continent)
        val flag: ImageView = itemView.findViewById(R.id.poke_flag)
        val image: ImageView = itemView.findViewById(R.id.poke_image)


        fun render(country: Country){
            name.text = country.name
            capital.text = country.capital
            continent.text = country.continent
            Picasso.get().load(country.flag).into(flag)
            Picasso.get().load(country.image).into(image)
        }
    }
}