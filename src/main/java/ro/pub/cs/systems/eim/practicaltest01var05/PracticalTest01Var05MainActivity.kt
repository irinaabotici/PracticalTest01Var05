package ro.pub.cs.systems.eim.practicaltest01var05

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var05MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var05_main)
        val top_left_button: Button = findViewById(R.id.top_left_button)
        val top_right_button: Button = findViewById(R.id.top_right_button)
        val bottom_left_button: Button = findViewById(R.id.bottom_left_button)
        val bottom_right_button: Button = findViewById(R.id.bottom_right_button)
        val navigate_button: Button = findViewById(R.id.navigate_button)
        val concatenate_text: EditText = findViewById(R.id.concatenate_text)

        top_left_button.setOnClickListener {
            concatenate_text.setText(concatenate_text.text.toString() + top_left_button.text)
        }

        top_right_button.setOnClickListener {
            concatenate_text.setText(concatenate_text.text.toString() + top_right_button.text)
        }

        bottom_right_button.setOnClickListener {
            concatenate_text.setText(concatenate_text.text.toString() + bottom_right_button.text)
        }

        bottom_left_button.setOnClickListener {
            concatenate_text.setText(concatenate_text.text.toString() + bottom_left_button.text)
        }

        navigate_button.setOnClickListener {
            val intent = Intent(this, PracticalTest01Var05SecondaryActivity::class.java)
            //intent.putExtra("phone", phoneNumberEditText.text.toString())
            //val message = "Additional informations"
            //Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
}
