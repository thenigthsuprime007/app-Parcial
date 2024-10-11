package pe.edu.idat.appexamenfinal

import android.os.Bundle
<<<<<<< HEAD
import android.view.View
import android.view.inputmethod.InputBinding
=======
<<<<<<< HEAD
import android.view.View
import android.view.inputmethod.InputBinding
=======
>>>>>>> 5654791ad101868e1bab9ddcb29b8675bdc932fe
>>>>>>> 84f1aa6d3ecd7f3158faaf05872b5a71a31b009d
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 84f1aa6d3ecd7f3158faaf05872b5a71a31b009d
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
<<<<<<< HEAD
        if (numero1>=5){
            val total=numero1*2
            binding.textView.setText("total a pagar es $total")
        }else{
            val total= (numero1*10)+(numero1*2)
            binding.textView.setText("total a pagar es $total")
        }


    }

=======

        val total= numero1*10
        binding.textView.setText("total a pagar es $total")
    }

=======

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
>>>>>>> 5654791ad101868e1bab9ddcb29b8675bdc932fe
>>>>>>> 84f1aa6d3ecd7f3158faaf05872b5a71a31b009d
}