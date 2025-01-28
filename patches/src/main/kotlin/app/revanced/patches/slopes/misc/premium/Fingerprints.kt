package app.revanced.patches.slopes.misc.premium

import app.revanced.patcher.fingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal val getCurrentSubscriptionType = fingerprint {
    accessFlags(AccessFlags.PUBLIC, AccessFlags.FINAL)
    // returns("Lcom/consumedbycode/slopes/vo/SubscriptionOrigin")
    custom { method, _ ->
        method.name == "getCurrentSubscriptionType"
    }
}

internal val getPassExpiration = fingerprint {
    accessFlags(AccessFlags.PUBLIC, AccessFlags.FINAL)
    // returns("Ljava/time/Instant")
    custom { method, _ ->
        method.name == "getPassExpiration"
    }
}