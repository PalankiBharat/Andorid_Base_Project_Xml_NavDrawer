package com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.andoridbaseprojectwithxmlandsidedrawer.data.remote.repository.BasicRepository
import com.example.andoridbaseprojectwithxmlandsidedrawer.ui.fragment.Events.*
import com.example.andoridbaseprojectwithxmlandsidedrawer.utils.network.onError
import com.example.andoridbaseprojectwithxmlandsidedrawer.utils.network.onException
import com.example.andoridbaseprojectwithxmlandsidedrawer.utils.network.onSuccess
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

@HiltViewModel
class BasicViewModel @Inject constructor(
    private val repo:BasicRepository
):ViewModel()
{
    private val _testEvent= MutableSharedFlow<Events>()
    val testEvent: SharedFlow<Events> = _testEvent

    fun sendData(content:String,image: File){
        viewModelScope.launch {
            repo.sendMultipartData(content, image)
                .onSuccess {
                    _testEvent.emit(SuccessEvent(it.message?:""))
                }.onError { _, message ->
                    _testEvent.emit(ErrorEvent(message ?: "Some Unknown Error Occurred"))
                }.onException {
                    _testEvent.emit(
                        ErrorEvent(
                            it.localizedMessage ?: "Some Unknown Error Occurred"
                        )
                    )
                }
        }
    }
    
}
sealed class Events{
    class ErrorEvent(val message:String) : Events()
    class SuccessEvent(val message:String) : Events()
}