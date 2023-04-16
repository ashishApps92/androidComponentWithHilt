package ashish.apps.androidcomponentwithhilt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ashish.apps.androidcomponentwithhilt.models.QuoteData
import ashish.apps.androidcomponentwithhilt.network.RetroFitRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers


@HiltViewModel
class MainViewModel  @Inject constructor(val repository: RetroFitRepository) : ViewModel() {

    val quoteData : LiveData<QuoteData>
    get() = repository.liveQuoteData

    fun registerUser(page: Int){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getQuotes(1)
        }
    }
}