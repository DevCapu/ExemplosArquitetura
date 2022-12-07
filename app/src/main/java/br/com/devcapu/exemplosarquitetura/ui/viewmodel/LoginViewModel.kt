package br.com.devcapu.exemplosarquitetura.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.devcapu.exemplosarquitetura.domain.model.Curso
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CursoViewModel : ViewModel() {

    private var _cursos = MutableLiveData<List<Curso>>()

    //Observa livedata e a tela reage
    val cursos: LiveData<List<Curso>> = _cursos

    fun buscaTodosOsCursos() {
        Log.d("CursoViewModel", "Buscando todos os cursos...")
    }
}