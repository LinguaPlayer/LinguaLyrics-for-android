package habibkazemi.ir.lingualyrics_android.Log

import android.util.Log

import timber.log.Timber

class CrashReportingTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }
        // TODO: Log to crashLibrary
    }
}
