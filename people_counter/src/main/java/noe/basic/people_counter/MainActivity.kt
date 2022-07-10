package noe.basic.people_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCounterK = findViewById<Button>(R.id.btn_counter)
        //Si deseas llamar algun elemento estatico de la clase View usa esta forma
        btnCounterK.setOnClickListener(
            View.OnClickListener {
                Log.w(this.localClassName,"recurriendo al metodo estatico de View")
            }
        )
        //si no
        btnCounterK.setOnClickListener {
            Log.w(this.localClassName,"sin recurrir a metodo estatico de View")
        }


    }
}