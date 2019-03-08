package limbog.app.calball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.String.format
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    val formatDecimalToString = DecimalFormat("0")

    var editTextC1_2_val = 0
    var editTextC1_3_val = 0
    var editTextC1_3_2_val = 0
    var editTextC1_4_val = 0
    var editTextC1_5_val = 0.0
    var editTextC1_6_val = 0.0
    var editTextC1_7_val = 0.0
    var editTextC2_2_val = 0.0
    var editTextC2_3_val = 0
    var editTextC2_3_2_val = 0
    var editTextC2_5_val = 0.0
    var editTextC3_2_val = 0
    var editTextC3_4_val = 0
    var editTextC3_6_val = 0.0
    var editTextC3_7_val = 0.0
    var editTextC1_7_S_val = 0
    var editTextC_test = 0.0
    var editTextC_test2 = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
            this.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                }

                override fun afterTextChanged(editable: Editable?) {
                    afterTextChanged.invoke(editable.toString())
                }
            })
        }

        fun sumAll(){

            if(editTextC1_2.text.length != 0) {
                 editTextC1_2_val = editTextC1_2.text.toString().toInt()
            }

            if(editTextC1_3.text.length != 0) {
                 editTextC1_3_val = editTextC1_3.text.toString().toInt()
            }else{
                editTextC1_3_val = 0
            }

            if(editTextC1_3_2.text.length != 0) {
                editTextC1_3_2_val = editTextC1_3_2.text.toString().toInt()
            }else{
                editTextC1_3_2_val = 0
            }

            if(editTextC1_4.text.length != 0) {
                 editTextC1_4_val = editTextC1_4.text.toString().toInt()
            }

            if(editTextC1_5.text.length != 0) {
                 editTextC1_5_val = editTextC1_5.text.toString().toDouble()
            }

            if(editTextC1_6.text.length != 0) {
                 editTextC1_6_val = editTextC1_6.text.toString().toDouble()
            }

            if(editTextC1_7.text.length != 0) {
                editTextC1_7_val = editTextC1_7.text.toString().toDouble()
            }

            if(editTextC2_2.text.length != 0) {
                editTextC2_2_val = editTextC2_2.text.toString().toDouble()
            }

            if(editTextC2_3.text.length != 0) {
                 editTextC2_3_val = editTextC2_3.text.toString().toInt()
            }else{
                editTextC2_3_val = 0
            }

            if(editTextC2_3_2.text.length != 0) {
                editTextC2_3_2_val = editTextC2_3_2.text.toString().toInt()
            }else{
                editTextC2_3_2_val = 0
            }

            if(editTextC2_5.text.length != 0) {
                 editTextC2_5_val = editTextC2_5.text.toString().toDouble()
            }

            if(editTextC3_2.text.length != 0) {
                 editTextC3_2_val = editTextC3_2.text.toString().toInt()
            }

            if(editTextC3_4.text.length != 0) {
                editTextC3_4_val = editTextC3_4.text.toString().toInt()
            }

            if(editTextC3_6.text.length != 0) {
                editTextC3_6_val = editTextC3_6.text.toString().toDouble()
            }

            if(editTextC3_7.text.length != 0) {
                editTextC3_7_val = editTextC3_7.text.toString().toDouble()
            }

            if(editTextC1_7_S.text.length != 0) {
                editTextC1_7_S_val = editTextC1_7_S.text.toString().toInt()
            }


            if(editTextC1_2_val != 0 && editTextC1_3_val != 0) {

                if(editTextC1_3_2_val != 0) {

                    editTextC1_4_val = (editTextC1_2_val + ((editTextC1_2_val * editTextC1_3_val) / 100)) + editTextC1_3_2_val

                }else{
                    editTextC1_4_val = editTextC1_2_val + ((editTextC1_2_val * editTextC1_3_val) / 100)

                }

                editTextC1_4.text = (editTextC1_4_val).toString()

                //editTextC1_4_val = editTextC1_2_val + ((editTextC1_2_val * editTextC1_3_val) / 100)

                Log.i("editTextC1_2_val", editTextC1_2_val.toString())
                Log.i("editTextC1_3_val", editTextC1_3_val.toString())
                Log.i("editTextC1_3_2_val", editTextC1_3_2_val.toString())

                Log.i("----editTextC1_4_val", editTextC1_4_val.toString())

            }else if(editTextC1_2_val != 0 && editTextC1_3_val == 0){

                if(editTextC1_3_2_val != 0) {

                    editTextC1_4_val = editTextC1_2_val + editTextC1_3_2_val

                }else{
                    editTextC1_4_val = editTextC1_2_val

                }
                editTextC1_4.text = (editTextC1_4_val).toString()
            }


            if(editTextC1_4_val != 0 && editTextC1_5_val != 0.0) {

                editTextC1_6_val = (editTextC1_4_val * editTextC1_5_val) + editTextC1_4_val

                editTextC1_6.text = formatDecimalToString.format(editTextC1_6_val).toString()


                Log.i("editTextC1_4_val", editTextC1_4_val.toString())
                Log.i("editTextC1_5_val", editTextC1_5_val.toString())

                Log.i("----editTextC1_6_val", editTextC1_6_val.toString())
            }

            if(checkBoxDis.isChecked){
                if(editTextC1_6_val != 0.0 && editTextC1_3_val != 0 && editTextC1_2_val != 0) {

                    editTextC1_6_val = editTextC1_6_val - ((editTextC1_2_val * editTextC1_3_val) / 100)

                    editTextC1_6.text = formatDecimalToString.format(editTextC1_6_val).toString()

                    Log.i("-----77777777777", editTextC1_6_val.toString())
                }

                Log.i("-----cccccccccccccccc", "cccccccccccccccccccc")
            }

            if(checkBoxDis2.isChecked){
                if(editTextC3_6_val != 0.0 && editTextC2_3_val != 0 && editTextC3_2_val != 0) {

                    editTextC3_6_val = editTextC3_6_val - ((editTextC3_2_val * editTextC2_3_val) / 100)

                    editTextC3_6.text = formatDecimalToString.format(editTextC3_6_val).toString()

                }
            }

            if(editTextC1_6_val != 0.0 && editTextC1_2_val != 0 && editTextC3_2_val != 0) {

                editTextC1_7_val = editTextC1_6_val - (editTextC1_2_val + editTextC3_2_val)

                editTextC1_7.text = formatDecimalToString.format(editTextC1_7_val).toString()

                Log.i("editTextC1_6_val", editTextC1_6_val.toString())
                Log.i("editTextC1_2_val", editTextC1_2_val.toString())
                Log.i("editTextC3_2_val", editTextC3_2_val.toString())

                Log.i("-----editTextC1_7_val", editTextC1_7_val.toString())
            }


            if(editTextC1_6_val != 0.0 && editTextC2_5_val != 0.0 && editTextC2_3_val != 0 && editTextC2_3_2_val != 0) {

                if(checkBoxDis2.isChecked) {
                    editTextC_test = (((editTextC1_6_val + ((((editTextC1_6_val / (editTextC2_5_val + 1)) - editTextC2_3_2_val) * editTextC2_3_val) / 100)) / (editTextC2_5_val + 1)) - editTextC2_3_2_val)

                    editTextC2_2_val =  (((editTextC1_6_val + ((((editTextC1_6_val / (editTextC2_5_val + 1)) - editTextC2_3_2_val) * editTextC2_3_val) / 100)) / (editTextC2_5_val + 1)) - editTextC2_3_2_val) - ((((editTextC1_6_val / (editTextC2_5_val + 1)) - editTextC2_3_2_val) * editTextC2_3_val) / 100)
                }else{
                    editTextC2_2_val = ((editTextC1_6_val / (editTextC2_5_val + 1)) - editTextC2_3_2_val) - (((editTextC1_6_val / (editTextC2_5_val+ 1)) * editTextC2_3_val) / 100)

                }

                editTextC2_2.text = formatDecimalToString.format(editTextC2_2_val).toString()


                Log.i("editTextC1_6_val", editTextC1_6_val.toString())
                Log.i("editTextC2_5_val", editTextC2_5_val.toString())
                Log.i("testtesttesttesttest", editTextC_test.toString())

                Log.i("-----editTextC2_2_val", editTextC2_2_val.toString())
                Log.i("editTextC1_6_val", editTextC1_6_val.toString())


            }else if(editTextC1_6_val != 0.0 && editTextC2_5_val != 0.0 && editTextC2_3_val != 0 && editTextC2_3_2_val == 0){

                if(checkBoxDis2.isChecked) {

                    editTextC_test = ((editTextC1_6_val + (((editTextC1_6_val / (editTextC2_5_val + 1)) * editTextC2_3_val) / 100)) / (editTextC2_5_val + 1))
                    editTextC_test2 = (((editTextC1_6_val / (editTextC2_5_val + 1)) * editTextC2_3_val) / 100)

                    editTextC2_2_val =  ((editTextC1_6_val + (((editTextC1_6_val / (editTextC2_5_val + 1)) * editTextC2_3_val) / 100)) / (editTextC2_5_val + 1)) - (((editTextC1_6_val / (editTextC2_5_val + 1)) * editTextC2_3_val) / 100)
                }else{
                    editTextC2_2_val = (editTextC1_6_val / (editTextC2_5_val + 1)) - (((editTextC1_6_val / (editTextC2_5_val+ 1)) * editTextC2_3_val) / 100)
                }

                Log.i("testtesttesttesttest", editTextC_test.toString())
                Log.i("testtesttesttesttest2", editTextC_test2.toString())
                editTextC2_2.text = formatDecimalToString.format(editTextC2_2_val).toString()

            }else if(editTextC1_6_val != 0.0 && editTextC2_5_val != 0.0 && editTextC2_3_val == 0 && editTextC2_3_2_val != 0){

                    editTextC2_2_val = (editTextC1_6_val / (editTextC2_5_val + 1)) - editTextC2_3_2_val

                editTextC2_2.text = formatDecimalToString.format(editTextC2_2_val).toString()

            }else if(editTextC1_6_val != 0.0 && editTextC2_5_val != 0.0 && editTextC2_3_val == 0 && editTextC2_3_2_val == 0){

                editTextC2_2_val = editTextC1_6_val / (editTextC2_5_val + 1)

                editTextC2_2.text = formatDecimalToString.format(editTextC2_2_val).toString()

            }

            if(editTextC3_2_val != 0 && editTextC2_3_val != 0) {

                if(editTextC2_3_2_val != 0) {

                    editTextC3_4_val = (editTextC3_2_val + ((editTextC3_2_val * editTextC2_3_val) / 100)) + editTextC2_3_2_val

                }else{
                    editTextC3_4_val = editTextC3_2_val + ((editTextC3_2_val * editTextC2_3_val) / 100)
                }

                editTextC3_4.text = (editTextC3_4_val).toString()

                Log.i("-----editTextC3_4_val", editTextC3_4_val.toString())
            }else if(editTextC3_2_val != 0 && editTextC2_3_val == 0){

                if(editTextC2_3_2_val != 0) {

                    editTextC3_4_val = editTextC3_2_val + editTextC2_3_2_val

                }else{
                    editTextC3_4_val = editTextC3_2_val
                }

                editTextC3_4.text = (editTextC3_4_val).toString()

                Log.i("-----editTextC3_4_val", editTextC3_4_val.toString())
            }

            if(editTextC3_2_val != 0 && editTextC1_2_val != 0) {

                editTextC1_7_S_val = editTextC3_2_val + editTextC1_2_val

                editTextC1_7_S.text = (editTextC1_7_S_val).toString()

                Log.i("-----editTextC1_7_S_val", editTextC1_7_S_val.toString())
            }


            if(editTextC3_4_val != 0 && editTextC2_5_val != 0.0) {

                if(checkBoxDis2.isChecked) {

                    editTextC3_6_val = (editTextC3_4_val * editTextC2_5_val) + editTextC3_4_val

                    if(editTextC3_6_val != 0.0 && editTextC2_3_val != 0 && editTextC3_2_val != 0) {
                        editTextC3_6_val = editTextC3_6_val - ((editTextC3_2_val * editTextC2_3_val) / 100)
                    }
                }else{
                    editTextC3_6_val = (editTextC3_4_val * editTextC2_5_val) + editTextC3_4_val
                }

                editTextC3_6.text = formatDecimalToString.format(editTextC3_6_val).toString()

                Log.i("editTextC3_4_val", editTextC3_4_val.toString())
                Log.i("editTextC2_5_val", editTextC2_5_val.toString())

                Log.i("-----editTextC3_6_val", editTextC3_6_val.toString())
            }



            if(editTextC3_6_val != 0.0 && editTextC1_2_val != 0 && editTextC3_2_val != 0) {

                editTextC3_7_val = editTextC3_6_val - (editTextC1_2_val + editTextC3_2_val)

                editTextC3_7.text = formatDecimalToString.format(editTextC3_7_val).toString()

                Log.i("editTextC3_6_val", editTextC3_6_val.toString())
                Log.i("editTextC1_2_val", editTextC1_2_val.toString())

                Log.i("-----editTextC3_7_val", editTextC3_7_val.toString())
            }




        }

        editTextC1_2.afterTextChanged({
            sumAll()
        })

        editTextC1_3.afterTextChanged({
            sumAll()
        })

        editTextC1_3_2.afterTextChanged({
            sumAll()
        })

        editTextC1_5.afterTextChanged({

            sumAll()
        })


        editTextC2_3.afterTextChanged({

            sumAll()
        })

        editTextC2_3_2.afterTextChanged({
            sumAll()
        })

        editTextC2_5.afterTextChanged({

            sumAll()
        })

        editTextC3_2.afterTextChanged({
            sumAll()
        })

        checkBoxDis.setOnCheckedChangeListener { buttonView, isChecked ->
            sumAll()
        }

        checkBoxDis2.setOnCheckedChangeListener { buttonView, isChecked ->
            sumAll()
        }


    }
}
