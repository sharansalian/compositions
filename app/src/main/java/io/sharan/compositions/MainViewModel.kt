package io.sharan.compositions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import io.sharan.compositions.business.domain.Repository
import io.sharan.compositions.business.domain.model.Person
import io.sharan.compositions.business.domain.states.TinderState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject


/**
 * Created by sharan on 30/01/22.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    private val _state =
        MutableStateFlow<TinderState>(TinderState.Success(emptyList<Person>().toMutableList()))
    val state: StateFlow<TinderState>
        get() = _state


    fun getProfiles() {
        viewModelScope.launch {
            try {
                val base = repository.getTinderProfiles()
                _state.value = TinderState.Success(base.getPersons())
            } catch (e: Exception) {

            }
        }
    }

}