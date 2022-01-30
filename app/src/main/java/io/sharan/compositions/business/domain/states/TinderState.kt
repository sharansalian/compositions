package io.sharan.compositions.business.domain.states

import android.app.Person


/**
 * Created by sharan on 30/01/22.
 */
sealed class TinderState {
    object Loading : TinderState()
    data class Success(val persons: List<Person>) : TinderState()
    data class Error(val error: String) : TinderState()
    data class Thr(val error: Throwable) : TinderState()
}
