package ashish.apps.androidcomponentwithhilt.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class CustomInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val request: Request = chain.request()
        // Modify the request here, if desired
        val modifiedRequest: Request = request.newBuilder()
            //.addHeader("Authorization", "Bearer $token")
            .build()
        // Process the request and response
        val response = chain.proceed(modifiedRequest)
        // Modify the response here, if desired
        return response.newBuilder()
            .build()
    }
}