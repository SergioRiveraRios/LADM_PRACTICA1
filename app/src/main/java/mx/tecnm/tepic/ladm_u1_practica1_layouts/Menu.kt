package mx.tecnm.tepic.ladm_u1_practica1_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        Actividad1.setOnClickListener{
            var Activity1 = Intent(this, MainActivity::class.java)
            startActivity(Activity1)
        }

        Actividad2.setOnClickListener{
            var Activity2 = Intent(this, MainActivity2::class.java)
            startActivity(Activity2)
        }

        Actividad3.setOnClickListener{
            var Activity3 = Intent(this, MainActivity3::class.java)
            startActivity(Activity3)
        }

        Actividad4.setOnClickListener{
            var Activity4 = Intent(this, MainActivity4::class.java)
            startActivity(Activity4)
        }
    }
}