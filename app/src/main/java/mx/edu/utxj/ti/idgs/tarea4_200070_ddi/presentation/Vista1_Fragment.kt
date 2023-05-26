package mx.edu.utxj.ti.idgs.tarea4_200070_ddi.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import mx.edu.utxj.ti.idgs.tarea4_200070_ddi.R


class Vista1_Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_vista1_, container, false)
    }
}