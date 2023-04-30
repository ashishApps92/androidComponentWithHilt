package ashish.apps.androidcomponentwithhilt.network

import ashish.apps.androidcomponentwithhilt.models.QuoteData
import retrofit2.Response
import retrofit2.http.*

interface RetrofitApi {

    @GET("/quotes")
    suspend fun  getQuoteList(@Query("page") page : Int) : Response<QuoteData>
}