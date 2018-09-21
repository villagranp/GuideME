package guideme.pvstudio.com.guideme.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import guideme.pvstudio.com.guideme.R
import guideme.pvstudio.com.guideme.models.persona
import kotlinx.android.synthetic.main.lv_person.view.*

class personaadapter(val context: Context, val list: List<persona>) : BaseAdapter() {
    private val miInflator: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: PersonaViewHolder
        if (convertView == null) {
            view = miInflator.inflate(R.layout.lv_person, parent, false)
            vh = PersonaViewHolder(view)
            view.tag = vh
        } else {
            view = convertView
            vh = view.tag as PersonaViewHolder
        }
        val fullname = "${list[position].firstname} ${list[position].lastname}"
        vh.nombrecompleto.text = fullname
        vh.edad.text = "${list[position].age} Y.O."

        return view
    }

    override fun getItem(position: Int): Any {

        return list[position]
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

}

private class PersonaViewHolder(view: View) {
    val nombrecompleto: TextView = view.txName
    val edad: TextView = view.txAge
}