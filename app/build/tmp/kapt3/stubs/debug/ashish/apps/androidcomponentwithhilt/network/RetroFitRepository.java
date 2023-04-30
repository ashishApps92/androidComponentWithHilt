package ashish.apps.androidcomponentwithhilt.network;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ashish.apps.androidcomponentwithhilt.models.QuoteData;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lashish/apps/androidcomponentwithhilt/network/RetroFitRepository;", "", "api", "Lashish/apps/androidcomponentwithhilt/network/RetrofitApi;", "(Lashish/apps/androidcomponentwithhilt/network/RetrofitApi;)V", "getApi", "()Lashish/apps/androidcomponentwithhilt/network/RetrofitApi;", "liveQuoteData", "Landroidx/lifecycle/LiveData;", "Lashish/apps/androidcomponentwithhilt/models/QuoteData;", "getLiveQuoteData", "()Landroidx/lifecycle/LiveData;", "mutableQuoteData", "Landroidx/lifecycle/MutableLiveData;", "getQuotes", "", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RetroFitRepository {
    @org.jetbrains.annotations.NotNull()
    private final ashish.apps.androidcomponentwithhilt.network.RetrofitApi api = null;
    private final androidx.lifecycle.MutableLiveData<ashish.apps.androidcomponentwithhilt.models.QuoteData> mutableQuoteData = null;
    
    @javax.inject.Inject()
    public RetroFitRepository(@org.jetbrains.annotations.NotNull()
    ashish.apps.androidcomponentwithhilt.network.RetrofitApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ashish.apps.androidcomponentwithhilt.network.RetrofitApi getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<ashish.apps.androidcomponentwithhilt.models.QuoteData> getLiveQuoteData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuotes(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}