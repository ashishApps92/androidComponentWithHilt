package ashish.apps.androidcomponentwithhilt.di

import ashish.apps.androidcomponentwithhilt.network.RetrofitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RetrofitProviderInstance {

    @Singleton
    @Provides
    fun provideRetrofitInstance() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitApiInstance(retrofit: Retrofit) : RetrofitApi {
        return retrofit.create(RetrofitApi::class.java)
    }
}