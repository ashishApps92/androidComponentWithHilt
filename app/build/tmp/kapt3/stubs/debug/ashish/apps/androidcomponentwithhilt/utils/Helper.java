package ashish.apps.androidcomponentwithhilt.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lashish/apps/androidcomponentwithhilt/utils/Helper;", "", "()V", "Companion", "WeekDay", "app_debug"})
public final class Helper {
    @org.jetbrains.annotations.NotNull()
    public static final ashish.apps.androidcomponentwithhilt.utils.Helper.Companion Companion = null;
    
    public Helper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005\u00a8\u0006\u000e"}, d2 = {"Lashish/apps/androidcomponentwithhilt/utils/Helper$WeekDay;", "", "()V", "b", "", "(Ljava/lang/String;)V", "a", "", "getA", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getB", "()Ljava/lang/String;", "setB", "app_debug"})
    public static final class WeekDay {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String b;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Unit a = null;
        
        public WeekDay(@org.jetbrains.annotations.NotNull()
        java.lang.String b) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getB() {
            return null;
        }
        
        public final void setB(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Unit getA() {
            return null;
        }
        
        public WeekDay() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lashish/apps/androidcomponentwithhilt/utils/Helper$Companion;", "", "()V", "hideKeyboard", "", "view", "Landroid/view/View;", "isValidEmail", "", "email", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
        java.lang.String email) {
            return false;
        }
        
        public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
    }
}