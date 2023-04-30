package ashish.apps.androidcomponentwithhilt.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ashish.apps.androidcomponentwithhilt.models.QuoteData
import javax.inject.Inject

class RetroFitRepository @Inject constructor(val api : RetrofitApi) {
    private val mutableQuoteData = MutableLiveData<QuoteData>()

    val liveQuoteData : LiveData<QuoteData>
    get() = mutableQuoteData

    suspend fun getQuotes(page: Int) {
        val response = api.getQuoteList(page)
        if (response.isSuccessful && response.body() != null) {
            mutableQuoteData.postValue(response.body())
        }
    }
}