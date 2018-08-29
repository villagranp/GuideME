package guideme.pvstudio.com.guideme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_events.*

class Events : AppCompatActivity(), View.OnLongClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)
        inLineButtonEvent()
        buttonMulti1.setOnLongClickListener(this)
        buttonMulti2.setOnLongClickListener(this)
        buttonMulti3.setOnLongClickListener(this)
    }

    fun xmlButtonEvent(view: View) {
        Toast.makeText(this, "Click XML function", Toast.LENGTH_LONG).show()
    }

    private fun inLineButtonEvent() {
        val btnInLine = buttonInLine
        btnInLine.setOnClickListener { Toast.makeText(this, "Click In Line Function", Toast.LENGTH_LONG).show() }

    }

    private fun multiButtonEvent(){

    }

    override fun onLongClick(view : View): Boolean {
        when (view.id){
            R.id.buttonMulti1 -> {
                Toast.makeText(this, "Click Multi 1 Function", Toast.LENGTH_LONG).show()
            }
            R.id.buttonMulti2 -> {
                Toast.makeText(this, "Click Multi 2 Function", Toast.LENGTH_LONG).show()
            }
            R.id.buttonMulti3 -> {
                Toast.makeText(this, "Click Multi 3 Function", Toast.LENGTH_LONG).show()
            }
        }
        return true
    }

}
