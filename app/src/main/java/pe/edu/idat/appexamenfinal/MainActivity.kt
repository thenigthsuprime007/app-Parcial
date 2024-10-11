package pe.edu.idat.appexamenfinal

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.idat.appexamenfinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {



    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.button.setOnClickListener(this)
        }

    //evento click
    //implementar la interfaz

    override fun onClick(p0: View?) {
        val numero1=binding.editTextText.text.toString().toInt()

        val total= numero1*10
        binding.textView.setText("total a pagar es $total")
    }

}