package com.example.practica1_binance_pedroavilabermudez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class cantidadCriptos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cantidad_criptos)

        val btnComprar = findViewById <Button>(R.id.comprarCriptos)
        val txtCantidad = findViewById <EditText>(R.id.cantidad)
        val txtTarjeta = findViewById <EditText>(R.id.numeroTarjeta)
        val txtFecha = findViewById <EditText>(R.id.fechaCaducidad)
        val txtCvc = findViewById <EditText>(R.id.codigoCvc)


        btnComprar.setOnClickListener {
            if (txtCantidad.text.toString().isEmpty() ||
                txtTarjeta.text.toString().isEmpty() ||
                txtFecha.text.toString().isEmpty() ||
                txtCvc.text.toString().isEmpty())
            {
                AlertDialog.Builder(this)
                    .setTitle("Confirmar compra")
                    .setMessage("Por favor, no deje los campos vacios")
                    .show()
                return@setOnClickListener
            }
                    AlertDialog.Builder(this)
                        .setTitle("Confirmar compra")
                        .setMessage("Estas seguro que quieres comprar ${txtCantidad.text.toString()} criptos")
                        .setPositiveButton("Aceptar",{d,i->
                            AlertDialog.Builder(this)
                                .setMessage("Compra Relaizada con exito")
                                .setTitle("Resultado de transaccion")
                                .setPositiveButton("Aceptar",{d,i->
                                    finish()
                                })
                                .show()
                        })
                        .setNegativeButton("Cancelar",{d,i->})
                        .show()
        }


    }

}