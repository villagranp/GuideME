package guideme.pvstudio.com.guideme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import guideme.pvstudio.com.guideme.adapters.personaadapter
import guideme.pvstudio.com.guideme.models.persona
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    private lateinit var adapter: personaadapter
    private lateinit var personas: List<persona>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        personas = getPersonas()
        adapter = personaadapter(this, personas)
        listview.adapter = adapter
    }

    private fun getPersonas(): List<persona> {
        return  listOf(
                persona("pablo","villagran",26),
                persona("jose","villagran",26),
                persona("pablo","torres",4),
                persona("jose","torres",4),
                persona("eck","sonda",4),
                persona("jose","pena",4),
                persona("francho","davila",4),
                persona("juan","pablo",4),
                persona("pedro","ismael",4),
                persona("fernando","reynoso",4),
                persona("miguel","angelo",4),
                persona("pablo","villagran",26),
                persona("jose","villagran",26),
                persona("pablo","torres",4),
                persona("jose","torres",4),
                persona("eck","sonda",4),
                persona("jose","pena",4),
                persona("francho","davila",4),
                persona("juan","pablo",4),
                persona("pedro","ismael",4),
                persona("fernando","reynoso",4),
                persona("miguel","angelo",4),
                persona("pablo","villagran",26),
                persona("jose","villagran",26),
                persona("pablo","torres",4),
                persona("jose","torres",4),
                persona("eck","sonda",4),
                persona("jose","pena",4),
                persona("francho","davila",4),
                persona("juan","pablo",4),
                persona("pedro","ismael",4),
                persona("fernando","reynoso",4),
                persona("miguel","angelo",4)
        )

    }
}
